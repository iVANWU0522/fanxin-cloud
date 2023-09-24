package com.fanxin.gen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fanxin.common.security.annotation.EnableCustomConfig;
import com.fanxin.common.security.annotation.EnableRyFeignClients;
import com.fanxin.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 代码生成
 * 
 * @author fanxin
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients
@SpringBootApplication
public class FanXinGenApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanXinGenApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  代码生成模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "█████  █   █\n" +
                "█       █ █\n" +
                "████     █\n" +
                "█       █ █\n" +
                "█      █   █\n");
    }
}
