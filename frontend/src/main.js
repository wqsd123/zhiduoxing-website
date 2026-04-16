import { createApp } from 'vue'
import App from './App.vue'
import router from './router'  // 引入路由配置
import './assets/css/base.css'  // 引入基础样式
import './assets/css/common.css'  // 引入公共样式

// 创建Vue实例
const app = createApp(App)

// 挂载路由
app.use(router)

// 挂载到HTML的#app容器
app.mount('#app')