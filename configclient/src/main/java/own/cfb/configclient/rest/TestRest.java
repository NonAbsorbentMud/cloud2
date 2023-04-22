package own.cfb.configclient.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestRest {

    @Value("${url}")
    String url;

    @RequestMapping("/getUrl")
    public String testExample(){
        return url;
    }
}
