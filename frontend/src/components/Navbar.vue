<template>
  <!-- 导航栏HTML结构 -->
  <nav class="navbar">
    <div class="container">
      <!-- 公司LOGO -->
      <router-link to="/">
        <img src="/logo.png" alt="厦门智多星新材料" class="logo">
      </router-link>

      <!-- 导航列表 -->
      <ul class="nav-list">
        <li class="nav-item">
          <router-link to="/" class="nav-link" :class="{ active: $route.name === 'Home' }">首页</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/about" class="nav-link" :class="{ active: $route.name === 'About' }">关于我们</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/product" class="nav-link" :class="{ active: $route.name === 'Product' }">产品中心</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/application" class="nav-link" :class="{ active: $route.name === 'Application' }">应用领域</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/news" class="nav-link" :class="{ active: $route.name === 'News' }">新闻动态</router-link>
        </li>
        <li class="nav-item">
          <router-link to="/contact" class="nav-link btn btn-outline">联系我们</router-link>
        </li>
      </ul>
    </div>
  </nav>
</template>

<script setup>
// 导航栏JS逻辑（无需额外逻辑，仅路由跳转）
</script>

<style scoped>
/* 导航栏专属CSS样式（补充公共样式） */
.nav-link.active {
  color: #165DFF;
  font-weight: 600;
}

@media (max-width: 768px) {
  .navbar .logo {
    height: 50px;
  }
}
</style>