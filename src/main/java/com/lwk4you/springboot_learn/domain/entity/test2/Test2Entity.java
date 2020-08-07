package com.lwk4you.springboot_learn.domain.entity.test2;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("test2")
public class Test2Entity {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private String address;

    private Integer sex;



}
