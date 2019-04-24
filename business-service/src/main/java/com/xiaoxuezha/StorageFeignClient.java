package com.xiaoxuezha;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description：
 *
 * @author wangying
 * @date 2019-04-24
 */
@FeignClient(name ="storage-service", url = "127.0.0.1:8081")
public interface StorageFeignClient {

    @GetMapping("/deduct")
    void deduct(@RequestParam String commodityCode,@RequestParam Integer count);

}
