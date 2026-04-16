<template>
  <div class="app-container">
    <!-- 导航栏组件（HTML+CSS+JS） -->
    <Navbar />
    <!-- 路由出口：所有页面都会渲染到这里 -->
    <router-view />
    <!-- 底部组件（HTML+CSS+JS） -->
    <Footer />
  </div>
</template>

<script setup>
// 引入通用组件（Vue组件，包含HTML结构和JS交互）
import Navbar from '@/components/Navbar.vue'
import Footer from '@/components/Footer.vue'
</script>

<style scoped>
/* 根组件样式（CSS） */
.app-container {
  min-height: 100vh;
  display: flex;
  flex-direction: column;
  background-color: #fff;
}
</style>