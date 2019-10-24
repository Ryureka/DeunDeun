<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text>
        <v-container fluid>
            <v-expansion-panels>
                <v-expansion-panel
                v-for="(item,i) in 5"
                :key="i"
                >
                <v-expansion-panel-header>Item</v-expansion-panel-header>
                <v-expansion-panel-content>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.
                </v-expansion-panel-content>
                </v-expansion-panel>
            </v-expansion-panels>
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
