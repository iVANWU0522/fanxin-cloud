package com.fanxin.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fanxin.common.security.annotation.EnableCustomConfig;
import com.fanxin.common.security.annotation.EnableRyFeignClients;
import com.fanxin.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 系统模块
 * 
 * @author fanxin
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class FanXinSystemApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanXinSystemApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  系统模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "█████  █   █\n" +
                "█       █ █\n" +
                "████     █\n" +
                "█       █ █\n" +
                "█      █   █\n");
    }
}
