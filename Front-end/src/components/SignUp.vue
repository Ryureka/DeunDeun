<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout info white--text>
        <v-container fluid>
            <v-card class="elevation-12" id="login__card">
              <v-toolbar color="info" dark flat>
                <v-toolbar-title>Sign up</v-toolbar-title>
              </v-toolbar>
              <v-card-text>
                <v-form>
                  <v-text-field
                    label="E-mail"
                    name="login"
                    type="text"
                  ></v-text-field>

                <div id="password">
                  <v-text-field
                    label="Repeat Password"
                    name="password"
                    type="password"
                  ></v-text-field>
                </div>

                <div id="password__left">
                  <v-text-field
                    label="Password"
                    name="password"
                    type="password"
                  ></v-text-field>
                </div>

                  <v-text-field
                    label="Name"
                    name="login"
                    type="text"
                  ></v-text-field>
                  
                </v-form>
              </v-card-text>
              <v-card-actions>
                <v-btn color="info">Find ID/PWD</v-btn>
                <v-btn color="primary" :to="{name:'Login'}">Back</v-btn>
                <v-spacer></v-spacer>
                <v-btn color="primary" :to="{name:'Login'}">SignUp</v-btn>
              </v-card-actions>
            </v-card>
        </v-container>
    </v-layout>
  </section>
</template>


<style>

    @media screen and (min-width: 1520px) {
        #password{
            width: 260px;
            float: right;
        }

        #password__left{
            width: 260px;
        }
        
    }

    @media screen and (max-width: 600px) {
        
    }
  
</style>
