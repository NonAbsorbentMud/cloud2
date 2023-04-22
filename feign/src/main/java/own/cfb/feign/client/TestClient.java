package own.cfb.feign.client;

import com.netflix.ribbon.proxy.annotation.Hystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import own.cfb.feign.client.impl.HystrixServiceImpl;


@FeignClient(value="client",fallback = HystrixServiceImpl.class)
public interface TestClient {

    @RequestMapping("/tc")
    public String testExample(@RequestParam("name") String name);
}
