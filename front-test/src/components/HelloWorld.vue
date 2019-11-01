<template>
  <div id="HelloWorld">
    <div class="hello">
      <h1>{{ msg }}</h1>
    </div>

    <h3>My Google Maps Demo</h3>
    <!--The div element for the map -->
    <p>lng {{ now_x }} , lat {{ now_y }}</p>
    
    <div id="map"></div>

    <table>
    <tr>
      <th>순번</th>
      <th>식당</th>
      <th>위치X</th>
      <th>위치Y</th>
      <th>가격</th>
    </tr>
    <tr v-for="(res, index) in restaurant" :key='res.restaurant_id'>
      <td>{{index}}</td>
      <td v-bind="{id : 'restaurant' + res.restaurant_id}" v-on:mouseover='overTest(index)'>{{res.name}}</td>
      <td>{{res.location_x}}</td>
      <td>{{res.location_y}}</td>
      <td>{{res.price}}</td>
    </tr>
    </table>
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
      restaurant: {},
      rms:[]
    };
  },
  props: {
    msg: String
  },
  created() {},
  async mounted() {
    let overTest
    // 구글맵스 지도 객체 생성
    let map;
    let myMarker;
    let resMarkers = [];
    let markerInfo;
    try {
      const google = await gmapsInit();
      const geocoder = new google.maps.Geocoder();
      map = new google.maps.Map(document.getElementById("map"));
    } catch (error) {
      console.error(error);
    }

    // 현재 위치 가져오기
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
      // 현재 위치를 저장할 객체 생성
      var myPlace = new google.maps.LatLng(
        // this.now_y, this.now_x
        36.3491011, 127.2983324
        );
      // 맵 설정
      map.setCenter(myPlace);
      map.setZoom(18);
      // 내 위치 마커
      var myMarker = new google.maps.Marker();
      myMarker.setPosition(myPlace);
      myMarker.setMap(map);
      // 내 위치 마커 이미지
      var markerImage = new google.maps.MarkerImage(
        "https://cdn1.iconfinder.com/data/icons/relief-photo-editor-glyph/32/account-people-avatar-circle-512.png",
        null,
        null,
        null,
        new google.maps.Size(38, 38)
      );
      // 내 위치 마커 설정
      myMarker.setIcon(markerImage);
      myMarker.setAnimation(google.maps.Animation.DROP);

      // 주변 상가 객체 가져오기
      axios({
        url: "http://192.168.31.66:8888/restaurant/here",
        method: "get",
        params: {
          // lon: this.now_x,
          // lat: this.now_y,
          lon: 127.2983324,
          lat: 36.3491011,
          range: 100
        }
      }).then(res => {
        console.log("주변", this.now_x + ", " + this.now_y);
        console.log("주변 상가", res.data);
        this.restaurant = res.data
        res.data.forEach(restaurant => {
          // 주변 상가 객체
          var resPlace = new google.maps.LatLng(
            restaurant.location_y,
            restaurant.location_x
          );
          // 주변 상가 마커
          var resMarker = new google.maps.Marker();
          resMarker.setPosition(resPlace);
          resMarker.setMap(map);
          // 상가 마커 이미지
          var resImage = new google.maps.MarkerImage(
            "https://image.winudf.com/v2/image/Y29tLmhvYmlnLnR0dWtiYWVnaV9pY29uXzE1Mjk5Mjg0NjFfMDQ3/icon.png?w=170&fakeurl=1",
            null,
            null,
            null,
            new google.maps.Size(38, 38)
          );
          // 상가 마커 설정
          resMarker.setIcon(resImage);
          window.setTimeout(function() {
            resMarker.setAnimation(google.maps.Animation.DROP);
          }, restaurant.restaurant_id);
          // 마커의 정보 정의
          var contentString =
            '<div id = '+'restaurant'+restaurant.restaurant_id+'>' 
            +'<div>'
            +restaurant.name
            +'</div>'
            +'<div>'
            +'영업시간 : '
            +restaurant.operation_hour
            +'</div>'
            + "</div>";
          // 마커 객체에 정보 주입  
          markerInfo = new google.maps.InfoWindow({
            content : contentString
          });
          // 마커 클릭 이벤트
          resMarker.addListener('click', function(){
            markerInfo.open(map, resMarker)
          })
          resMarkers.push(resMarker)
        });
        this.rms = resMarkers
      });
    });
  },
  methods: {
    overTest : function(id){
      alert(index)
    }
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

/* Always set the map height explicitly to define the size of the div
       * element that contains the map. */
#map {
  height: 500px;
}
</style>