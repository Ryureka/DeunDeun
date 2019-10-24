import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home'
import FoodCategory from './views/FoodCategory'
import Login from './views/Login'
import FoodList from './views/FoodList'
import SignUp from './views/SignUp'
import Notice from './views/Notice'
import FAQ from './views/FAQ'

Vue.use(Router)

export default new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'Home',
      component: Home
    },
    {
      path: '/FoodCategory',
      name: 'FoodCategory',
      component: FoodCategory
    },
    {
      path: '/Login',
      name: 'Login',
      component: Login
    },
    {
      path: '/FoodList',
      name: 'FoodList',
      component: FoodList
    },
    {
      path: '/SignUp',
      name: 'SignUp',
      component: SignUp
    },
    {
      path: '/Notice',
      name: 'Notice',
      component: Notice
    },
    {
      path: '/FAQ',
      name: 'FAQ',
      component: FAQ
    }
  ]
})
