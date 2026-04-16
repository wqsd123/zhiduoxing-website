package com.zhiduoxing.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zhiduoxing.entity.ContactForm;
import com.zhiduoxing.common.Result;

// IService包含BaseMapper所有方法，还扩展了批量操作等方法
public interface ContactFormService extends IService<ContactForm> {
    // 提交咨询表单（自定义方法，处理表单提交逻辑）
    Result<Integer> submitForm(ContactForm contactForm);

    // 查询所有咨询记录（用于后端查看，可选）
    Result<Object> getAllContactForms();
}
