package com.gyoomi.adam.rbac.model;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/12/11 14:37
 */
@Data
public class Dept implements Serializable {

    private Long id;

    private String name;

    private String nodeNo;

    private String parentNodeNo;

    private Integer createUser;

    private String createUserName;

    private Date createDate;

    private Long updateUser;

    private String updateUserName;

    private Date updateDate;

    private String remark;


}