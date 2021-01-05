package com.example.xiangmu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liurenyi
 * @Date: 1/5/21 4:37 PM
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor   //权限表
public class Permissions {
    int pId;
    String pName;
}
