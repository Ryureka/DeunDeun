<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout info white--text class="pt-10">
        <v-container fluid>
             <v-row>
                <v-col
                    cols="12"
                    md="4"
                >
                    <v-card
                    class="pa-2"
                    max-width="374"
                    outlined
                    tile
                    >
                        <v-img
                            height="250"
                            src="https://cdn.vuetifyjs.com/images/cards/cooking.png"
                            ></v-img>

                            <v-card-title>{{store.name}}</v-card-title>

                            <v-card-text>
                            <v-row
                                align="center"
                                class="mx-0"
                            >
                            </v-row>

                            <div class="my-4 subtitle-1 black--text">
                                영업중
                            </div>

                            <div>전화 번호 : {{store.tel}}<br> 영업시간 : {{store.operation_hour}}</div>
                            </v-card-text>

                            <v-divider class="mx-4"></v-divider>

                            <v-card-title>장바구니</v-card-title>
                            
                            <v-card-text>
                              1국밥 = 7,000원  
                            </v-card-text>
                            <v-card-text>
                              현재 금액 : {{totalCalculate}} 원<br>
                              국밥 개수 : {{CalcuGB}} 개
                            </v-card-text>
                            <v-card-text>
                            <v-chip-group
                                  v-model="selection"
                                  column
                              >   
                                  <v-chip v-for="(selected, i) in selected" :key="i">{{selected.name}}</v-chip>
                              </v-chip-group>
                            </v-card-text>


                    </v-card>
                </v-col>

                <!--Table-->
            <v-col
                cols="12"
                md="8"
                xs="12"
            >
                <v-card
                class="pa-2"
                outlined
                tile
                >
                    <v-data-table
                        v-model="selected"
                        show-select
                        :headers="headers"
                        :items="foods"
                        item-key="name"
                        group-by="국밥개수"
                        class="elevation-1"
                        sort-by="price"
                        sort-desc=""
                    ></v-data-table>
                </v-card>
            </v-col>
            </v-row>
        </v-container>
    </v-layout>
  </section>
</template>

<!--
<script>
  export default {
    data: () => ({
      total_price : 0,
      selected: [],
      selection: 1,
       headers: [
          {
            text: 'Menu',
            align: 'left',
            value: 'name'
          },
          { text: 'Price', value:'price'},
          { text: 'Category', value: 'category'},
        ],
        desserts: [
          {
            name: 'Frozen Yogurt',
            category: 'Ice cream',
            price: 2000,
          },
          {
            name: 'Ice cream sandwich',
            category: 'Ice cream',
            price: 4000,
          },
          {
            name: 'Eclair',
            category: 'Cookie',
            price: 3000,
          },
          {
            name: 'Cupcake',
            category: 'Pastry',
            price: 6000,
          },
          {
            name: 'Gingerbread',
            category: 'Cookie',
            price: 2200,
          },
          {
            name: 'Jelly bean',
            category: 'Candy',
            price: 2700,
          },
          {
            name: 'Lollipop',
            category: 'Candy',
            price: 3200,
          },
          {
            name: 'Honeycomb',
            category: 'Toffee',
            price: 10000,
          },
          {
            name: 'Donut',
            category: 'Pastry',
            price: 4500,
          },
          {
            name: 'KitKat',
            category: 'Candy',
            price: 1000,
          },
        ],
    }),

    computed : {
      totalCalculate : function() {
        this.total_price = 0
        this.selected.forEach(item => {
          this.total_price += item.price
        });
        return this.total_price;
      }
    }

  }
</script>
-->

<script>
import axios from "axios";
export default {
 name: "about",
 data: function() {
   return {
      total_price : 0,
      selection: 1,
      selected: [],
      headers: [
        {
          text: 'Menu',
            align: 'left',
            value: 'name'
          },
          { text: 'Price', value:'price'},
          { text: '국밥', value: '국밥개수'},
        ],
     foods : [],
     store:[],
     GB : 0,
   };
 },
 mounted() {
   

   var store = this.$route.params.storeNo;
     axios.get("http://192.168.31.66:8888/food/"+store).then(res => {
       this.foods = res.data

      var step = 0;
      res.data.forEach(food => {
        var temp = 0;
        temp = food.price / 7000;
        res.data[step].국밥개수 = parseInt(temp);
        step++;
      });
      console.log(res.data);

      axios.get("http://192.168.31.66:8888/restaurant/"+store).then(res =>{
        this.store = res.data;
      });
   });
 },
 computed : {
      totalCalculate : function() {
        this.total_price = 0
        this.selected.forEach(item => {
          this.total_price += item.price
        });
        return this.total_price;
      },

      CalcuGB : function(){
        var total_price = this.total_price;
        this.GB = total_price/7000;
        return parseInt(this.GB);
      }
    }
};
</script>