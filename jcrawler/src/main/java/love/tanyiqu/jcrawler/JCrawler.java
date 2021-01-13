package love.tanyiqu.jcrawler;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

public class JCrawler {

    public static String get(String url, String charset) throws IOException, URISyntaxException {
        return JCrawler.get(url, charset, new HashMap<String, String>());
    }

    public static String get(String url, String charset, Map<String, String> params) throws IOException, URISyntaxException {
        return JCrawler.get(url, charset, params, new HashMap<String, String>());
    }

    public static String get(String url, String charset, Map<String, String> params, Map<String, String> headers) throws IOException, URISyntaxException {
        String html = "";
        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 设置参数
        // 创建URIBuilder
        URIBuilder uriBuilder = new URIBuilder(url);

        // 设置参数
        for (Map.Entry<String, String> entry : params.entrySet()) {
            uriBuilder = uriBuilder.setParameter(entry.getKey(), entry.getValue());
        }

        HttpGet httpGet = new HttpGet(uriBuilder.build());

        System.out.println("httpGet：" + httpGet);

        // 设置header
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpGet.setHeader(entry.getKey(), entry.getValue());
        }

        // 使用HttpClient发送请求
        CloseableHttpResponse response = httpClient.execute(httpGet);

        // 解析响应
        if (response.getStatusLine().getStatusCode() == 200) {
            html = EntityUtils.toString(response.getEntity(), charset);
        }

        // 释放资源
        response.close();
        httpClient.close();

        return html;
    }


    @Test
    public void test() throws IOException, URISyntaxException {
        /*
        String charset = "utf8";
        Map<String, String> params = new HashMap<String, String>();
        params.put("tt", "123456");
        params.put("ee", "987654");

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("User-Agent", "my user-agent");

        String html = JCrawler.get("http://www.tanyiqu.top", charset, params, headers);

        System.out.println(html);
        */

        System.out.println(JCrawler.get("http://www.tanyiqu.top", "utf8"));
    }

}
