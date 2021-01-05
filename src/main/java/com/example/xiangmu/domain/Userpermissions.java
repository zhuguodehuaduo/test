package com.example.xiangmu.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: liurenyi
 * @Date: 1/5/21 4:43 PM
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor   //用户权限表
public class Userpermissions {
    int userpermissionsId;
    int uId;
    int pId;
}
