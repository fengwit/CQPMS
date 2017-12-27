package com.cqpms.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Author: Fwei
 * Date: 2017/11/20 14:40
 * Description: todo用一句话描述该文件做什么
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String username;
    private String password;
    private String email;
}
