package com.xiaoxuezha;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Description：
 *
 * @author wangying
 * @date 2019/3/28
 */
public interface AccountDAO extends JpaRepository<Account,Long> {

    Account findByUserId(String userId);

}
