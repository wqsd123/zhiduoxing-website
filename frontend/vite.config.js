import { defineConfig } from 'vite'
import vue from '@vitejs/plugin-vue'

export default defineConfig({
    plugins: [vue()],  // 启用Vue插件
    server: {
        port: 5173,  // 前端开发端口（避免与后端8080冲突）
        open: true,  // 启动后自动打开浏览器
        host: '0.0.0.0',  // 允许局域网访问
        // 跨域代理（解决前端直接访问后端接口的跨域问题，无需修改后端配置）
        proxy: {
            '/api': {
                target: 'http://localhost:8080',  // 后端接口地址
                changeOrigin: true,  // 允许跨域
                //rewrite: (path) => path.replace(/^\/api/, '')  // 重写路径，去掉/api前缀
            }
        }
    },
    resolve: {
        alias: {
            '@': '/src'  // 别名配置，方便引入src目录下的文件（如@/components）
        }
    }
})