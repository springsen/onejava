package cn.springsen.onejava.controller;

import cn.springsen.onejava.service.SysUserService;
import cn.springsen.onejava.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

public class BaseController {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    HttpServletRequest req;

    @Autowired
    SysUserService sysUserService;
}
