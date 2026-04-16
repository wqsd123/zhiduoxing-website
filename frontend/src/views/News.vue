<template>
  <div class="news-page">
    <div class="news-banner">
      <img src="/images/news-banner.jpg" alt="新闻动态">
      <div class="news-banner-text">
        <h2>新闻动态</h2>
        <p>关注行业前沿，了解智多星最新动态</p>
      </div>
    </div>

    <section class="news-content">
      <div class="container">
        <div class="section-title">
          <h2>最新资讯</h2>
          <p>及时更新公司动态、行业资讯，与您共探新材料发展之路</p>
        </div>

        <div class="news-tabs">
          <div class="tab-item active" @click="changeTab('company')">公司新闻</div>
          <div class="tab-item" @click="changeTab('industry')">行业资讯</div>
        </div>

        <div class="news-list" v-show="activeTab === 'company'">
          <div class="news-item" v-for="(item, index) in companyNews" :key="index">
            <div class="news-img">
              <img :src="item.img" :alt="item.title">
            </div>
            <div class="news-info">
              <h3>{{ item.title }}</h3>
              <p class="news-desc">{{ item.desc }}</p>
              <div class="news-meta">
                <span class="news-date">{{ item.date }}</span>
                <router-link to="/news/detail" class="news-more">查看详情 ></router-link>
              </div>
            </div>
          </div>
        </div>

        <div class="news-list" v-show="activeTab === 'industry'">
          <div class="news-item" v-for="(item, index) in industryNews" :key="index">
            <div class="news-img">
              <img :src="item.img" :alt="item.title">
            </div>
            <div class="news-info">
              <h3>{{ item.title }}</h3>
              <p class="news-desc">{{ item.desc }}</p>
              <div class="news-meta">
                <span class="news-date">{{ item.date }}</span>
                <router-link to="/news/detail" class="news-more">查看详情 ></router-link>
              </div>
            </div>
          </div>
        </div>

        <!-- 分页组件 -->
        <div class="pagination">
          <button class="page-btn" :disabled="currentPage === 1" @click="currentPage--">上一页</button>
          <div class="page-nums">
            <span class="page-num" :class="{ active: currentPage === 1 }" @click="currentPage = 1">1</span>
            <span class="page-num" :class="{ active: currentPage === 2 }" @click="currentPage = 2">2</span>
            <span class="page-num" :class="{ active: currentPage === 3 }" @click="currentPage = 3">3</span>
          </div>
          <button class="page-btn" :disabled="currentPage === 3" @click="currentPage++">下一页</button>
        </div>
      </div>
    </section>
  </div>
</template>

<script setup>
import { ref } from 'vue'

// 标签切换
const activeTab = ref('company')
const changeTab = (tab) => {
  activeTab.value = tab
}

// 分页控制
const currentPage = ref(1)

// 公司新闻模拟数据
const companyNews = ref([
  {
    title: '厦门智多星荣获“高新技术企业”认证',
    desc: '近日，厦门智多星新材料科技有限公司凭借在高纯锡粉领域的技术创新和研发实力，成功通过高新技术企业认证，标志着公司在新材料研发领域迈上新台阶。',
    date: '2026-04-10',
    img: '/images/news/company1.jpg'
  },
  {
    title: '智多星新品发布会圆满落幕，新型球形锡粉正式亮相',
    desc: '厦门智多星举办新品发布会，推出定制化球形锡粉系列产品，该产品在3D打印、电子封装领域表现突出，获得现场客户广泛认可。',
    date: '2026-03-25',
    img: '/images/news/company2.jpg'
  },
  {
    title: '智多星与厦门大学达成战略合作，共推新材料技术研发',
    desc: '厦门智多星与厦门大学材料科学与工程学院签署战略合作协议，双方将围绕高纯锡粉制备技术、应用场景拓展等方面开展深度合作。',
    date: '2026-02-18',
    img: '/images/news/company3.jpg'
  }
])

// 行业资讯模拟数据
const industryNews = ref([
  {
    title: '全球高纯锡粉市场规模持续增长，新能源领域需求凸显',
    desc: '据行业报告显示，随着新能源电池、电子封装行业的快速发展，全球高纯锡粉市场规模逐年扩大，预计2028年将突破50亿美元。',
    date: '2026-04-05',
    img: '/images/news/industry1.jpg'
  },
  {
    title: '3D打印金属粉末技术升级，球形锡粉应用前景广阔',
    desc: '随着3D打印技术向高端制造领域渗透，球形锡粉凭借良好的流动性和成型性，成为高端零部件3D打印的核心材料之一，市场需求持续攀升。',
    date: '2026-03-12',
    img: '/images/news/industry2.jpg'
  },
  {
    title: '电子封装行业迎来升级，高纯锡粉成核心配套材料',
    desc: '消费电子、半导体行业的小型化、高精度发展，对电子封装材料提出更高要求，高纯锡粉因其优异的焊接性能，成为封装领域的首选材料。',
    date: '2026-02-20',
    img: '/images/news/industry3.jpg'
  }
])
</script>

<style scoped>
/* 新闻动态页面样式 */
.news-banner {
  width: 100%;
  height: 300px;
  position: relative;
  margin-top: 80px;
}

.news-banner img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.news-banner-text {
  position: absolute;
  top: 50%;
  left: 50%;
  transform: translate(-50%, -50%);
  color: #fff;
  text-align: center;
  text-shadow: 0 2px 10px rgba(0, 0, 0, 0.3);
}

.news-banner-text h2 {
  font-size: 36px;
  margin-bottom: 10px;
}

.news-banner-text p {
  font-size: 18px;
}

.news-content {
  padding: 80px 0;
  background-color: #f9f9f9;
}

.news-tabs {
  display: flex;
  justify-content: center;
  gap: 20px;
  margin-bottom: 40px;
}

.tab-item {
  padding: 8px 24px;
  background-color: #fff;
  border-radius: 20px;
  font-size: 16px;
  color: #333;
  cursor: pointer;
  transition: all 0.3s;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.05);
}

.tab-item.active {
  background-color: #165DFF;
  color: #fff;
}

.tab-item:hover {
  box-shadow: 0 2px 12px rgba(0, 0, 0, 0.1);
}

.news-list {
  display: flex;
  flex-direction: column;
  gap: 30px;
}

.news-item {
  display: flex;
  gap: 30px;
  background-color: #fff;
  border-radius: 8px;
  overflow: hidden;
  box-shadow: 0 2px 15px rgba(0, 0, 0, 0.05);
  transition: transform 0.3s;
}

.news-item:hover {
  transform: translateY(-5px);
}

.news-img {
  width: 30%;
}

.news-img img {
  width: 100%;
  height: 100%;
  object-fit: cover;
}

.news-info {
  width: 70%;
  padding: 25px;
  display: flex;
  flex-direction: column;
  justify-content: space-between;
}

.news-info h3 {
  font-size: 20px;
  color: #333;
  margin-bottom: 15px;
  font-weight: 600;
  transition: color 0.3s;
}

.news-info h3:hover {
  color: #165DFF;
}

.news-desc {
  font-size: 14px;
  color: #666;
  line-height: 1.8;
  margin-bottom: 20px;
  flex: 1;
}

.news-meta {
  display: flex;
  justify-content: space-between;
  align-items: center;
  font-size: 14px;
  color: #999;
}

.news-date {
  display: flex;
  align-items: center;
  gap: 5px;
}

.news-more {
  color: #165DFF;
  transition: color 0.3s;
}

.news-more:hover {
  color: #0E4CD1;
}

.pagination {
  display: flex;
  justify-content: center;
  align-items: center;
  gap: 15px;
  margin-top: 50px;
}

.page-btn {
  padding: 6px 16px;
  background-color: #fff;
  border: 1px solid #eee;
  border-radius: 4px;
  font-size: 14px;
  color: #333;
  transition: all 0.3s;
}

.page-btn:disabled {
  background-color: #f5f5f5;
  color: #999;
  cursor: not-allowed;
}

.page-btn:hover:not(:disabled) {
  background-color: #165DFF;
  color: #fff;
  border-color: #165DFF;
}

.page-nums {
  display: flex;
  gap: 8px;
}

.page-num {
  width: 32px;
  height: 32px;
  border-radius: 50%;
  display: flex;
  align-items: center;
  justify-content: center;
  font-size: 14px;
  color: #333;
  cursor: pointer;
  transition: all 0.3s;
}

.page-num.active {
  background-color: #165DFF;
  color: #fff;
}

.page-num:hover:not(.active) {
  background-color: #f0f7ff;
  color: #165DFF;
}

/* 响应式适配 */
@media (max-width: 768px) {
  .news-banner {
    height: 200px;
  }
  .news-banner-text h2 {
    font-size: 28px;
  }
  .news-content {
    padding: 40px 0;
  }
  .news-item {
    flex-direction: column;
  }
  .news-img,
  .news-info {
    width: 100%;
  }
  .news-info {
    padding: 20px;
  }
  .tab-item {
    padding: 6px 18px;
    font-size: 14px;
  }
}

@media (max-width: 480px) {
  .news-banner-text h2 {
    font-size: 22px;
  }
  .news-banner-text p {
    font-size: 16px;
  }
  .news-info h3 {
    font-size: 18px;
  }
  .news-desc {
    font-size: 13px;
  }
  .page-btn {
    padding: 4px 12px;
    font-size: 13px;
  }
  .page-num {
    width: 28px;
    height: 28px;
    font-size: 13px;
  }
}
</style>