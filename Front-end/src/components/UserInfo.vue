<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout accent white--text class="mt-12">
        <v-container fluid class="mt-12 mb-12">
          <center><h1>*오명현님 반갑습니다*</h1></center>

          <center>
            <div class="mt-12">
              <v-card class="mx-auto" max-width="400" outlined>
                <v-list-item three-line class="mt-8">
                  <v-list-item-content>
                    <!-- <div class="overline mb-4">오명현님 반갑습니다</div> -->
                    <v-text-field v-model="name" label="Name" outlined></v-text-field>
                    <v-text-field v-model="email" label="Email" outlined></v-text-field>
                    <v-text-field v-model="password" label="Password" type="password" outlined>></v-text-field>
                  </v-list-item-content>

                  <!-- <v-list-item-avatar tile size="80" color="grey"></v-list-item-avatar> -->
                </v-list-item>

                <!-- <v-card-actions> -->
                  <div class="text-center mb-6">
                    <v-btn rounded color="info" :to="{name:'Home'}">수정하기</v-btn>
                    &nbsp;
                    <v-btn rounded color="primary" v-on:click="end">탈퇴하기</v-btn>
                  </div>
                <!-- </v-card-actions> -->
              </v-card>
            </div>
          </center>

        </v-container>
    </v-layout>
  </section>
</template>

<script>
  export default {
    data: () => ({
      name: '오명현',
      email: 'abc@naver.com',
      password: '12345'
    }),
    methods: {
      end: function(event) {
        if(prompt('탈퇴하려면 비밀번호를 입력하세요')==='123') {
          alert("탈퇴되었습니다.")
          window.location = "http://localhost:8080/"
        } else {
          alert("비밀번호가 틀렸습니다")
        }

      }
    }
  }
</script>

<style>

</style>
