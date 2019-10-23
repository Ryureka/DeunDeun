import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home'
import FoodCategory from './views/FoodCategory'
import Login from './views/Login'
import FoodList from './views/FoodList'

Vue.use(Router)

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [{
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
            path: '/FoodList/:category',
            name: 'FoodList',
            component: FoodList
        }
    ]
})