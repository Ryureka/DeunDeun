import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home'
import FoodCategory from './views/FoodCategory'
import Login from './views/Login'
import FoodList from './views/FoodList'
import SignUp from './views/SignUp'
import Notice from './views/Notice'
import FAQ from './views/FAQ'
import UserInfo from './views/UserInfo'
import StoreDetail from './views/StoreDetail'
import FindIdPwd from './views/FindIdPwd'

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
        },
        {
            path: '/UserInfo',
            name: 'UserInfo',
            component: UserInfo
        },
        {
            path: '/StoreDetail/:storeNo',
            name: 'StoreDetail',
            component: StoreDetail
        },
        {
            path: '/FindIdPwd',
            name: 'FindIdPwd',
            component: FindIdPwd
        },
    ]
})