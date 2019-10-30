<template>
  <div class="about">
    <h1>This is an about page</h1>

    <p>x : {{now_x}}</p>
    <p>y : {{now_y}}</p>

    <table>
    <tr>
      <th>식당</th>
      <th>위치X</th>
      <th>위치Y</th>
      <th>가격</th>
    </tr>
    <tr v-for='res in restaurant' :key='res.restaurant_id'>
      <td>{{res.name}}</td>
      <td>{{res.location_x}}</td>
      <td>{{res.location_y}}</td>
      <td>{{res.price}}</td>
    </tr>

    </table>
  </div>
</template>

<script>
import axios from "axios";
export default {
  name: "about",
  data: function() {
    return {
      restaurant : {},
      now_x : 0.0,
      now_y : 0.0
    };
  },
  mounted() {
      axios.get("http://localhost:8888/restaurant/lowest").then(res => {
      console.log(res.data);
      this.restaurant = res.data
    });

    axios({
      url: "https://www.googleapis.com/geolocation/v1/geolocate",
      method: "post",
      params: {
        key : "AIzaSyBjg8cR_tJB7iQCXQHpxzAZNERPK1sR5JQ"
      }
    }).then(res => {
      console.log("geo ", res.data.location),
      this.now_x = res.data.location.lng,
      this.now_y = res.data.location.lat

        axios({
        url: "http://localhost:8888/restaurant/here",
        method: "get",
        params: {
          lon : this.now_x,
          lat : this.now_y,
          range : 100
        }
      }).then(res => {
        console.log("", this.now_x+", "+this.now_y)
      });
    });
  }
};
</script>
