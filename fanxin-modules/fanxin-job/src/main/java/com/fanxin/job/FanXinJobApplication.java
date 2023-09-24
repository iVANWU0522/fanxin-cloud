package com.fanxin.job;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.fanxin.common.security.annotation.EnableCustomConfig;
import com.fanxin.common.security.annotation.EnableRyFeignClients;
import com.fanxin.common.swagger.annotation.EnableCustomSwagger2;

/**
 * 定时任务
 * 
 * @author fanxin
 */
@EnableCustomConfig
@EnableCustomSwagger2
@EnableRyFeignClients   
@SpringBootApplication
public class FanXinJobApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanXinJobApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  定时任务模块启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "█████  █   █\n" +
                "█       █ █\n" +
                "████     █\n" +
                "█       █ █\n" +
                "█      █   █\n");
    }
}
