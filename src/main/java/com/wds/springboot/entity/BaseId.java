package com.wds.springboot.entity;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import com.wds.springboot.serializer.BaseIdSerializer;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * 表的基础字段Id类
 *
 * Created by wuds on 2017/7/27.
 */
@MappedSuperclass
@EntityListeners(BaseId.class)
@DynamicInsert
@DynamicUpdate
public class BaseId implements Serializable{

    private static final long serialVersionUID = 5705845648056513680L;

    // 主键
    protected Long id;

    @Id
    @Column(name = "Id")
    @JsonSerialize(using = BaseIdSerializer.class)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
