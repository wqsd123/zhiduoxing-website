package com.zhiduoxing.controller;

import com.zhiduoxing.common.Result;
import com.zhiduoxing.entity.ContactForm;
import com.zhiduoxing.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController  // 标识为接口控制器，返回JSON格式数据
@RequestMapping("/contact")  // 接口二级路径，与前端请求路径对应
public class ContactFormController {

    // 注入业务层对象
    @Autowired
    private ContactFormService contactFormService;

    // 1. 提交咨询表单接口（POST请求，前端表单提交调用此接口）
    @PostMapping("/submit")
    public Result<Integer> submitForm(@RequestBody ContactForm contactForm) {
        // 调用业务层方法，处理表单提交
        return contactFormService.submitForm(contactForm);
    }

    // 2. 查询所有咨询记录接口（GET请求，后端查看记录用，可选）
    @GetMapping("/list")
    public Result<Object> getAllContactForms() {
        return contactFormService.getAllContactForms();
    }
}
