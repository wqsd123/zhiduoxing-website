package com.zhiduoxing.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zhiduoxing.common.Result;
import com.zhiduoxing.entity.ContactForm;
import com.zhiduoxing.mapper.ContactFormMapper;
import com.zhiduoxing.service.ContactFormService;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service  // 标识为业务层组件
public class ContactFormServiceImpl extends ServiceImpl<ContactFormMapper, ContactForm> implements ContactFormService {

    // 提交咨询表单实现
    @Override
    public Result<Integer> submitForm(ContactForm contactForm) {
        try {
            // 数据校验（避免空值）
            if (contactForm.getName() == null || contactForm.getName().trim().isEmpty()) {
                return Result.fail("姓名不能为空");
            }
            if (contactForm.getPhone() == null || contactForm.getPhone().trim().isEmpty()) {
                return Result.fail("电话不能为空");
            }
            if (contactForm.getContent() == null || contactForm.getContent().trim().isEmpty()) {
                return Result.fail("咨询内容不能为空");
            }
            // 自动设置提交时间（无需前端传递）
            contactForm.setCreateTime(new Date());
            // 自动设置未处理状态
            contactForm.setIsProcessed(0);
            // 存入数据库（MyBatis-Plus的save方法）
            boolean save = this.save(contactForm);
            if (save) {
                // 返回新增记录的ID，供前端参考
                return Result.success(contactForm.getId());
            } else {
                return Result.fail("表单提交失败，请稍后再试");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("服务器内部错误，提交失败");
        }
    }

    // 查询所有咨询记录实现
    @Override
    public Result<Object> getAllContactForms() {
        try {
            // 查询所有记录，按提交时间倒序（最新的在前面）
            return Result.success(this.list());
        } catch (Exception e) {
            e.printStackTrace();
            return Result.error("查询失败，请稍后再试");
        }
    }
}
