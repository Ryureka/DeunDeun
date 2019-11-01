<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text class="pt-10">
        <v-container fluid>
            <!-- h1까지 지우고 하세요-->

                <v-flex>
                        <v-row dense>
                            <v-col v-for="(item, i) in restaurant" :key="i" cols="12" xs="4" sm="6" md="4">
                                <v-card color="#000000" dark min-height="214"  @click="$router.push({name: 'StoreDetail', params: {storeNo: item.restaurant_id}})"> 
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>대표메뉴 가격 {{item.price}} 원<br>영업시간  {{item.operation_hour}}분</v-card-subtitle>
                                            <v-card-subtitle>전화번호 {{item.tel}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                </v-flex>
        </v-container>
    </v-layout>
  </section>
</template>


<script>

    import axios from "axios";

    export default {
            name: "about",
            data: function() {
            return {
            restaurant : {},
            now_x : 0.0,
            now_y : 0.0,
            range : 1000
        };
    },
    mounted() {
    var cate = this.$route.params.category;
    var cateNum = 0;

    if (cate == 'one') {
        cateNum = 1
    }else if(cate == 'franchise'){
        cateNum = 2
    }else if(cate == 'chicken'){
        cateNum = 3
    }else if(cate == 'pizza'){
        cateNum = 4
    }else if(cate == 'chinese'){
        cateNum = 5
    }else if(cate == 'korean'){
        cateNum = 6
    }else if(cate == 'japanese'){
        cateNum = 7
    }else if(cate == 'pig'){
        cateNum = 8
    }else if(cate == 'night'){
        cateNum = 9
    }else if(cate == 'ddeok'){
        cateNum = 10
    }else if(cate == 'cafe'){
        cateNum = 11
    }

    var urltest= ""
    
    if(cate != 'all'){
        urltest = "http://192.168.31.66:8888/category/"+cateNum+"/";
    }else {
        urltest = "http://localhost:8888/restaurant/here";
    }
    axios({
        url: "https://www.googleapis.com/geolocation/v1/geolocate",
        method: "post",
        params: {
        key : "AIzaSyBjg8cR_tJB7iQCXQHpxzAZNERPK1sR5JQ"
        }
    }).then(res => {
        console.log("geo ", res.data.location),
        this.now_x = res.data.location.lng,
        this.now_y = res.data.location.lat
        axios({
            url: urltest,
            method: "get",
            params: {
            // lon : this.now_x,
            // lat : this.now_y,
            // range : 1000
            lon : 127.2990094,
            lat : 36.35078,
            range : this.range
            }
        }).then(res => {
            console.log(res)
            this.restaurant = res.data
        });
    });
        }
    };
</script>