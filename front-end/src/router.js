import Vue from 'vue'
import Router from 'vue-router'
import Home from './views/Home.vue'
import Login from './views/Login.vue'
import Signup from './views/SignUp.vue'
import FindInfo from './views/FindInfo.vue'
import List from './views/List.vue'
import Listdetail from './views/ListDetail.vue'

Vue.use(Router)

export default new Router({
    mode: 'history',
    base: process.env.BASE_URL,
    routes: [{
            path: '/',
            name: 'home',
            component: Home
        },
        {
            path: '/login',
            name: 'login',
            // route level code-splitting
            // this generates a separate chunk (about.[hash].js) for this route
            // which is lazy-loaded when the route is visited.
            component: Login
        },
        {
          path: '/findInfo/:foodCode',
          name: 'findInfo',
          component:FindInfo
        },
        {
            path: '/signUp',
            name: 'signUp',
            component: Signup
        },
        {
            path: '/list',
            name: 'list',
            component: List
        },
        {
            path: '/listDetail/:title',
            name: 'listDetail',
            component: Listdetail
        },
    ]
})
