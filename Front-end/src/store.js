import Vue from 'vue'
import Vuex from 'vuex'
import router from './router.js'
import axios from 'axios'

Vue.use(Vuex)


export default new Vuex.Store({
  state:{ //data
      User:{name:'',nickname:'',email:'',tel:'',grade:'',create_at:''},
      isLogin: false,
      isLoginError: false,
  },
  mutations:{

  },
  actions:{
    login({state,dispatch},loginObj){
      axios
      .post("http://localhost:8765/members/login",loginObj)
      .then(res=>{
        console.log(res);
        document.cookie="ddtoken="+res.data.ddtoken
        if(document.cookie.indexOf("userError")!=-1){
          alert("아이디가 존재하지 않습니다.")
          dispatch('loginError')
        }else if(document.cookie.indexOf("passwordError")!=-1){
          alert("패스워드가 일치하지 않습니다.")
          dispatch('loginError')
        }else{
          dispatch('getUserInfo')
          dispatch('loginSuccess')
          console.log(state.isLogin);
          router.push({name:'Home'})
        }
      })
    },
    logout({state}){
      document.cookie="ddtoken="
      state.User.name=''
      state.User.nickname=''
      state.User.email=''
      state.User.tel=''
      state.User.grade=''
      state.User.create_at=''
      state.isLogin=false
    },
    getUserInfo({state}){
      let name=document.cookie.split("=")[1].split(".").length==1?
          '':document.cookie.split("=")[1].split(".")[0]
      let nickname=document.cookie.split("=")[1].split(".")[1]
      let email=document.cookie.split("=")[1].split(".")[2]
      let tel=document.cookie.split("=")[1].split(".")[3]
      let grade=document.cookie.split("=")[1].split(".")[4]
      let create_at=document.cookie.split("=")[1].split(".")[5]
      let isLogin=document.cookie.split("=")[1].split(".")[6]
      state.User.name=name
      state.User.nickname=nickname
      state.User.email=email
      state.User.tel=tel
      state.User.grade=grade
      state.User.create_at=create_at
      state.isLogin=isLogin==="true"?true:false
    },
    loginError({state}){
      state.isLogin=false
      document.cookie=document.cookie+".false"
    },
    loginSuccess({state}){
      state.isLogin=true
      document.cookie=document.cookie+".true"
    }
  }
})
