package com.example.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 采购员信息
 * @Author: admin
 * @Date: 2020/9/24 17:19
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConsigneeInfo {

    private String consigneeName;

    private String consigneePhone;

    private String consigneeAddr;
}
