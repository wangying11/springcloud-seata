package com.xiaoxuezha;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description：
 *
 * @author wangying
 * @date 2019-04-24
 */
public interface StorageDAO extends JpaRepository<Storage, String> {

    Storage findByCommodityCode(String commodityCode);

}
