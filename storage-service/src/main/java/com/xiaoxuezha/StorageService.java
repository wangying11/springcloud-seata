package com.xiaoxuezha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Description：
 *
 * @author wangying
 * @date 2019-04-24
 */
@Service
public class StorageService {

    @Autowired
    private StorageDAO storageDAO;

    @Transactional
    public void deduct(String commodityCode, int count){
        Storage storage = storageDAO.findByCommodityCode(commodityCode);
        storage.setCount(storage.getCount()-count);

        storageDAO.save(storage);
        if (count==2){
            throw new RuntimeException("storage branch exception");
        }
    }
}
