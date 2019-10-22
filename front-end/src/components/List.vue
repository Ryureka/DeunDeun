<template>
     <v-container fluid class="indigo darken-4 white--text" id="container">
        <v-layout text-left wrap> 
            <v-flex xs4 sm12 md12 lg12>
                <v-img :src="require('../assets/logo_white.png')" class="my-3" contain width="120" height = "50"></v-img>
            </v-flex>
            
            <!-- <v-flex xs4 sm12 md12 lg12> -->
            <v-flex>
                <v-card max-width="400" class="mx-auto indigo darken-4">
                    <v-row dense>
                        <v-col v-for="(item, i) in items" :key="i" cols="12">
                            <v-card :color="item.color" dark @click="$router.push({name: 'listDetail', params: {title: item.title}})">
                                <div class="d-flex flex-no-wrap justify-space-between">
                                    <div>
                                        <v-card-title class="headline" v-text="item.title"></v-card-title>
                                        <v-card-subtitle v-text="item.comment"></v-card-subtitle>
                                    </div>
                                    
                                    <v-avatar class="ma-3" size="120" tile>
                                        <v-img :src="item.src"></v-img>
                                    </v-avatar>
                                </div>
                            </v-card>
                        </v-col>
                    </v-row>
                </v-card>
            </v-flex>
            
        </v-layout>
    </v-container>
</template>

<script>
export default {
    data: () => ({
        items: [
            {
                color: '#705772',
                src: 'http://www.foodtoday.or.kr/data/photos/20190728/art_15625482325_55839d.jpg',
                title: 'Pizza',
                comment: '00개의 가게와 함께중'
            },
            {
                color: '#167879',
                src: 'http://img.hani.co.kr/imgdb/resize/2018/0221/00501270_20180221.JPG',
                title: 'FastFood',
                comment: '00개의 가게와 함께중'
            },
            {
                color: '#F3A953',
                src: 'http://www.목촌돼지국밥.kr/images/main/sec1_img1.jpg',
                title: 'KoreanFood',
                comment: '00개의 가게와 함께중'
            },
            {
                color: '#EB7070',
                src: 'http://newsimg.hankookilbo.com/2019/06/13/201906131771312569_8.jpg',
                title: 'Bread',
                comment: '00개의 가게와 함께중'
            },
            {
                color: '#CB4A57',
                src: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQh5nkcXRKdLFoHsXH4hA2udl0lrdZjgW9DMtCViL3R-47lwcx7',
                title: 'Meat',
                comment: '00개의 가게와 함께중'
            },
            {
                color: '#85A700',
                src: 'http://www.newsfc.co.kr/news/photo/201903/35508_25995_156.jpg',
                title: 'Chicken',
                comment: '00개의 가게와 함께중'
            },
            {
                color: '#255D36',
                src: 'http://kormedi.com/wp-content/uploads/2019/06/432212_5701.jpg',
                title: 'ChineseFood',
                comment: '00개의 가게와 함께중'
            },
        ],
    }),
}
</script>