package love.tanyiqu.jcrawler;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class JCrawler {


    public static String get(String url, String charset, Map<String, String> params, Map<String, String> headers) throws IOException {
        String html = "";
        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 创建HttpGet对象
        HttpGet httpGet = new HttpGet(url);

        // 设置header
        // todo

        // 设置参数
        // todo

        // 使用HttpClient发送请求
        CloseableHttpResponse response = httpClient.execute(httpGet);

        // 解析响应
        if (response.getStatusLine().getStatusCode() == 200) {
            html = EntityUtils.toString(response.getEntity(), "utf8");
        }

        // 释放资源
        response.close();
        httpClient.close();

        return html;
    }


    @Test
    public void test() throws IOException {
        String charset = "";
        Map<String, String> params = new HashMap<String, String>();

        Map<String, String> headers = new HashMap<String, String>();

        String html = JCrawler.get("http://www.tanyiqu.top", charset, params, headers);

        System.out.println(html);
    }

}
