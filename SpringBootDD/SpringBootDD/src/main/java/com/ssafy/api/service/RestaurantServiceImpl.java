package com.ssafy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.api.dto.Restaurant;
import com.ssafy.api.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl implements RestaurantService{

	@Autowired
	private RestaurantRepository repo;

	@Override
	public int insertOne(Restaurant restaurant) {
		return repo.insertOne(restaurant);
	}

	@Override
	public Restaurant selectOneById(int restaurant_id) {
		return repo.selectOneById(restaurant_id);
	}

	@Override
	public Restaurant selectOneByName(String name) {
		return repo.selectOneByName(name);
	}

	@Override
	public List<Restaurant> selectAll() {
		return repo.selectAll();
	}

	@Override
	public int update(String tel) {
		return repo.update(tel);
	}

	@Override
	public int delete(int restaurant_id) {
		return repo.delete(restaurant_id);
	}

	@Override
	public int joinTest() {
		// TODO Auto-generated method stub
		return repo.joinTest();
	}
}
