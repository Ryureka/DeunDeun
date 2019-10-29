<template>
  <div>
    <v-btn
      v-for="(item, i) in items.slice(0, large ? items.length : 3)"
      :key="i"
      fab
      class="ma-2"
      small
      :large="large"
      color="transparent"
      :to="{name:item.page}"
    >
      <v-icon
        dark
        v-text="item.icon"
      />
    </v-btn>
  </div>
</template>

<script>
export default {
  props: {
    large: {
      type: Boolean,
      default: false
    }
  },

  data: () => ({
    items: [
      {
        name: 'FAQ',
        icon: 'mdi-help-circle-outline',
        page: 'FAQ'
      },
      {
        name: 'Notice',
        icon: 'mdi-alert-decagram',
        page: 'Notice'
      },
      {
        name: 'Account',
        icon: 'mdi-account',
        page: 'FoodCategory'
      }
    ]
  })
}
</script>
