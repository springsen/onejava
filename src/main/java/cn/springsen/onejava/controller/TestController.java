package cn.springsen.onejava.controller;

import cn.springsen.onejava.common.lang.Result;
import cn.springsen.onejava.service.SysUserService;
import jdk.internal.dynalink.support.NameCodec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
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

    @PreAuthorize("hasAnyRole('admin')")
    @GetMapping("/password")
    public Result pass() {

        // 加密后密码

        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

        String password = bCryptPasswordEncoder.encode("111111");

        boolean matches = bCryptPasswordEncoder.matches("111111", password);

        System.out.println("匹配结果：" + matches);

        return Result.succ(password);
    }


}
