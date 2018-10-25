package com.example.travisclispringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: luotao
 * Date: 2018/10/25
 * Time: 下午4:44
 * To change this template use File | Settings | File Templates.
 */
@RestController
public class IndexCtronller {
    @RequestMapping("/")
    public String index(){
        return "hello";
    }
}
