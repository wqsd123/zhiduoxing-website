<template>
  <div class="contact-page">
    <div class="contact-banner">
      <img src="/images/contact-banner.jpg" alt="联系我们">
      <div class="contact-banner-text">
        <h2>联系我们</h2>
        <p>您的需求，我们用心倾听；您的疑问，我们及时解答</p>
      </div>
    </div>

    <section class="contact-content">
      <div class="container">
        <div class="contact-wrap">
          <div class="contact-info">
            <div class="section-title">
              <h2>联系方式</h2>
              <p>欢迎随时联系我们，获取专属解决方案</p>
            </div>
            <div class="contact-info-list">
              <div class="contact-info-item">
                <div class="contact-icon">
                  <img src="/images/icon/address.png" alt="公司地址">
                </div>
                <div class="contact-text">
                  <h3>公司地址</h3>
                  <p>福建省厦门市翔安区翔安科技园区XX路XX号</p>
                </div>
              </div>
              <div class="contact-info-item">
                <div class="contact-icon">
                  <img src="/images/icon/phone.png" alt="联系电话">
                </div>
                <div class="contact-text">
                  <h3>联系电话</h3>
                  <p>0592-XXXXXXX</p>
                  <p>138-XXXX-XXXX（李经理）</p>
                </div>
              </div>
              <div class="contact-info-item">
                <div class="contact-icon">
                  <img src="/images/icon/email.png" alt="电子邮箱">
                </div>
                <div class="contact-text">
                  <h3>电子邮箱</h3>
                  <p>zhiduoxing@xmzdx.com</p>
                </div>
              </div>
              <div class="contact-info-item">
                <div class="contact-icon">
                  <img src="/images/icon/time.png" alt="工作时间">
                </div>
                <div class="contact-text">
                  <h3>工作时间</h3>
                  <p>周一至周五：9:00-18:00（节假日除外）</p>
                </div>
              </div>
            </div>
          </div>

          <div class="contact-form">
            <!-- 引入联系表单组件 -->
            <ContactForm />
          </div>
        </div>
      </div>
    </section>

    <!-- 地图嵌入（静态展示，可替换为百度/高德地图） -->
    <section class="contact-map">
      <img src="/images/map.jpg" alt="公司位置地图">
    </section>
  </div>
</template>

<script setup>
// 引入联系表单组件
import ContactForm from '@/components/ContactForm.vue'
</script>

<style scoped>
/* 联系我们页面样式 */
.contact-banner {
  width: 100%;
  height: 300px;
  position: relative;
  margin-top: 80px;
}

.contact-banner img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.contact-banner-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: #fff;
  text-align: center;
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
}

.contact-banner-text h2 {
  font-size: 36px;
  margin-bottom: 10px;
}

.contact-banner-text p {
  font-size: 18px;
}

.contact-content {
  padding: 80px 0;
  background-color: #fff;
}

.contact-wrap {
  display: flex;
  gap: 40px;
  align-items: flex-start;
}

.contact-info {
  width: 45%;
}

.contact-info-list {
  margin-top: 40px;
}

.contact-info-item {
  display: flex;
  gap: 20px;
  margin-bottom: 30px;
  align-items: flex-start;
}

.contact-icon {
  width: 50px;
  height: 50px;
  background-color: #f0f7ff;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  flex-shrink: 0;
}

.contact-icon img {
  width: 25px;
  height: 25px;
}

.contact-text h3 {
  font-size: 18px;
  color: #333;
  margin-bottom: 10px;
}

.contact-text p {
  font-size: 14px;
  color: #666;
  line-height: 1.6;
  margin-bottom: 5px;
}

.contact-form {
  width: 55%;
  background-color: #f9f9f9;
  padding: 30px;
  border-radius: 8px;
}

.contact-map {
  width: 100%;
  height: 400px;
  overflow: hidden;
}

.contact-map img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .contact-banner {
    height: 200px;
  }
  .contact-banner-text h2 {
    font-size: 28px;
  }
  .contact-wrap {
    flex-direction: column;
  }
  .contact-info,
  .contact-form {
    width: 100%;
  }
  .contact-content {
    padding: 40px 0;
  }
  .contact-map {
    height: 300px;
  }
}

@media (max-width: 480px) {
  .contact-banner-text h2 {
    font-size: 22px;
  }
  .contact-banner-text p {
    font-size: 16px;
  }
  .contact-form {
    padding: 20px;
  }
  .contact-map {
    height: 250px;
  }
}
</style>