<template>
  <div class="signUp">
    <h1>대충 회원가입 해보자는 거</h1>

    <div class="container">
      <div class="row">
        <div id="register-form" class="col-md-6 mx-auto bg-white">
          <div class="mt-4">
            <div class="form-group">
              <label for="email">이메일</label>
              <input
                type="text"
                class="form-control"
                id="email"
                v-model="members.email"
                placeholder="이메일"
              />
            </div>

            <div class="form-group">
              <label for="name">이름</label>
              <input
                type="text"
                class="form-control"
                id="name"
                v-model="members.name"
                placeholder="이름"
              />
            </div>

            <div class="form-group">
              <label for="name">별명</label>
              <input
                type="text"
                class="form-control"
                id="nickname"
                v-model="members.nickname"
                placeholder="별명"
              />
            </div>

            <div class="form-group">
              <label for="name">전화번호</label>
              <input
                type="text"
                class="form-control"
                id="tel"
                v-model="members.tel"
                placeholder="전화번호"
              />
            </div>

            <div class="form-group">
              <label for="password">비밀번호</label>
              <input
                type="password"
                class="form-control"
                id="password"
                v-model="members.password"
                placeholder="비밀번호"
              />
            </div>

            <div class="form-group">
              <label for="password-confirm">비밀번호 확인</label>
              <input
                type="password"
                class="form-control"
                id="password-confirm"
                v-model="passwordConfirm"
                placeholder="비밀번호 확인"
              />
            </div>

            <button type="submit" class="btn btn-primary" v-on:click="register">회원가입</button>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "signUp",
  data: function() {
    return {
      members: {},
      passwordConfirm: ""
    };
  },
  mounted() {
    axios({
      headers: { "Content-Type": "application/json" },
      url: "http://localhost:8888/members/test",
      method: "post"
    }).then(res => {
      console.log("member", res.data);
    });
  },
  methods: {
    register: function() {
      var body = {
        name: this.members.name,
        nickname: this.members.nickname,
        email: this.members.email,
        password: this.members.password,
        tel: this.members.tel,
        grade: "user",
        create_at: new Date()
      };
      axios({
        headers: { "Content-Type": "application/json" },
        url: "http://localhost:8888/members/register",
        method: "post",
        data: JSON.stringify(body)
      }).then(res => {
        console.log("member", res);
      });
      console.log("mem", body);
    }
  }
};
</script>
