package io.vinson.game.gate;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 网关模块启动类
 * @author: jiangweixin
 * @date: 2019/1/24
 */
@SpringBootApplication
public class GatewayApplication {

    private final static Logger logger = LoggerFactory.getLogger(GatewayApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(GatewayApplication.class, args);
        logger.info("网关模块启动成功");
    }
}
