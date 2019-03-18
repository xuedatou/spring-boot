/**
 * Copyright (C), 2018-2018, 北京圣博润高新技术股份有限公司
 * FileName: hellowSprongBoot
 * Author:   xue
 * Date:     2018/12/19 14:45
 */
package com.hml.demo.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * @author xue
 * @create 2018/12/19
 * @since 1.0.0
 */
@RestController
@RequestMapping(value = "/xxd")
public class hellowSprongBoot {
    @RequestMapping(value = "/hml")
    public Object helloWorld(){
        return JuniltTest.a == Test2.string;
    }

    public void test(){
        System.out.println(JuniltTest.a == Test2.string);
    }
}
