package com.ssafy.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.api.dto.Restaurant;
import com.ssafy.api.service.RestaurantService;

@CrossOrigin("*")
@RestController
@RequestMapping("/restaurant")
public class RestaurantController {
	@Autowired
	private RestaurantService service;
	
	@RequestMapping(value="/" ,method = RequestMethod.GET)
	public List<Restaurant> selectAll() {
		return service.selectAll();
	}
	
	@RequestMapping(value = "/{restaurant_id}", method = RequestMethod.GET)
	public Restaurant selectOneById(@PathVariable int restaurant_id) {
		return service.selectOneById(restaurant_id);
	}
	
	@RequestMapping(value = "/lowest", method = RequestMethod.GET)
	public List<Restaurant> selectLowestPrice(){
		return service.selectLowestPrice();
	}
	
	@RequestMapping(value = "/lon={x}/lat={y}/range={range}", method = RequestMethod.GET)
	public List<Restaurant> searchRestaurant(@PathVariable double x, @PathVariable double y, @PathVariable int range) {
		return service.searchRestaurant(x, y, range);
	}
}
