package com.yyh.handler;

import com.yyh.service.ApiService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author YanYuHang
 * @create 2019-04-12-13:44
 */
@RestController
public class ApiHandler {

    @Resource
    private ApiService apiService;

    @RequestMapping("index")
    public String index() {
        return apiService.index();
    }

}
