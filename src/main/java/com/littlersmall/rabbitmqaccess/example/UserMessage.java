package com.littlersmall.rabbitmqaccess.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by sunHongWei
 */
//for example
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserMessage {
    int id;
    String name;
}
