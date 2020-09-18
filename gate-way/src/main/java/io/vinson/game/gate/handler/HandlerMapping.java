package io.vinson.game.gate.handler;

/**
 * @Description:
 * 消息处理注解
 *
 * @author: jiangweixin
 * @date: 2019/1/25
 */
public @interface HandlerMapping {
    String[] value() default {};
}
