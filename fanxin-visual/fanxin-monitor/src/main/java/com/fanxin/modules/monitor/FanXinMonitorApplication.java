package com.fanxin.modules.monitor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import de.codecentric.boot.admin.server.config.EnableAdminServer;

/**
 * 监控中心
 * 
 * @author fanxin
 */
@EnableAdminServer
@SpringBootApplication
public class FanXinMonitorApplication
{
    public static void main(String[] args)
    {
        SpringApplication.run(FanXinMonitorApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  监控中心启动成功   ლ(´ڡ`ლ)ﾞ  \n" +
                "█████  █   █\n" +
                "█       █ █\n" +
                "████     █\n" +
                "█       █ █\n" +
                "█      █   █\n");
    }
}
