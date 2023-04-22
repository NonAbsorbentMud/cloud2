package own.cfb.feign.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import own.cfb.feign.client.TestClient;

@RestController
public class TestRest {

    @Autowired
    TestClient testClient;

    @RequestMapping("/tf")
    public String testExample(@RequestParam("name") String name){
        return testClient.testExample(name);
    }
}
