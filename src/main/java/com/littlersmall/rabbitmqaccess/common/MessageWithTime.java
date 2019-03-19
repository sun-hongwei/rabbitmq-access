package com.littlersmall.rabbitmqaccess.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sunHongWei
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class MessageWithTime {
    private long id;
    private long time;
    private Object message;
}
