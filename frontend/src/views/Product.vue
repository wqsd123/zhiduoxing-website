<template>
  <div class="product-page">
    <div class="product-banner">
      <img src="/images/product-banner.jpg" alt="产品中心">
      <div class="product-banner-text">
        <h2>产品中心</h2>
        <p>高品质锡粉，满足不同领域定制需求</p>
      </div>
    </div>

    <section class="product-content">
      <div class="container">
        <div class="product-filter">
          <button class="filter-btn" :class="{ active: currentType === 'all' }" @click="currentType = 'all'">全部产品</button>
          <button class="filter-btn" :class="{ active: currentType === '99.9' }" @click="currentType = '99.9'">高纯锡粉（99.9%）</button>
          <button class="filter-btn" :class="{ active: currentType === '99.99' }" @click="currentType = '99.99'">高纯锡粉（99.99%）</button>
          <button class="filter-btn" :class="{ active: currentType === 'custom' }" @click="currentType = 'custom'">定制化锡粉</button>
        </div>

        <div class="product-grid">
          <div class="product-card" v-for="product in filteredProducts" :key="product.id">
            <div class="product-card-img">
              <img src="/product/tin-powder.jpg" :alt="product.name">
            </div>
            <div class="product-card-info">
              <h3>{{ product.name }}</h3>
              <p class="product-desc">{{ product.desc }}</p>
              <div class="product-params">
                <span>纯度：{{ product.purity }}</span>
                <span>粒径：{{ product.particleSize }}</span>
              </div>
              <button class="btn btn-outline" @click="showDetail(product)">查看详情</button>
            </div>
          </div>
        </div>
      </div>
    </section>

    <!-- 产品详情弹窗 -->
    <div class="modal-mask" v-if="showModal" @click="showModal = false">
      <div class="modal-container" @click.stop>
        <div class="modal-header">
          <h3>{{ currentProduct.name }}</h3>
          <button class="modal-close" @click="showModal = false">&times;</button>
        </div>
        <div class="modal-body">
          <div class="modal-img">
            <img src="/product/tin-powder.jpg" :alt="currentProduct.name">
          </div>
          <div class="modal-info">
            <p><strong>产品名称：</strong>{{ currentProduct.name }}</p>
            <p><strong>纯度：</strong>{{ currentProduct.purity }}</p>
            <p><strong>粒径：</strong>{{ currentProduct.particleSize }}</p>
            <p><strong>产品特点：</strong>{{ currentProduct.features }}</p>
            <p><strong>应用领域：</strong>{{ currentProduct.application }}</p>
            <router-link to="/contact" class="btn" style="margin-top: 20px; display: inline-block;">咨询报价</router-link>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script setup>
import { ref, computed } from 'vue'

// 产品数据
const products = ref([
  {
    id: 1,
    name: '高纯锡粉（99.9%）',
    desc: '适用于电子封装、化工催化，质量稳定，性价比高',
    purity: '99.9%',
    particleSize: '20-50μm',
    features: '纯度高、分散性好、流动性佳，无杂质，稳定性强',
    application: '电子封装、化工催化、金属涂层、焊接材料',
    type: '99.9'
  },
  {
    id: 2,
    name: '高纯锡粉（99.9%）',
    desc: '适用于普通工业场景，粒径可微调，批量供应',
    purity: '99.9%',
    particleSize: '50-100μm',
    features: '纯度达标，颗粒均匀，易储存，性价比高',
    application: '普通工业焊接、金属添加剂、化工反应',
    type: '99.9'
  },
  {
    id: 3,
    name: '高纯锡粉（99.99%）',
    desc: '适用于新能源电池、精密电子，纯度高，性能优异',
    purity: '99.99%',
    particleSize: '10-30μm',
    features: '超高纯度，颗粒细腻，分散性极佳，无有害杂质',
    application: '新能源电池电极、精密电子封装、3D打印',
    type: '99.99'
  },
  {
    id: 4,
    name: '高纯锡粉（99.99%）',
    desc: '适用于航空航天、高端电子，品质领先',
    purity: '99.99%',
    particleSize: '30-50μm',
    features: '纯度稳定，颗粒均匀，耐高温，抗氧化性强',
    application: '航空航天零部件、高端电子元器件、精密仪器',
    type: '99.99'
  },
  {
    id: 5,
    name: '定制化锡粉',
    desc: '按需定制纯度、粒径，适配特殊行业场景',
    purity: '按需定制（99.5%-99.99%）',
    particleSize: '按需定制（10-250μm）',
    features: '定制灵活，质量可控，批量定制可享优惠',
    application: '特殊行业催化、定制化焊接、专属材料研发',
    type: 'custom'
  },
  {
    id: 6,
    name: '定制化锡粉（球形）',
    desc: '球形锡粉，适用于3D打印、精密涂层',
    purity: '按需定制（99.5%-99.99%）',
    particleSize: '按需定制（20-100μm）',
    features: '球形度高，流动性好，适配3D打印、精密涂层',
    application: '3D打印、精密金属涂层、高端电子封装',
    type: 'custom'
  }
])

// 产品筛选逻辑
const currentType = ref('all')
const filteredProducts = computed(() => {
  if (currentType.value === 'all') {
    return products.value
  }
  return products.value.filter(product => product.type === currentType.value)
})

// 产品详情弹窗逻辑
const showModal = ref(false)
const currentProduct = ref({})
const showDetail = (product) => {
  currentProduct.value = product
  showModal.value = true
}
</script>

<style scoped>
/* 产品中心页面样式 */
.product-banner {
  width: 100%;
  height: 300px;
  position: relative;
  margin-top: 80px;
}

.product-banner img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.product-banner-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: #fff;
  text-align: center;
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
}

.product-banner-text h2 {
  font-size: 36px;
  margin-bottom: 10px;
}

.product-banner-text p {
  font-size: 18px;
}

.product-content {
  padding: 80px 0;
  background-color: #fff;
}

.product-filter {
  display: flex;
  gap: 15px;
  justify-content: center;
  margin-bottom: 40px;
}

.filter-btn {
  padding: 8px 20px;
  border: 1px solid #eee;
  border-radius: 4px;
  font-size: 16px;
  color: #333;
  cursor: pointer;
  transition: all 0.3s;
}

.filter-btn.active {
  background-color: #165DFF;
  color: #fff;
  border-color: #165DFF;
}

.product-grid {
  display: flex;
  gap: 30px;
  flex-wrap: wrap;
  justify-content: center;
}

.product-card {
  width: 30%;
  background-color: #fff;
  border-radius: 8px;
  box-shadow: 0 2px 15px rgba(0, 0, 0, 0.05);
  overflow: hidden;
  transition: transform 0.3s;
}

.product-card:hover {
  transform: translateY(-5px);
}

.product-card-img {
  width: 100%;
  height: 200px;
}

.product-card-img img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.product-card-info {
  padding: 20px;
}

.product-card-info h3 {
  font-size: 18px;
  color: #333;
  margin-bottom: 10px;
}

.product-desc {
  font-size: 14px;
  color: #666;
  margin-bottom: 15px;
  line-height: 1.6;
}

.product-params {
  display: flex;
  gap: 20px;
  font-size: 13px;
  color: #999;
  margin-bottom: 20px;
}

/* 弹窗样式 */
.modal-mask {
  position: fixed;
  top: 0;
  left: 0;
  right: 0;
  bottom: 0;
  background-color: rgba(0, 0, 0, 0.5);
  display: flex;
  align-items: center;
  justify-content: center;
  z-index: 9999;
}

.modal-container {
  width: 80%;
  max-width: 1000px;
  background-color: #fff;
  border-radius: 8px;
  overflow: hidden;
}

.modal-header {
  padding: 20px;
  border-bottom: 1px solid #eee;
  display: flex;
  justify-content: space-between;
  align-items: center;
}

.modal-header h3 {
  font-size: 20px;
  color: #333;
}

.modal-close {
  font-size: 24px;
  color: #999;
  cursor: pointer;
  transition: color 0.3s;
}

.modal-close:hover {
  color: #165DFF;
}

.modal-body {
  padding: 20px;
  display: flex;
  gap: 30px;
}

.modal-img {
  width: 40%;
}

.modal-img img {
  width: 100%;
  border-radius: 4px;
}

.modal-info {
  width: 60%;
  font-size: 16px;
  color: #333;
}

.modal-info p {
  margin-bottom: 15px;
  line-height: 1.8;
}

.modal-info strong {
  color: #165DFF;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .product-banner {
    height: 200px;
  }
  .product-banner-text h2 {
    font-size: 28px;
  }
  .product-card {
    width: 45%;
  }
  .modal-body {
    flex-direction: column;
  }
  .modal-img,
  .modal-info {
    width: 100%;
  }
  .product-content {
    padding: 40px 0;
  }
}

@media (max-width: 480px) {
  .product-card {
    width: 100%;
  }
  .product-filter {
    flex-wrap: wrap;
  }
  .filter-btn {
    padding: 6px 12px;
    font-size: 14px;
  }
  .modal-container {
    width: 95%;
  }
}
</style>