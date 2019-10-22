<template>
     <v-container fluid class="indigo darken-4 white--text" id="container">
        <v-layout text-left wrap> 
            <v-flex xs4 sm12 md12 lg12>
                <v-img :src="require('../assets/logo_white.png')" class="my-3" contain width="120" height = "50"></v-img>
            </v-flex>

            <div v-if="title==='Pizza'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in pizzaitems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

            <div v-else-if="title==='FastFood'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in fastitems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

            <div v-else-if="title==='KoreanFood'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in koreantems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

            <div v-else-if="title==='Bread'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in breaditems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

            <div v-else-if="title==='Meat'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in meatitems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

            <div v-else-if="title==='Chicken'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in chickenitems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

            <div v-else-if="title==='ChineseFood'">
                <v-flex>
                    <v-card max-width="400" class="mx-auto indigo darken-4">
                        <v-row dense>
                            <v-col v-for="(item, i) in chineseitems" :key="i" cols="12">
                                <v-card color="#385F73" dark>
                                    <div class="d-flex flex-no-wrap justify-space-between">
                                        <div>
                                            <v-card-title class="headline" v-text="item.name"></v-card-title>
                                            <v-card-subtitle>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-subtitle>
                                            <v-card-subtitle>인기메뉴 {{item.menu}}</v-card-subtitle>
                                        </div>

                                        <v-avatar class="ma-3" size="135" tile>
                                            <v-img :src="item.src"></v-img>
                                        </v-avatar>
                                    </div>
                                </v-card>
                            </v-col>
                        </v-row>
                    </v-card>
                </v-flex>
            </div>

        </v-layout>
    </v-container>
</template>

<script>
export default {
    data:() => {
        return {
            title: 'no title',
            pizzaitems: [
                {
                    name: '7번가피자 노은점',
                    money: '20,000',
                    time: '30~40',
                    menu: '반앤반피자, 칠리새우피자',
                    src: 'https://www.7thpizza.com/files/MENU/421ACDD2FBAA40849738116DBDF8F6DF.jpg'
                },
                {
                    name: '업텐브로피자-8호점',
                    money: '14,000',
                    time: '50~60',
                    menu: '브라더박스, 리얼게살쉬림프',
                    src: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRIAD0LyU44tVsCePOQupghlHc8JGHALlPIyysJa-psAHcS51kW9Q'
                }
            ],
            fastitems: [
                {
                    name: '롯데리아-대전한밭대점',
                    money: '11,000',
                    time: '35~45',
                    menu: '오징어버거세트, DoubleX2세트',
                    src: 'http://adventure.lotteworld.com/image/2018/6/20180620024530213_574.jpg'
                },
                {
                    name: '맘스터치 한밭대점',
                    money: '15,000',
                    time: '50~60',
                    menu: '언빌리버블버거, 인크레더블버거',
                    src: 'http://img1.tmon.kr/cdn3/deals/2019/08/13/2342957066/original_2342957066_front_ff481_1565686275production.jpg'
                }
            ],
            koreantems: [
                {
                    name: '송탄오공손 부대찌개',
                    money: '19,000',
                    time: '35~45',
                    menu: '송탄 오공손 부대찌개',
                    src: 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRb5wEaBM8g1VAcvLMIeaDCnhxdLd1gDUbEXGbKw9Kp_zhL9wTq3A'
                },
                {
                    name: '소소한밥상',
                    money: '16,000',
                    time: '46~56',
                    menu: '제육볶음, 콩나물불고기',
                    src: 'https://mblogthumb-phinf.pstatic.net/MjAxNzA2MjhfMjQz/MDAxNDk4NjI2NDc5ODgz.cBu2zv4zs5Q4gmJI7_zDwz9DtkwDIsCD7XWwzRFIJIgg.abJLiHcQ6L-_rcJfHPUWuShyPFwE1j6ZoSmAazATgg8g.JPEG.younju0911/image_2815000671498626169525.jpg?type=w800'
                }
            ],
            breaditems: [
                {
                    name: '던킨도너츠 대전노은점',
                    money: '10,000',
                    time: '56~66',
                    menu: '버라이어티6EA, 블랙버블라떼',
                    src: 'http://item.ssgcdn.com/93/76/32/item/0000005327693_i1_1200.jpg'
                },
                {
                    name: 'HOTDOGLAB N SUDA',
                    money: '9,900',
                    time: '45~55',
                    menu: '더블세트, 한 끼 샐러드세트',
                    src: 'https://t1.daumcdn.net/cfile/tistory/992B31465D59142038'
                }
            ],
            meatitems: [
                {
                    name: '콩불파불',
                    money: '16,000',
                    time: '46~56',
                    menu: '돼지갈비찜, 묵은지갈비찜',
                    src: 'https://mblogthumb-phinf.pstatic.net/MjAxNzA4MTFfMTIx/MDAxNTAyNDU3MDE2ODM5.jPro0XGiL6r1j_lL2n10XFFUJYescqMiFUdY0Uub0Vwg.W29rLAnjGaq8RFmG9ge-BdVEisYO0u5NVzneCuV_AN8g.JPEG.pa6385/2017-08-11-18-50-26.jpg?type=w800'
                },
                {
                    name: '집으로돼지&갈비 목원대점',
                    money: '10,000',
                    time: '47~57',
                    menu: '삼겹 SET (공기밥 미포함), 삼겹살 (김치찌개 공기밥 미포함)',
                    src: 'http://kookmingalbi.com/files/attach/images/2612/014/006/585b4b096b1e230248e6e71425efb778.jpg'
                }
            ],
            chickenitems: [
                {
                    name: '교촌치킨 노은1지구점',
                    money: '15,000',
                    time: '47~57',
                    menu: '교촌오리지날, 교촌레드오리지날',
                    src: 'http://www.kyochonfnb.com/ADM_uploadFiles/EDITOR/R658x0.jpg'
                },
                {
                    name: '처갓집양념치킨 한밭대점',
                    money: '13,000',
                    time: '43~53',
                    menu: '더화이트골드치즈, 더화이트레몬파채',
                    src: 'http://www.cheogajip.co.kr/theme/v3/img/main_menu_chicken_on.png'
                }
            ],
            chineseitems: [
                {
                    name: '짜장1번가',
                    money: '5,000',
                    time: '46~56',
                    menu: '싱글 1, 코스 1',
                    src: 'http://kormedi.com/wp-content/uploads/2019/06/432212_5701.jpg',
                },
                {
                    name: '노은각',
                    money: '4,500',
                    time: '27~37',
                    menu: '돈짬뽕, 속풀이짬뽕',
                    src: 'https://cdn.imweb.me/thumbnail/20190615/26b709dad30f3.jpg'
                }
            ],
        }
    },
    mounted() {
        this.title = this.$route.params.title
    }
}
</script>