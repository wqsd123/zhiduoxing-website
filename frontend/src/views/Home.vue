<template>
  <div class="home-page">
    <!-- 引入Banner组件 -->
    <Banner />

    <!-- 公司简介 -->
    <section class="about-section">
      <div class="container">
        <div class="section-title">
          <h2>关于智多星</h2>
          <p>专注高纯锡粉研发生产，打造行业标杆</p>
        </div>
        <div class="about-content">
          <div class="about-left">
          <!-- 注意：请确保 public/images/about.jpg 路径下有图片，否则会报404 -->
          <img src="/images/about.jpg" alt="公司简介">
        </div>
        <div class="about-right">
          <h3>厦门智多星新材料科技有限公司</h3>
          <p>成立于XXXX年，坐落于厦门翔安科技园区，是一家集研发、生产、销售于一体的高新技术企业，专注于高纯锡粉、金属粉末材料的研发与应用。</p>
          <p>公司拥有先进的生产设备和专业的研发团队，可生产99.9%-99.99%不同纯度的锡粉，粒径可定制10-250μm，产品广泛应用于新能源电池、电子封装、3D打印、化工催化等领域。</p>
          <p>我们始终坚持“质量为本、客户至上”的理念，为全球客户提供高品质的产品和完善的售后服务，赢得了行业内的广泛认可。</p>
          <router-link to="/about" class="btn btn-outline" style="margin-top: 20px;">了解更多</router-link>
        </div>
      </div>
  </div>
  </section>

  <!-- 产品展示 -->
  <section class="product-section">
    <div class="container">
      <div class="section-title">
        <h2>产品中心</h2>
        <p>高品质锡粉，满足不同领域需求</p>
      </div>
      <div class="product-list">
        <div class="product-item">
          <!-- 注意：请确保 public/product/tin-powder.jpg 路径下有图片 -->
          <img src="/product/tin-powder.jpg" alt="高纯锡粉99.9%">
          <h3>高纯锡粉（99.9%）</h3>
          <p>纯度99.9%，粒径20-50μm，适用于电子封装、化工催化</p>
          <router-link to="/product" class="btn btn-outline">查看详情</router-link>
        </div>
        <div class="product-item">
          <img src="/product/tin-powder.jpg" alt="高纯锡粉99.99%">
          <h3>高纯锡粉（99.99%）</h3>
          <p>纯度99.99%，粒径10-30μm，适用于新能源电池、精密电子</p>
          <router-link to="/product" class="btn btn-outline">查看详情</router-link>
        </div>
        <div class="product-item">
          <img src="/product/tin-powder.jpg" alt="定制化锡粉">
          <h3>定制化锡粉</h3>
          <p>按需定制纯度、粒径，适配特殊行业场景需求</p>
          <router-link to="/product" class="btn btn-outline">查看详情</router-link>
        </div>
      </div>
    </div>
  </section>

  <!-- 在线咨询 -->
  <section class="contact-section">
    <div class="container">
      <!-- 引入联系表单组件 -->
      <ContactForm />
    </div>
  </section>
  </div>
</template>

<script setup>
// 引入组件
import Banner from '@/components/Banner.vue'
import ContactForm from '@/components/ContactForm.vue'
</script>

<style scoped>
/* 首页专属CSS样式 */
.about-section {
  padding: 80px 0;
  background-color: #f9f9f9;
}

.about-content {
  display: flex;
  gap: 40px;
  align-items: center;
}

.about-left {
  width: 45%;
}

.about-left img {
  width: 100%;
  border-radius: 8px;
}

.about-right {
  width: 55%;
}

.about-right h3 {
  font-size: 24px;
  color: #333;
  margin-bottom: 20px;
}

.about-right p {
  font-size: 16px;
  color: #666;
  line-height: 1.8;
  margin-bottom: 15px;
}

.product-section {
  padding: 80px 0;
}

.product-list {
  display: flex;
  gap: 30px;
  flex-wrap: wrap;
  justify-content: center;
}

.product-item {
  width: 30%;
  background-color: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 15px rgba(0, 0, 0, 0.05);
  padding: 20px;
  text-align: center;
  transition: transform 0.3s;
}

.product-item:hover {
  transform: translateY(-5px);
}

.product-item img {
  height: 200px;
  object-fit: cover;
  border-radius: 4px;
  margin-bottom: 20px;
}

.product-item h3 {
  font-size: 18px;
  color: #333;
  margin-bottom: 10px;
}

.product-item p {
  font-size: 14px;
  color: #666;
  margin-bottom: 20px;
  line-height: 1.6;
}

.contact-section {
  padding: 80px 0;
  background-color: #f9f9f9;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .about-content {
    flex-direction: column;
  }
  .about-left,
  .about-right {
    width: 100%;
  }
  .product-item {
    width: 45%;
  }
}

@media (max-width: 480px) {
  .product-item {
    width: 100%;
  }
  .about-section,
  .product-section,
  .contact-section {
    padding: 40px 0;
  }
}
</style>