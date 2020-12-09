package com.csw.userprovider;

import com.csw.userapi.RegisterApi;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

/**
 * TODO (输入本类描述)
 *
 * @author csw
 * @version 1.0
 * @date 2020/12/8 10:37
 */
@RestController
public class UserController implements RegisterApi {
    @Override
    public String alive() {
        return "ok";
    }

    @Override
    public String get(Integer id) {
        return id.toString();
    }

    @Override
    public Map testGetMap(Map map) {
        return Collections.singletonMap(1,"zs");
    }

    @Override
    public String testPost(String name) {
        return name;
    }

    @Override
    public Map testPost2(Map map) {
        return map;
    }
}
