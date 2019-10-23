<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text>
        <v-container fluid>
          <br>
          
          <div v-if="category==='all'">
            <v-card id="cards__small" height="170" v-for="(item, i) in allitems" :key="i">
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
          </div>



            
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
                    time: '30~40'
                },
                {
                    name: '업텐브로피자-8호점',
                    money: '14,000',
                    time: '50~60'
                },
                {
                    name: '롯데리아-대전한밭대점',
                    money: '11,000',
                    time: '35~45'
                },
                {
                    name: '맘스터치 한밭대점',
                    money: '15,000',
                    time: '50~60'
                },
                {
                    name: '송탄오공손 부대찌개',
                    money: '19,000',
                    time: '35~45'
                },
                {
                    name: '소소한밥상',
                    money: '16,000',
                    time: '46~56'
                },
                {
                    name: '던킨도너츠 대전노은점',
                    money: '10,000',
                    time: '56~66'
                },
                {
                    name: 'HOTDOGLAB N SUDA',
                    money: '9,900',
                    time: '45~55'
                },
                {
                    name: '콩불파불',
                    money: '16,000',
                    time: '46~56'
                },
                {
                    name: '집으로돼지&갈비 목원대점',
                    money: '10,000',
                    time: '47~57'
                },
                {
                    name: '교촌치킨 노은1지구점',
                    money: '15,000',
                    time: '47~57'
                },
                {
                    name: '처갓집양념치킨 한밭대점',
                    money: '13,000',
                    time: '43~53'
                },
                {
                    name: '짜장1번가',
                    money: '5,000',
                    time: '46~56'
                },
                {
                    name: '노은각',
                    money: '4,500',
                    time: '27~37'
                }
      ]
    }
  },
  mounted() {
    this.category = this.$route.params.category
  }
}
</script>