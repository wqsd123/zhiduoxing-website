<template>
  <div class="application-page">
    <div class="application-banner">
      <img src="/images/application-banner.jpg" alt="应用领域">
      <div class="application-banner-text">
        <h2>应用领域</h2>
        <p>高纯锡粉赋能多行业发展，创造无限可能</p>
      </div>
    </div>

    <section class="application-content">
      <div class="container">
        <div class="section-title">
          <h2>主要应用领域</h2>
          <p>我们的锡粉产品广泛应用于多个高端领域，品质得到行业认可</p>
        </div>

        <div class="application-list">
          <div class="application-item">
            <div class="application-img">
              <img src="/images/application/energy.jpg" alt="新能源电池">
            </div>
            <div class="application-info">
              <h3>新能源电池</h3>
              <p>高纯锡粉（99.99%）可作为新能源电池电极材料，具有良好的导电性和稳定性，能够提升电池的充放电效率和循环寿命，适配锂电池、钠离子电池等多种新能源电池类型。</p>
            </div>
          </div>

          <div class="application-item reverse">
            <div class="application-img">
              <img src="/images/application/electronic.jpg" alt="电子封装">
            </div>
            <div class="application-info">
              <h3>电子封装</h3>
              <p>锡粉具有良好的焊接性能和导电性，广泛应用于电子元器件封装、半导体封装等领域，能够有效提升电子设备的稳定性和使用寿命，适配手机、电脑、服务器等各类电子设备。</p>
            </div>
          </div>

          <div class="application-item">
            <div class="application-img">
              <img src="/images/application/3dprint.jpg" alt="3D打印">
            </div>
            <div class="application-info">
              <h3>3D打印</h3>
              <p>定制化球形锡粉，颗粒均匀、流动性好，可作为3D打印金属粉末材料，适用于航空航天零部件、精密仪器、医疗设备等高端产品的3D打印，能够实现复杂结构的精准成型。</p>
            </div>
          </div>

          <div class="application-item reverse">
            <div class="application-img">
              <img src="/images/application/chemical.jpg" alt="化工催化">
            </div>
            <div class="application-info">
              <h3>化工催化</h3>
              <p>高纯锡粉可作为化工反应催化剂，具有高效的催化活性和选择性，能够加速化学反应速率，降低反应能耗，广泛应用于有机合成、石油化工等领域，提升反应效率和产品质量。</p>
            </div>
          </div>
        </div>
      </div>
    </section>
  </div>
</template>

<script setup>
// 应用领域页面JS逻辑（无需额外交互，仅展示静态内容）
</script>

<style scoped>
/* 应用领域页面样式 */
.application-banner {
  width: 100%;
  height: 300px;
  position: relative;
  margin-top: 80px;
}

.application-banner img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.application-banner-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: #fff;
  text-align: center;
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
}

.application-banner-text h2 {
  font-size: 36px;
  margin-bottom: 10px;
}

.application-banner-text p {
  font-size: 18px;
}

.application-content {
  padding: 80px 0;
  background-color: #f9f9f9;
}

.application-list {
  margin-top: 40px;
}

.application-item {
  display: flex;
  gap: 30px;
  align-items: center;
  margin-bottom: 50px;
}

.application-item.reverse {
  flex-direction: row-reverse;
}

.application-img {
  width: 40%;
  border-radius: 8px;
  overflow: hidden;
}

.application-img img {
  width: 100%;
  height: 250px;
  object-fit: cover;
  transition: transform 0.3s;
}

.application-item:hover .application-img img {
  transform: scale(1.05);
}

.application-info {
  width: 60%;
}

.application-info h3 {
  font-size: 22px;
  color: #333;
  margin-bottom: 15px;
  font-weight: 600;
}

.application-info p {
  font-size: 16px;
  color: #666;
  line-height: 1.8;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .application-banner {
    height: 200px;
  }
  .application-banner-text h2 {
    font-size: 28px;
  }
  .application-item {
    flex-direction: column;
  }
  .application-item.reverse {
    flex-direction: column;
  }
  .application-img,
  .application-info {
    width: 100%;
  }
  .application-content {
    padding: 40px 0;
  }
}

@media (max-width: 480px) {
  .application-banner-text h2 {
    font-size: 22px;
  }
  .application-banner-text p {
    font-size: 16px;
  }
  .application-info h3 {
    font-size: 20px;
  }
  .application-info p {
    font-size: 14px;
  }
}
</style>