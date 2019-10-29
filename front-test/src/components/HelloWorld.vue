<template>
  <div>
    <div class="hello">
      <h1>{{ msg }}</h1>
    </div>

    <h3>My Google Maps Demo</h3>
    <!--The div element for the map -->
    <p>{{ now_x }}</p>
    <p>{{ now_y }}</p>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "HelloWorld",
  data: function() {
    return {
      now_x : '',
      now_y : '',
      restaurant: {}
    };
  },
  props: {
    msg: String
  },
  mounted() {
  
    axios({
      url: "https://www.googleapis.com/geolocation/v1/geolocate",
      method: "post",
      params: {
        key : "AIzaSyBjg8cR_tJB7iQCXQHpxzAZNERPK1sR5JQ"
      }
    }).then(res => {
      console.log("geolocation ", res);
      this.now_x = res.data.location.Lng,
      this.now_y = res.data.location.Iat
    });
  }
};
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}
</style>