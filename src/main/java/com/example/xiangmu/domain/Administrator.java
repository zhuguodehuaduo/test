package com.example.xiangmu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liurenyi
 * @Date: 1/5/21 4:38 PM
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor   //管理员表 角色表
public class Administrator {
    int aId;
    String aName;
}
