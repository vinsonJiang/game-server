package io.vinson.game.gate.netty.codec;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;

import java.util.List;

/**
 * @author: jiangweixin
 * @date: 2020/1/16
 */
public class MessageDataDecoder extends MessageToMessageDecoder<ByteBuf> {
    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf byteBuf, List<Object> list) throws Exception {
        int msgLength = byteBuf.readableBytes();
        if (msgLength < MessageData.MSG_MIN_LENGTH || msgLength > MessageData.MSG_MAX_LENGTH) {
            return ;
        }

        int cmd = byteBuf.readInt();
        byte[] data = null;
        int dataLength = msgLength - 4;
        if(dataLength > 0) {
            data = new byte[dataLength];
            byteBuf.readBytes(data);
        }
        MessageData message=new MessageData(cmd, data);
        list.add(message);
    }
}
