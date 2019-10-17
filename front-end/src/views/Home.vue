<template>
    <v-container fluid class="indigo darken-4 white--text" id="container">
        <v-layout text-left wrap> 
            <v-flex xs4 sm12 md12 lg12>
                <v-img :src="require('../assets/logo_white.png')" class="my-3" contain width="120" height = "50"></v-img>
            </v-flex>
            
            <v-flex xs12 sm12 md12 lg12>
                <h2 class="mt-12 pt-12">
                    국밥은 
                    <br>
                    한국인의 소울푸드로
                    <br>
                    조선시대부터 즐겨먹던 
                    <br>
                    전통의 가성비 음식입니다.
                </h2>

                <h2 class="pt-12">
                    집 밥같은 든든함으로 
                    <br>
                    여러분의 생활에 
                    <br>
                    큰 도움이 되고 싶습니다. 
                </h2>
            </v-flex>

            <v-flex xs12 sm12 md12 lg12 class="pt-12 pl-2">
                <v-btn :to="{name:'login'}" text id="start__btn">시작하기</v-btn>
                <v-btn :to="{name:'signUp'}" text id="signUp__btn">동참하기</v-btn>
            </v-flex>
        </v-layout>
    </v-container>
</template>


<style>
    #container{
        height: 100%;
        overflow: hidden;
    }

    h2{
        margin-left: 10px;
        font-family: '궁서';
    }

    #start__btn{
        color: white;
        font-size: 20px;
        font-family: '궁서';
        display: inline-block;
        margin-left: 40px;
    }
    
    
    #signUp__btn{
        color: white;
        font-size: 20px;
        font-family: '궁서';
        display: inline-block;
    }
    


</style>