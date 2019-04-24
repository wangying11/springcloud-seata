package com.xiaoxuezha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 *
 * @author wangying
 * @date 2019-04-24
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/create")
    public Boolean create(String userId,String commodityCode, Integer count){

        orderService.create(userId, commodityCode, count);
        return true;
    }

}
