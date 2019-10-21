<template>
    <v-container fluid class="indigo darken-4 white--text" id="container">
        <v-layout text-left wrap>
            <v-flex xs4 sm12 md12 lg12>
                <v-img :src="require('../assets/logo_white.png')" class="my-3" contain width="120" height = "50" @click="$router.push({name:'home'})"></v-img>
            </v-flex>

            <v-flex xs12>
                <v-tabs background-color="#1a237e" color="white" centered>
                    <v-tab id="find__tabs">아이디 찾기</v-tab>
                    <v-tab id="find__tabs">비밀번호 찾기</v-tab>

                    <v-tab-item>
                        <v-card>
                            <v-card-text>
                                <p>asd</p>
                            </v-card-text>
                        </v-card>
                    </v-tab-item>

                    
                    <v-tab-item>
                        <v-card>
                            <v-card-text>
                                <p>asdasdasdasd</p>
                            </v-card-text>
                        </v-card>
                    </v-tab-item>
                </v-tabs>

            </v-flex>
        </v-layout>        
    </v-container>
</template>


<script>
export default{
  data(){
    return{
    }
  },
  methods:{
  }
}
</script>

<style>
    #find__tabs{
        color: white;
    }
</style>