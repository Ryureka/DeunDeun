<template>
  <div>
    <v-app-bar
      color="indigo darken-4"
      dense
      dark
      fixed=""
      hide-on-scroll=""
    > 
      <div>
        <v-img :src="require('@/assets/logo_white.png')" width="100"></v-img>
      </div>
      <v-spacer></v-spacer>
      <HeadMenu/>

    </v-app-bar>
  </div>
</template>

<script>
export default {
  components: {
    HeadMenu : () => import('@/components/HeadMenu')
  }
}
</script>