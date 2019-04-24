package com.xiaoxuezha;


import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description：
 *
 * @author wangying
 * @date 2019-04-24
 */
@Service
public class BusinessService {

    @Autowired
    private StorageFeignClient storageFeignClient;
    @Autowired
    private OrderFeignClient orderFeignClient;

    @GlobalTransactional
    public void purchase(String userId, String commodityCode, int orderCount){

        orderFeignClient.create(userId, commodityCode, orderCount);
        storageFeignClient.deduct(commodityCode, orderCount);


    }
}
