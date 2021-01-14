package love.tanyiqu.jcrawler.methods;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings({"DuplicatedCode", "unused"})
public class JCrawlerHttpPost {

    public String getHtml(String url, String charset) throws IOException {
        return getHtml(url, charset, new HashMap<String, String>());
    }

    public String getHtml(String url, String charset, Map<String, String> params) throws IOException {
        return getHtml(url, charset, params, new HashMap<String, String>());
    }

    public String getHtml(String url, String charset, Map<String, String> params, Map<String, String> headers) throws IOException {
        String html = "";

        // 创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();

        // 创建httpPost对象，设置url
        HttpPost httpPost = new HttpPost(url);

        // 设置参数
        List<NameValuePair> formParams = new ArrayList<NameValuePair>();
        for (Map.Entry<String, String> entry : params.entrySet()) {
            formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }

        // 创建表单的entity的对象
        UrlEncodedFormEntity formEntity = new UrlEncodedFormEntity(formParams, "utf8");
        // 设置表单的entity对象到post请求中
        httpPost.setEntity(formEntity);

        // 设置headers
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            httpPost.setHeader(entry.getKey(), entry.getValue());
        }

        // 使用HttpClient发送请求
        CloseableHttpResponse response = httpClient.execute(httpPost);

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
    public void testPost() throws IOException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("submit", "search");
        params.put("wd", "你的名字");

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("User-Agent", "my user-agent");

        String html = getHtml("http://www.zuidazy4.com/index.php?m=vod-search", "utf8", params, headers);
        System.out.println(html);

//        System.out.println(getHtml("http://www.tanyiqu.top", "utf8"));

    }

}
