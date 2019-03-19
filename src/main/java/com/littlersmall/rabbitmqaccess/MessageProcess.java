package com.littlersmall.rabbitmqaccess;


import com.littlersmall.rabbitmqaccess.common.DetailRes;

/**
 * Created by sunHongWei
 */
public interface MessageProcess<T> {
    DetailRes process(T message);
}
