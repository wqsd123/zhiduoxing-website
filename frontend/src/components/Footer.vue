<template>
  <!-- 底部HTML结构 -->
  <footer class="footer">
    <div class="container">
      <div class="footer-col">
        <h3>关于我们</h3>
        <p>厦门智多星新材料科技有限公司，位于厦门翔安，是一家专注于高纯锡粉、新能源材料研发、生产与销售的高新技术企业，为全球客户提供稳定、可靠、高性价比的金属粉末解决方案。</p>
      </div>
      <div class="footer-col">
        <h3>产品中心</h3>
        <a href="/product">高纯锡粉（99.9%）</a>
        <a href="/product">高纯锡粉（99.99%）</a>
        <a href="/product">定制化锡粉</a>
        <a href="/product">球形锡粉</a>
      </div>
      <div class="footer-col">
        <h3>联系我们</h3>
        <p>地址：厦门市翔安区XX科技园区XX路XX号</p>
        <p>电话：0592-XXXXXXX</p>
        <p>手机：138XXXX8888</p>
        <p>邮箱：zhiduoxing@163.com</p>
      </div>
      <div class="footer-col">
        <h3>快速链接</h3>
        <a href="/about">关于我们</a>
        <a href="/application">应用领域</a>
        <a href="/news">新闻动态</a>
        <a href="/contact">在线咨询</a>
      </div>
    </div>
    <div class="copyright">
      &copy; 2026 厦门智多星新材料科技有限公司 版权所有 | 闽ICP备XXXXXXXX号
    </div>
  </footer>
</template>

<script setup>
// 底部组件JS逻辑（无需额外交互，仅展示静态内容）
</script>

<style scoped>
/* 底部专属CSS样式（补充公共样式，适配细节） */
.footer-col a {
  display: block;
  margin-bottom: 8px;
}

.copyright {
  font-size: 13px;
  color: #aaa;
}

/* 响应式适配优化 */
@media (max-width: 480px) {
  .footer .footer-col h3 {
    font-size: 16px;
  }
  .footer .footer-col p,
  .footer .footer-col a {
    font-size: 13px;
  }
}
</style>