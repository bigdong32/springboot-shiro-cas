package com.wds.springboot.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

/**
 * 用户entity
 *
 * Created by wuds on 2017/7/27.
 */
@Entity
@Table(name = "u_user")
@Setter
@Getter
public class UUser extends BaseId{

    private static final long serialVersionUID = -3325021786720395924L;

    // 昵称
    private String nickname;

    // 邮箱 | 登录帐号
    private String email;

    // 密码
    private String pswd;

    // 创建时间
    private Date createTime;

    // 最后登录时间
    private Date lastLoginTime;

    // 1:有效，0:禁止登录
    private Long status;
}
