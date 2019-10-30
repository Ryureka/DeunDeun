package com.ssafy.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.api.dto.Restaurant;
import com.ssafy.api.repository.R2CRepository;
@Service
public class R2CServiceImpl implements R2CService {
	@Autowired
	private R2CRepository repo;
	
	@Override
	public List<Restaurant> selectRestaurantByCategoryId(int category_id) {
		return repo.selectRestaurantByCategoryId(category_id);
	}

}
