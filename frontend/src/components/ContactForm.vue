<template>
  <!-- 表单HTML结构 -->
  <div class="form-container">
    <div class="section-title">
      <h2>在线咨询</h2>
      <p>填写您的需求，我们将在24小时内与您联系</p>
    </div>
    <form @submit.prevent="handleSubmit">
      <div class="form-item">
        <label for="name">您的姓名</label>
        <input type="text" id="name" v-model="form.name" placeholder="请输入您的姓名">
      </div>
      <div class="form-item">
        <label for="phone">联系电话</label>
        <input type="tel" id="phone" v-model="form.phone" placeholder="请输入您的联系电话">
      </div>
      <div class="form-item">
        <label for="content">咨询内容</label>
        <textarea id="content" v-model="form.content" placeholder="请输入您的咨询需求（如产品报价、定制需求等）"></textarea>
      </div>
      <button type="submit" class="btn form-btn" :disabled="loading">
        {{ loading ? '提交中...' : '提交咨询' }}
      </button>
      <p class="form-tip">我们承诺：您的个人信息仅用于咨询回复，绝不泄露</p>
    </form>
  </div>
</template>

<script setup>
import { ref } from 'vue'
import request from '@/utils/request' // 引入封装的Axios

// 表单数据（JS逻辑）
const form = ref({
  name: '',
  phone: '',
  content: ''
})

// 加载状态（防止重复提交）
const loading = ref(false)

// 表单提交处理（对接后端接口）
const handleSubmit = async () => {
  // 前端简单校验
  if (!form.value.name.trim()) {
    alert('请输入您的姓名')
    return
  }
  if (!form.value.phone.trim()) {
    alert('请输入您的联系电话')
    return
  }
  if (!form.value.content.trim()) {
    alert('请输入您的咨询内容')
    return
  }

  try {
    loading.value = true // 开启加载状态
    // 调用后端接口（提交表单）
    await request.post('/contact/submit', form.value)
    // 提交成功，重置表单
    form.value = { name: '', phone: '', content: '' }
    alert('咨询提交成功！我们将尽快与您联系')
  } catch (error) {
    // 提交失败，不做额外处理（响应拦截器已提示错误）
  } finally {
    loading.value = false // 关闭加载状态
  }
}
</script>

<style scoped>
/* 表单组件专属样式（补充公共样式） */
.form-container {
  margin: 40px auto;
}

.form-item input:focus,
.form-item textarea:focus {
  border-color: #165DFF;
  background-color: #fff;
}

.form-btn {
  margin-top: 10px;
}

.form-btn:disabled {
  background-color: #8AB4F8;
  cursor: not-allowed;
}

@media (max-width: 768px) {
  .form-container {
    padding: 20px;
  }
}
</style>