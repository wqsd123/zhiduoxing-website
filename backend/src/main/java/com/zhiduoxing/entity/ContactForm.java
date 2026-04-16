package com.zhiduoxing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data  // Lombok注解，自动生成getter/setter/toString
@TableName("contact_form")  // 关联数据库表名
public class ContactForm {

    @TableId(type = IdType.AUTO)  // 自增主键，与数据库id字段对应
    private Integer id;

    private String name;  // 咨询人姓名，与数据库name字段对应

    private String phone;  // 咨询人电话，与数据库phone字段对应

    private String content;  // 咨询内容，与数据库content字段对应

    private Date createTime;  // 提交时间，与数据库create_time字段对应（下划线转驼峰）

    private Integer isProcessed;  // 是否处理，与数据库is_processed字段对应
}
