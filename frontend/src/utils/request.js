import axios from 'axios'

// 创建Axios实例
const request = axios.create({
    baseURL: '/api',  // 接口基础路径（与后端context-path对应）
    timeout: 5000,    // 请求超时时间（5秒）
    headers: {
        'Content-Type': 'application/json;charset=utf-8'  // 请求格式（JSON）
    }
})

// 请求拦截器（可选，用于添加请求头，如token）
request.interceptors.request.use(
    (config) => {
        return config
    },
    (error) => {
        return Promise.reject(error)
    }
)

// 响应拦截器（统一处理后端响应，简化前端处理）
request.interceptors.response.use(
    (response) => {
        const res = response.data
        // 若后端返回失败（success=false），提示错误信息
        if (!res.success) {
            alert(res.message)
            return Promise.reject(res.message)
        }
        // 成功则返回响应数据
        return res.data
    },
    (error) => {
        // 处理请求失败（如网络错误、服务器错误）
        const message = error.response?.data?.message || '请求失败，请稍后再试'
        alert(message)
        return Promise.reject(error)
    }
)

export default request