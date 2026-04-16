import { createRouter, createWebHistory } from 'vue-router'

// 引入所有页面组件（Vue+HTML+CSS+JS）
import Home from '@/views/Home.vue'
import About from '@/views/About.vue'
import Product from '@/views/Product.vue'
import Application from '@/views/Application.vue'
import News from '@/views/News.vue'
import Contact from '@/views/Contact.vue'

// 路由规则（配置页面路径、组件、标题）
const routes = [
    {
        path: '/',
        name: 'Home',
        component: Home,
        meta: { title: '厦门智多星新材料科技有限公司_高纯锡粉厂家' }
    },
    {
        path: '/about',
        name: 'About',
        component: About,
        meta: { title: '关于我们_厦门智多星新材料科技有限公司' }
    },
    {
        path: '/product',
        name: 'Product',
        component: Product,
        meta: { title: '产品中心_高纯锡粉_锡粉定制' }
    },
    {
        path: '/application',
        name: 'Application',
        component: Application,
        meta: { title: '应用领域_新能源电池锡粉_电子封装锡粉' }
    },
    {
        path: '/news',
        name: 'News',
        component: News,
        meta: { title: '新闻动态_锡粉行业资讯' }
    },
    {
        path: '/contact',
        name: 'Contact',
        component: Contact,
        meta: { title: '联系我们_锡粉咨询报价_厂家地址' }
    }
]

// 创建路由实例
const router = createRouter({
    history: createWebHistory(),  // 路由模式（HTML5模式，无#）
    routes,
    // 路由跳转时，滚动到页面顶部
    scrollBehavior() {
        return { top: 0 }
    }
})

// 路由守卫：动态修改页面标题
router.beforeEach((to, from, next) => {
    if (to.meta.title) {
        document.title = to.meta.title
    }
    next()
})

export default router