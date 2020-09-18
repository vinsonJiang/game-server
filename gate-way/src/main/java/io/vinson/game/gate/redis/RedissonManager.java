package io.vinson.game.gate.redis;

import org.redisson.api.RedissonClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @author: jiangweixin
 * @date: 2019/1/25
 */
public class RedissonManager {

    private static final Logger logger = LoggerFactory.getLogger(RedissonManager.class);

    private static RedissonClient redissonClient;

    private RedissonManager() {

    }

    public RedissonClient getRedissonClient() {
        return redissonClient;
    }
}
