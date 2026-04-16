package com.zhiduoxing.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zhiduoxing.entity.ContactForm;
import org.springframework.stereotype.Repository;

// BaseMapper包含CRUD所有方法（新增、查询、修改、删除），无需手动编写
@Repository  // 标识为持久层组件，让Spring识别
public interface ContactFormMapper extends BaseMapper<ContactForm> {
}
