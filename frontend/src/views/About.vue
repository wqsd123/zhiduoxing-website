<template>
  <div class="about-page">
    <div class="about-banner">
      <img src="/images/about-banner.jpg" alt="关于我们">
      <div class="about-banner-text">
        <h2>关于我们</h2>
        <p>专注高纯锡粉，赋能新能源未来</p>
      </div>
    </div>

    <section class="about-intro">
      <div class="container">
        <div class="section-title">
          <h2>公司简介</h2>
        </div>
        <div class="about-intro-content">
          <p>厦门智多星新材料科技有限公司，是一家专注于高纯金属粉末研发、生产、销售及应用解决方案的高新技术企业，总部位于厦门翔安科技园区，占地面积XX平方米，拥有标准化生产车间、研发实验室和检测中心。</p>
          <p>公司自成立以来，始终聚焦高纯锡粉领域，凭借先进的生产工艺、严格的质量控制体系和专业的研发团队，打造了99.9%-99.99%全系列高纯锡粉产品，粒径可定制10-250μm，产品质量达到行业领先水平。</p>
          <p>我们的产品广泛应用于新能源电池、电子封装、3D打印、化工催化、航空航天等多个领域，服务于国内外众多知名企业，赢得了客户的一致好评。公司始终坚持“创新驱动、质量为本、客户至上、诚信共赢”的核心价值观，致力于成为全球领先的金属粉末材料供应商。</p>
        </div>
      </div>
    </section>

    <section class="about-advantage">
      <div class="container">
        <div class="section-title">
          <h2>我们的优势</h2>
        </div>
        <div class="advantage-list">
          <div class="advantage-item">
            <div class="advantage-icon">
              <img src="/images/icon/tech.png" alt="技术优势">
            </div>
            <h3>技术优势</h3>
            <p>拥有专业研发团队，深耕高纯锡粉领域多年，掌握核心生产工艺，可根据客户需求定制产品参数。</p>
          </div>
          <div class="advantage-item">
            <div class="advantage-icon">
              <img src="/images/icon/quality.png" alt="质量优势">
            </div>
            <h3>质量优势</h3>
            <p>建立严格的质量控制体系，从原材料采购到生产、检测、出厂，每一步都经过严格把关，确保产品质量稳定。</p>
          </div>
          <div class="advantage-item">
            <div class="advantage-icon">
              <img src="/images/icon/service.png" alt="服务优势">
            </div>
            <h3>服务优势</h3>
            <p>提供一对一专属服务，从咨询、定制、生产到售后，全程跟踪，及时响应客户需求，解决客户后顾之忧。</p>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script setup>
// 关于我们页面JS逻辑（无需额外交互，仅展示静态内容）
</script>

<style scoped>
/* 关于我们页面样式 */
.about-banner {
  width: 100%;
  height: 300px;
  position: relative;
  margin-top: 80px;
}

.about-banner img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.about-banner-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: #fff;
  text-align: center;
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
}

.about-banner-text h2 {
  font-size: 36px;
  margin-bottom: 10px;
}

.about-banner-text p {
  font-size: 18px;
}

.about-intro {
  padding: 80px 0;
  background-color: #fff;
}

.about-intro-content {
  font-size: 16px;
  color: #666;
  line-height: 1.8;
  max-width: 1000px;
  margin: 0 auto;
}

.about-intro-content p {
  margin-bottom: 20px;
}

.about-advantage {
  padding: 80px 0;
  background-color: #f9f9f9;
}

.advantage-list {
  display: flex;
  gap: 30px;
  flex-wrap: wrap;
  justify-content: center;
}

.advantage-item {
  width: 30%;
  background-color: #fff;
  padding: 30px;
  border-radius: 8px;
  box-shadow: 0 2px 15px rgba(0, 0, 0, 0.05);
  text-align: center;
}

.advantage-icon {
  width: 80px;
  height: 80px;
  margin: 0 auto 20px;
  background-color: #f0f7ff;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
}

.advantage-icon img {
  width: 40px;
  height: 40px;
}

.advantage-item h3 {
  font-size: 18px;
  color: #333;
  margin-bottom: 15px;
}

.advantage-item p {
  font-size: 14px;
  color: #666;
  line-height: 1.6;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .about-banner {
    height: 200px;
  }
  .about-banner-text h2 {
    font-size: 28px;
  }
  .advantage-item {
    width: 45%;
  }
  .about-intro,
  .about-advantage {
    padding: 40px 0;
  }
}

@media (max-width: 480px) {
  .advantage-item {
    width: 100%;
  }
  .about-banner-text h2 {
    font-size: 22px;
  }
  .about-banner-text p {
    font-size: 16px;
  }
}
</style>