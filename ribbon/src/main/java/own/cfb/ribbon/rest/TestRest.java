package own.cfb.ribbon.rest;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TestRest {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/tr")
    @HystrixCommand(fallbackMethod = "NotExist")
    public String TestExample(@RequestParam("name") String name){
        return restTemplate.getForObject("http://CLIENT/tc?name="+name,String.class);
    }

    public String NotExist(String name){
        return "服务不存在！";
    }
}
