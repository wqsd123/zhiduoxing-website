-- 1. 创建数据库（名称与后端配置一致，不可随意修改）
CREATE DATABASE IF NOT EXISTS zhiduoxing_website
    DEFAULT CHARACTER SET utf8mb4
    COLLATE utf8mb4_unicode_ci;

-- 2. 切换到该数据库
USE zhiduoxing_website;

-- 3. 创建咨询表单表（核心表，存储前端提交的咨询数据）
CREATE TABLE IF NOT EXISTS contact_form (
                                            id INT PRIMARY KEY AUTO_INCREMENT COMMENT '自增主键',
                                            name VARCHAR(50) NOT NULL COMMENT '咨询人姓名',
                                            phone VARCHAR(20) NOT NULL COMMENT '咨询人电话',
                                            content TEXT NOT NULL COMMENT '咨询内容',
                                            create_time DATETIME DEFAULT CURRENT_TIMESTAMP COMMENT '提交时间',
                                            is_processed TINYINT(1) DEFAULT 0 COMMENT '是否处理'
) DEFAULT CHARSET=utf8mb4 COMMENT='厦门智多星官网咨询表单提交记录';

-- 4. 插入测试数据（可选，用于调试接口，直接执行即可看到效果）
INSERT INTO contact_form (name, phone, content)
VALUES
    ('张三', '13800138000', '咨询高纯锡粉99.9%的报价，批量采购有优惠吗？'),
    ('李四', '13900139000', '想定制100μm粒径的球形锡粉，询问生产交期和最小起订量'),
    ('王五', '13700137000', '咨询锡粉的应用场景，是否适合新能源电池生产');

-- 备注：基础版仅需此表，后续扩展功能（如新闻、产品）可新增表，不影响当前功能