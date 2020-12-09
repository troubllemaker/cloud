package com.csw.userconsumer;

import com.csw.userapi.RegisterApi;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

/**
 * TODO (输入本类描述)
 *
 * @author csw
 * @version 1.0
 * @date 2020/12/7 19:15
 */
@FeignClient(name = "USER-PROVIDER")
public interface UserConsumerService extends RegisterApi {


}
