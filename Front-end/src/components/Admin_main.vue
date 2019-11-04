<template>
<v-layout primary white--text class="pt-10">
  <v-card>
    <v-navigation-drawer
      expand-on-hover
      permanent
    >
      <template v-slot:prepend>
        <v-list>

          <v-list-item
            link
            two-line
          >
            <v-list-item-content>
              <v-list-item-title class="title">관리자</v-list-item-title>
              <v-list-item-subtitle>admin@gmail.com</v-list-item-subtitle>
            </v-list-item-content>
            <v-list-item-action>
              <v-icon>mdi-menu-down</v-icon>
            </v-list-item-action>
          </v-list-item>
        </v-list>
      </template>

      <v-divider></v-divider>

      <v-list
        nav
        dense
      >
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-store</v-icon>
          </v-list-item-icon>
          <v-list-item-title>가게 관리</v-list-item-title>
        </v-list-item>
        
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-account-multiple</v-icon>
          </v-list-item-icon>
          <v-list-item-title>사용자 관리</v-list-item-title>
        </v-list-item>

        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-alert</v-icon>
          </v-list-item-icon>
          <v-list-item-title>공지사항 관리</v-list-item-title>
        </v-list-item>
        
        <v-list-item link>
          <v-list-item-icon>
            <v-icon>mdi-help-circle-outline</v-icon>
          </v-list-item-icon>
          <v-list-item-title>공지사항 관리</v-list-item-title>
        </v-list-item>

      </v-list>

    </v-navigation-drawer>
  </v-card>

   <v-card
   class="mt-10 ml-10"
    color="#26c6da"
    dark
    min-width="300"
    max-width="400"
    max-height="150"
  >
    <v-card-title class="text-center">전체 사용자 수</v-card-title>
    <v-card-text class="display-2 font-weight-bold text-center">
      {{Members}}
    </v-card-text>

  </v-card>

   <v-card
   class="mt-10 ml-10"
    color="#eea138"
    dark
    min-width="300"
    max-width="400"
    max-height="150"
  >
    <v-card-title class="text-center">전체 가게 수</v-card-title>
    <v-card-text class="display-2 font-weight-bold text-center">
      {{Stores}}
    </v-card-text>

  </v-card>
  
</v-layout>
</template>

<script>
import axios from "axios";
export default {
 name: "about",
 data: function() {
   return {
       Stores:0,
       Members:0,
   };
 },
 mounted() {
    axios.get("http://192.168.31.66:8888/restaurant/count").then(res =>{
    this.Stores = res.data;
    });
    axios.get("http://192.168.31.66:8888/members/count").then(res =>{
    this.Members = res.data;
    });
 }
};
</script>