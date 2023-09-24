package com.fanxin.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 网关启动程序
 * 
 * @author fanxin
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class FanXinGatewayApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanXinGatewayApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  凡馨网关启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "█████  █   █\n" +
                "█       █ █\n" +
                "████     █\n" +
                "█       █ █\n" +
                "█      █   █\n");
    }
}
