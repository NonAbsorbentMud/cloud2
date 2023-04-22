package own.cfb.client.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRest {

    @Value("${server.port}")
    String port;

    @RequestMapping("/tc")
    public String TestExample(@RequestParam("name") String name){
        return port+"----"+name;
    }
}
