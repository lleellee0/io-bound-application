package class101.foo.io;

import org.apache.http.HttpHost;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class ElasticsearchConfig {
    @Value("#{'${spring.data.elasticsearch.hosts}'.split(',')}")
    private List<String> hosts;

    @Value("${spring.data.elasticsearch.port}")
    private int port;

    @Bean
    public RestHighLevelClient getRestClient() {

        List<HttpHost> hostList = new ArrayList<>();
        for (String host : hosts) {
            hostList.add(new HttpHost(host, port, "http"));
        }

        RestClientBuilder builder = RestClient.builder(hostList.toArray(new HttpHost[hostList.size()]));
        return new RestHighLevelClient(builder);
    }
}