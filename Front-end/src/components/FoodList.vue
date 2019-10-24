<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text>
        <v-container fluid grid-list-md>
          <br><br><br>
          
          <!-- <div v-if="category==='all'">
            <v-card id="cards__small" width="300" height="170" v-for="(item, i) in allitems" :key="i">
              <v-img
              id="cards__image__rect" height="170"
              :src="require('@/assets/Category/AllFood.jpg')"
              class="white--text align-start"
              gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)"
              >
                <v-card-title class="headline" v-text="item.name"></v-card-title>
                <v-card-title>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</v-card-title>
              </v-img>
            </v-card>
          </div> -->

      <!-- ////////////////////////////////////////////////////////////////////////////// -->

      <!-- <div v-if="category==='all'">
      <v-card>
        <v-container fluid grid-list-md>
          <v-layout row wrap>
            <v-flex
              v-for="item in allitems"
              v-bind="{ [`xs${item.flex}`]: true }"
              :key="item.name"
            >
              <v-card>
                <v-card-media
                  height="200px"
                >
                  <v-container fill-height fluid>
                    <v-layout fill-height>
                      <v-flex xs12 align-end flexbox>
                        <span class="headline black--text" v-text="item.name"></span>
                        <br><br><br>
                        <span>최소주문금액 {{item.money}}원<br>배달시간 {{item.time}}분</span>
                      </v-flex>
                    </v-layout>
                  </v-container>
                </v-card-media>

              </v-card>
            </v-flex>
          </v-layout>
        </v-container>
      </v-card>
      </div> -->
      
      <!-- ////////////////////////////////////////////////////////////////////////////// -->
      
      <div v-if="category==='all'">
        <v-layout row wrap>
          <!-- <v-flex d-flex xs12 sm6 md4>
            <v-card color="purple" dark>
              <v-card-title primary class="title">name</v-card-title>
              <v-card-text>최소주문금액 money원<br>배달시간 time분</v-card-text>
            </v-card>
          </v-flex> -->
          
          <v-flex d-flex xs12 sm6 md3>
            <v-layout row wrap>
              <v-flex d-flex>
                <v-card color="indigo" dark>
                  <v-card-text>내용ㄴㅇㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴㄴ</v-card-text>
                </v-card>
              </v-flex>
              
              <v-flex d-flex>
                <v-layout row wrap>
                  <v-flex v-for="n in 2" :key="n" d-flex xs12>
                    <v-card color="red lighten-2" dark>
                      <v-card-text>내용</v-card-text>
                    </v-card>
                  </v-flex>
                </v-layout>
              </v-flex>
              
            </v-layout>
          </v-flex>
          
          <!-- <v-flex d-flex xs12 sm6 md2 child-flex>
            <v-card color="green lighten-2" dark>
              <v-card-text>내용</v-card-text>
            </v-card>
          </v-flex>
          
          <v-flex d-flex xs12 sm6 md3>
            <v-card color="blue lighten-2" dark>
              <v-card-text>내용</v-card-text>
            </v-card>
          </v-flex> -->

        </v-layout>
        
      </div>





      <!-- ////////////////////////////////////////////////////////////////////////////// -->

            
        </v-container>
    </v-layout>
  </section>
</template>

<script>
export default {
  data:() => {
    return {
      category: 'no',
      allitems: [
        {
                    name: '7번가피자 노은점',
                    money: '20,000',
                    time: '30~40',
                    flex: 4
                },
                {
                    name: '업텐브로피자-8호점',
                    money: '14,000',
                    time: '50~60',
                    flex: 4
                },
                {
                    name: '롯데리아-대전한밭대점',
                    money: '11,000',
                    time: '35~45',
                    flex: 4
                },
                {
                    name: '맘스터치 한밭대점',
                    money: '15,000',
                    time: '50~60',
                    flex: 4
                },
                {
                    name: '송탄오공손 부대찌개',
                    money: '19,000',
                    time: '35~45',
                    flex: 4
                },
                {
                    name: '소소한밥상',
                    money: '16,000',
                    time: '46~56',
                    flex: 4
                },
                {
                    name: '던킨도너츠 대전노은점',
                    money: '10,000',
                    time: '56~66',
                    flex: 4
                },
                {
                    name: 'HOTDOGLAB N SUDA',
                    money: '9,900',
                    time: '45~55',
                    flex: 4
                },
                {
                    name: '콩불파불',
                    money: '16,000',
                    time: '46~56',
                    flex: 4
                },
                {
                    name: '집으로돼지&갈비 목원대점',
                    money: '10,000',
                    time: '47~57',
                    flex: 4
                },
                {
                    name: '교촌치킨 노은1지구점',
                    money: '15,000',
                    time: '47~57',
                    flex: 4
                },
                {
                    name: '처갓집양념치킨 한밭대점',
                    money: '13,000',
                    time: '43~53',
                    flex: 4
                },
                {
                    name: '짜장1번가',
                    money: '5,000',
                    time: '46~56',
                    flex: 4
                },
                {
                    name: '노은각',
                    money: '4,500',
                    time: '27~37',
                    flex: 4
                }
      ],
      cards: [
        { title: 'Pre-fab homes', src: '/static/doc-images/cards/house.jpg', flex: 12 },
        { title: 'Favorite road trips', src: '/static/doc-images/cards/road.jpg', flex: 6 },
        { title: 'Best airlines', src: '/static/doc-images/cards/plane.jpg', flex: 6 },
        { title: 'Pre-fab homes', src: '/static/doc-images/cards/house.jpg', flex: 4},
        { title: 'Favorite road trips', src: '/static/doc-images/cards/road.jpg', flex: 4 },
        { title: 'Best airlines', src: '/static/doc-images/cards/plane.jpg', flex: 4 }
      ]
    }
  },
  mounted() {
    this.category = this.$route.params.category
  }
}
</script>