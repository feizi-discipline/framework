/**
 * Copyright © 2018, LeonKeh
 * <p>
 * All Rights Reserved.
 */

package com.cherry.framework.controller;

import com.cherry.framework.constant.ExceptionConstant;
import com.cherry.framework.constant.JWTConstant;
import com.cherry.framework.exception.BusinessException;
import com.cherry.framework.exception.BusinessExceptionBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类功能描述
 *
 * @author Leon
 * @version 2018/6/13 21:53
 */
@RestController
public class IndexController {

    private static final Logger lg = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    JWTConstant jwtConstant;

    @Autowired
    BusinessExceptionBuilder beb;

    @RequestMapping(value = "/index")
    public String index() throws BusinessException{
        System.out.println("--------------");
        System.out.println(jwtConstant.JWT_HEADERS);
        System.out.println(jwtConstant.JWT_SECERT);
        System.out.println(jwtConstant.JWT_EXPIRETIME);
        System.out.println(jwtConstant.JWT_TOKENHEAD);
        if (1 == 1) {
            throw beb.build(ExceptionConstant.ERROR_CODE_10000);
        }

        return "boot-mybatis";
    }
}
