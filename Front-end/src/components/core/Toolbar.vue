<template>
  <v-toolbar
    v-scroll="onScroll"
    :color="isTransparent ? 'transparent' : '#4e5381e6'"
    app
    flat
  > 
  <div>
      <v-img :src="require('@/assets/logo_white.png')" width="120"/>
  </div>

    <v-spacer />
    <SocialMedia />
  </v-toolbar>
</template>

<script>
export default {
  components: {
    SocialMedia: () => import('@/components/SocialMedia')
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
