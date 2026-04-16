<template>
  <!-- Banner轮播HTML结构 -->
  <div class="banner-container">
    <div class="banner-list" :style="{ transform: `translateX(-${currentIndex * 100}%)` }">
      <div class="banner-item">
        <img src="/images/contact-banner.jpg" alt="厦门智多星-高纯锡粉厂家">
        <div class="banner-text">
          <h2>高纯锡粉研发生产厂家</h2>
          <p>专注99.9%-99.99%高纯锡粉，定制化粒径解决方案</p>
          <router-link to="/contact" class="btn">立即咨询</router-link>
        </div>
      </div>
      <div class="banner-item">
        <img src="/images/contact-banner.jpg" alt="新能源材料锡粉">
        <div class="banner-text">
          <h2>新能源领域专用锡粉</h2>
          <p>适配电池、电子封装、3D打印等多领域需求</p>
          <router-link to="/product" class="btn">查看产品</router-link>
        </div>
      </div>
    </div>
    <!-- 轮播指示器 -->
    <div class="banner-indicator">
      <span v-for="(item, index) in 2" :key="index" :class="{ active: currentIndex === index }" @click="currentIndex = index"></span>
    </div>
  </div>
</template>

<script setup>
import { ref, onMounted, onUnmounted } from 'vue'

// 轮播JS逻辑
const currentIndex = ref(0)
let timer = null

// 自动轮播
const autoPlay = () => {
  timer = setInterval(() => {
    currentIndex.value = (currentIndex.value + 1) % 2
  }, 5000)
}

// 挂载时启动轮播
onMounted(() => {
  autoPlay()
})

// 卸载时清除定时器（避免内存泄漏）
onUnmounted(() => {
  clearInterval(timer)
})
</script>

<style scoped>
/* Banner组件CSS样式 */
.banner-container {
  width: 100%;
  height: 500px;
  overflow: hidden;
  position: relative;
  margin-top: 80px; /* 适配导航栏固定定位 */
}

.banner-list {
  width: 200%; /* 2张轮播图，宽度为200% */
  height: 100%;
  display: flex;
  transition: transform 0.5s ease; /* 平滑过渡 */
}

.banner-item {
  width: 50%;
  height: 100%;
  position: relative;
}

.banner-item img {
  width: 100%;
  height: 100%;
  object-fit: cover; /* 图片自适应，不拉伸 */
}

.banner-text {
  position: absolute;
  top: 50%;
  left: 10%;
  transform: translateY(-50%);
  color: #fff;
  max-width: 500px;
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
}

.banner-text h2 {
  font-size: 42px;
  margin-bottom: 20px;
}

.banner-text p {
  font-size: 18px;
  margin-bottom: 30px;
  line-height: 1.8;
}

.banner-indicator {
  position: absolute;
  bottom: 30px;
  left: 50%;
  transform: translateX(-50%);
  display: flex;
  gap: 15px;
}

.banner-indicator span {
  width: 12px;
  height: 12px;
  border-radius: 50%;
  background-color: rgba(255, 255, 255, 0.5);
  cursor: pointer;
  transition: background-color 0.3s;
}

.banner-indicator span.active {
  background-color: #fff;
  width: 30px;
  border-radius: 6px;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .banner-container {
    height: 300px;
  }
  .banner-text h2 {
    font-size: 28px;
  }
  .banner-text p {
    font-size: 16px;
  }
  .banner-text .btn {
    padding: 8px 16px;
    font-size: 14px;
  }
}

@media (max-width: 480px) {
  .banner-container {
    height: 220px;
  }
  .banner-text h2 {
    font-size: 22px;
    margin-bottom: 10px;
  }
  .banner-text p {
    font-size: 14px;
    margin-bottom: 20px;
  }
}
</style>