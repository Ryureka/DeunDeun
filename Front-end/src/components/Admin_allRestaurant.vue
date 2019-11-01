<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text class="pt-10">
        <v-container fluid>
            <v-card>
                <v-card-title>
                All Restaurant
                <v-spacer></v-spacer>
                    <v-text-field
                        v-model="search"
                        label="Search"
                        single-line
                        hide-details
                    ></v-text-field>


                    <!-- Modal Area -->
                     <v-dialog v-model="dialog" persistent max-width="600px">
                        <template v-slot:activator="{ on }">
                            <v-btn class="ml-5" color="primary" v-on="on">등록</v-btn>
                        </template>
                        <v-card>
                            <v-card-title>
                            <span class="headline">New Restaurant</span>
                            </v-card-title>
                            <v-card-text>
                            <v-container>
                                <v-row>
                                <v-col cols="12" sm="6" md="4">
                                    <v-text-field label="Legal first name*" required></v-text-field>
                                </v-col>
                                <v-col cols="12" sm="6" md="4">
                                    <v-text-field label="Legal middle name" hint="example of helper text only on focus"></v-text-field>
                                </v-col>
                                <v-col cols="12" sm="6" md="4">
                                    <v-text-field
                                    label="Legal last name*"
                                    hint="example of persistent helper text"
                                    persistent-hint
                                    required
                                    ></v-text-field>
                                </v-col>
                                <v-col cols="12">
                                    <v-text-field label="Email*" required></v-text-field>
                                </v-col>
                                <v-col cols="12">
                                    <v-text-field label="Password*" type="password" required></v-text-field>
                                </v-col>
                                <v-col cols="12" sm="6">
                                    <v-select
                                    :items="['0-17', '18-29', '30-54', '54+']"
                                    label="Age*"
                                    required
                                    ></v-select>
                                </v-col>
                                <v-col cols="12" sm="6">
                                    <v-autocomplete
                                    :items="['Skiing', 'Ice hockey', 'Soccer', 'Basketball', 'Hockey', 'Reading', 'Writing', 'Coding', 'Basejump']"
                                    label="Interests"
                                    multiple
                                    ></v-autocomplete>
                                </v-col>
                                </v-row>
                            </v-container>
                            <small>*indicates required field</small>
                            </v-card-text>
                            <v-card-actions>
                            <v-spacer></v-spacer>
                            <v-btn color="blue darken-1" text @click="dialog = false">Close</v-btn>
                            <v-btn color="blue darken-1" text @click="dialog = false">Save</v-btn>
                            </v-card-actions>
                        </v-card>
                    </v-dialog>


                    <v-btn class="ml-5" color="warning" @click="deleteStore">삭제</v-btn>
                </v-card-title>
                <v-data-table
                    v-model="selected"
                    show-select
                    item-key="restaurant_id"
                    :headers="headers"
                    :items="restaurant"
                    :search="search"
                ></v-data-table>
            </v-card>


           
        </v-container>
    </v-layout>
  </section>
</template>


<script>

    import axios from "axios";

    export default {
        data: function() {
        return {
            dialog: false,
            selected: [],
            search: '',
            headers: [
            {
                text: '가게 이름',
                align: 'left',
                value: 'name',
            },
            { text: '전화번호', value: 'tel' },
            { text: '영업시간', value: 'operation_hour' },
            { text: '상호명', value: 'company_name' },
            ],
            restaurant : [],
        };
    },
    mounted() {
        axios({
            url: "http://192.168.31.66:8888/restaurant/",
            method: "get",
            params: {
            }
        }).then(res => {
            this.restaurant = res.data
        });
    },
    methods:{
        deleteStore: function(){
            console.log(this.selected)
        }
    }
    };
    
</script>