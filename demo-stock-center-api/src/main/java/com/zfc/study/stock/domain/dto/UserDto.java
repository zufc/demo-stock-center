package com.zfc.study.stock.domain.dto;

import cn.afterturn.easypoi.excel.annotation.Excel;
import cn.afterturn.easypoi.excel.annotation.ExcelTarget;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author zufeichao
 * @ProjectName
 * @Description TODO
 * @Date
 **/
@Data
public class UserDto implements Serializable {

    private static final long serialVersionUID = 7908712073869580485L;
    private String id;
    private String  userId;
    private String userName;
    private String password;
    private Integer age;

}
