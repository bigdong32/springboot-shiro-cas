package com.wds.springboot.entity;

import lombok.extern.log4j.Log4j;
import com.wds.springboot.utils.SnowflakeIdWorker;

import javax.persistence.PrePersist;

/**
 * id监听
 *
 * Created by wuds on 2017/7/27.
 */
@Log4j
public class IdListener {

    @PrePersist
    private void prePersist(Object object){
        if(object instanceof BaseId){
            BaseId baseId = (BaseId) object;
            if(baseId.getId() == null){
                baseId.setId(SnowflakeIdWorker.getUniqueId());
            }
        }
    }
}
