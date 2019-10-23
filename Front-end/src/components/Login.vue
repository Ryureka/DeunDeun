<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text>
        <v-container fluid>
            <v-card class="elevation-12" id="login__card">
              <v-toolbar color="primary" dark flat>
                <v-toolbar-title>Login</v-toolbar-title>
              </v-toolbar>
              <v-card-text>
                <v-form>
                  <v-text-field
                    label="Login"
                    name="login"
                    type="text"
                  ></v-text-field>

                  <v-text-field
                    id="password"
                    label="Password"
                    name="password"
                    type="password"
                  ></v-text-field>
                  
                </v-form>
              </v-card-text>
              <v-card-actions>
                <v-btn color="info">Find ID/PWD</v-btn>
                <v-btn color="primary">SignUp</v-btn>
                <v-spacer></v-spacer>
                <v-btn color="primary" :to="{name:'FoodCategory'}">Login</v-btn>
              </v-card-actions>
            </v-card>
        </v-container>
    </v-layout>
  </section>
</template>


<style>

  @media screen and (min-width: 1520px) {
    #login__card{
      margin-top: 150px;
      margin-bottom: 150px;
      margin-left: 440px;
       width: 600px;
    }
  }

   @media screen and (max-width: 600px) {
     #login__card{
       margin-top: 200px;
       margin-bottom: 200px;
     }
   }
  
</style>
