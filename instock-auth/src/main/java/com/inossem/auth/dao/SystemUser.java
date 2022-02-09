package com.inossem.auth.dao;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value="com.inossem.wms.model.sys.SysUser", description="用户信息对象")
public class SystemUser {

    @ApiModelProperty(value = "用户名称", name = "userName", example = "测试添加", required = true)
    private String userName;

    @ApiModelProperty(value = "用户密码", name = "password", example = "123456", required = true)
    private String password;

    @ApiModelProperty(value = "组织ID", name = "orgCode", example = "0", required = true)
    private String orgCode;

}
