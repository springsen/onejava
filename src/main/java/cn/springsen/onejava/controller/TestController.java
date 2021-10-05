package cn.springsen.onejava.controller;

import cn.springsen.onejava.common.lang.Result;
import cn.springsen.onejava.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    SysUserService sysUserService;

    @GetMapping("/test")
    public Result test() {
        return Result.succ(sysUserService.list());
    }

    @GetMapping("/testFail")
    public Result testFail() throws Exception {
        throw new RuntimeException("异常测试");
    }
}
