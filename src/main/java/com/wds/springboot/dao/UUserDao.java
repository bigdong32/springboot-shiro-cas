package com.wds.springboot.dao;

import com.wds.springboot.entity.UUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 用户dao接口
 *
 * Created by wuds on 2017/7/27.
 */
public interface UUserDao extends JpaRepository<UUser, Long> {
}
