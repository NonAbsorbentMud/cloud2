package own.cfb.feign.client.impl;

import org.springframework.stereotype.Component;
import own.cfb.feign.client.TestClient;

@Component
public class HystrixServiceImpl implements TestClient {
    @Override
    public String testExample(String name) {
        return "feign:服务不存在！";
    }
}
