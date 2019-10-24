<template>
  <v-toolbar
    v-scroll="onScroll"
    :color="isTransparent ? 'transparent' : '#5b5c79'"
    app
    flat
  > 
  <div style="background-color: #5b5c79; border-radius: 10px 10px 10px 10px; width:150px" class="mt-0.5 ">
      <v-img :src="require('@/assets/logo_white.png')" width="120" class="ml-2"/>
  </div>

    <v-spacer />
    <HeadMenu />
  </v-toolbar>
</template>

<script>
export default {
  components: {
    HeadMenu: () => import('@/components/HeadMenu')
  },

  data: () => ({
    isTransparent: true
  }),

  methods: {
    onScroll () {
      this.isTransparent = window.pageYOffset < 200
    }
  }
}
</script>
