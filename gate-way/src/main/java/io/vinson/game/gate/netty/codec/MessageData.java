package io.vinson.game.gate.netty.codec;

/**
 * @author: jiangweixin
 * @date: 2020/1/16
 */
public class MessageData {

    public static final int MSG_MIN_LENGTH = 5;
    public static final int MSG_MAX_LENGTH = 2048;

    private final int cmd;
    private final byte[] buff;

    public MessageData(int cmd, byte[] buff) {
        this.cmd = cmd;
        this.buff = buff;
    }

}
