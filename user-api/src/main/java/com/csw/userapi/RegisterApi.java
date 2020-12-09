package com.csw.userapi;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * TODO (输入本类描述)
 *
 * @author csw
 * @version 1.0
 * @date 2020/12/7 18:59
 */
@RequestMapping("/user")
public interface RegisterApi {
    @GetMapping("/alive")
    public String alive();
    @GetMapping("/get")
    String get(@RequestParam("id") Integer id);
    @GetMapping("/testGetMap")
    Map testGetMap(@RequestParam Map map);

    @PostMapping("testPost")
    String testPost(@RequestBody String name);
    @PostMapping("testPost2")
    Map testPost2(@RequestBody Map map);
}
