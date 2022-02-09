package com.inossem.auth.controller;

import com.inossem.auth.BaseObject;
import com.inossem.auth.dao.LoginUser;
import com.inossem.auth.dao.SystemUser;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
public class AuthController {


    @Autowired
    RestTemplate restTemplate;
    //IStockFeignService stockFeignService;

    @ApiOperation(value = "登录方法", notes = "根据用户名和密码登陆", tags = { "登录" })
    @RequestMapping(value ="/login", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    BaseObject<LoginUser> login(@RequestBody SystemUser user) {

        System.out.println(user.toString());
        System.out.println("登录成功!");
        String msg = restTemplate.getForObject("http://stock-service/stock/reduct",String.class);
        //String msg = stockFeignService.reduct();
        LoginUser loginUser = new LoginUser();
        loginUser.setMsg("login successful");
        BaseObject<LoginUser> bo = new BaseObject<LoginUser>(loginUser);
        bo.setReturnCode(0);


        return bo;
    }
}
