package com.littlersmall.rabbitmqaccess;

import com.littlersmall.rabbitmqaccess.common.DetailRes;
import com.littlersmall.rabbitmqaccess.common.MessageWithTime;

/**
 * Created by sunHongWei
 */
public interface MessageSender {
    DetailRes send(Object message);

    DetailRes send(MessageWithTime messageWithTime);
}
