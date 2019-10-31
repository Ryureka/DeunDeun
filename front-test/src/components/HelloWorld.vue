<template>
  <div id="HelloWorld">
    <div class="hello">
      <h1>{{ msg }}</h1>
    </div>

    <h3>My Google Maps Demo</h3>
    <!--The div element for the map -->
    <p>lng {{ now_x }} , lat {{ now_y }}</p>

    <div id="map"></div>
  </div>
</template>

<script>
import axios from "axios";
import gmapsInit from "../utils/gmaps.js";

export default {
  name: "HelloWorld",
  data: function() {
    return {
      now_x: "",
      now_y: "",
      restaurant: {}
    };
  },
  props: {
    msg: String
  },
  created() {},
  async mounted() {
    try {
      const google = await gmapsInit();
      const geocoder = new google.maps.Geocoder();
      const map = new google.maps.Map(document.getElementById("map"));

      var Item_1 = new google.maps.LatLng(36.348082038993525, 127.2956595737923);

      var myPlace = new google.maps.LatLng(36.353477961006476, 127.3023592262077);

      var bounds = new google.maps.LatLngBounds();
      bounds.extend(myPlace);
      bounds.extend(Item_1);
      map.fitBounds(bounds);
      map.setCenter(Item_1);

      /* geocoder.geocode({ address: "South Korea" }, (results, status) => {
        if (status !== "OK" || !results[0]) {
          throw new Error(status);
        }

        map.setCenter(results[0].geometry.location);
        map.fitBounds(results[0].geometry.viewport);
        console.log(results);
      }); */
    } catch (error) {
      console.error(error);
    }

    axios({
      url: "https://www.googleapis.com/geolocation/v1/geolocate",
      method: "post",
      params: {
        key: "AIzaSyBjg8cR_tJB7iQCXQHpxzAZNERPK1sR5JQ"
      }
    }).then(res => {
      console.log("geolocation ", res);
      this.now_x = res.data.location.lng;
      this.now_y = res.data.location.lat;
    });
  },
  methods: {}
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

/* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
#map {
  height: 500px;
}
</style>