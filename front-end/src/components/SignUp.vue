<template>
     <v-container fluid class="indigo darken-4 white--text" id="container">
        <v-layout text-left wrap> 
            <v-flex xs4 sm12 md12 lg12>
                <v-img :src="require('../assets/logo_white.png')" class="my-3" contain width="120" height = "50"></v-img>
            </v-flex>
            

            <v-flex xs12 sm4 md2 lg4>
                <h1 class="pt-12">회원가입</h1>                
            </v-flex>
            <v-flex xs10 sm4 md2 lg4 class="pl-10 mt-5">
                <v-text-field :rules="rules" color="white" placeholder="E-mail" id="input__form"></v-text-field>
                <v-text-field :rules="rules" color="white" placeholder="Password" id="input__form"></v-text-field>
                <v-text-field :rules="rules" color="white" placeholder="Repeat Password" id="input__form"></v-text-field>
                <v-text-field :rules="rules" color="white" placeholder="Name" id="input__form"></v-text-field>
            </v-flex> 
            <v-flex xs10 class="ml-9 pl-12">
                <v-btn text color="accent">아이디/비밀번호찾기</v-btn>
            </v-flex>

             <v-flex xs12 sm12 md12 lg12 class="pt-12 pl-4">
                <v-btn text id="start__btn">접속하기</v-btn>
                <v-btn :to="{name:'home'}" text id="signUp__btn">메인으로</v-btn>
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>
  export default {
    data: () => ({
      rules: [
        value => !!value || 'Required.',
      ],
    }),
  }
</script>

<style>
    h1{
        font-family: '궁서';
    }
    #input__form{
        color:white;
    }

    #input__form::placeholder{
        color: white;
    }
</style>