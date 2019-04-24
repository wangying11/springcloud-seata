package com.xiaoxuezha;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * Description：
 *
 * @author wangying
 * @date 2019-04-24
 */
@FeignClient(name = "user-service",url = "127.0.0.1:8083")
public interface UserFeignClient {

    @GetMapping("/debit")
    Boolean debit(@RequestParam String userId,@RequestParam BigDecimal money);
}
