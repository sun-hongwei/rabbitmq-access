package com.littlersmall.rabbitmqaccess;

import com.littlersmall.rabbitmqaccess.common.DetailRes;

/**
 * Created by sunHongWei
 */
public interface MessageConsumer {
    DetailRes consume();
}
