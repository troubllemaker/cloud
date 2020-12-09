package com.csw.userconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
/**
 * TODO (输入本类描述)
 *
 * @author csw
 * @version 1.0
 * @date 2020/12/7 19:13
 */

@RestController
@RequestMapping("/user")
public class UserConsumerApi {
    @Autowired
    private UserConsumerService userConsumerService;

    @GetMapping("/isAlive")
    public String isAlive(){
        String str = userConsumerService.alive();
        return str;
    }

    @GetMapping("/testGet")
    public String testGet(Integer id){
        String str = userConsumerService.get(id);
        return str;
    }
    @GetMapping("/testGetMap1")
    public Map testGetMap(@RequestParam Map map){
        Map resultMap = userConsumerService.testGetMap(map);
        return resultMap;
    }
    @GetMapping("/testPost1")
    public String testPost(String name){
        return userConsumerService.testPost(name);
    }
    @GetMapping("/testPost2")
    public Map testPost2(@RequestParam Map map){
        return userConsumerService.testPost2(map);
    }




}
