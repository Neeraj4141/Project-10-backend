package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.common.BaseServiceInt;
import com.rays.dao.FoodDeliveryDAOInt;
import com.rays.dto.FoodDeliveryDTO;

@Service
@Transactional
public class FoodDeliveryServiceImpl extends BaseServiceImpl<FoodDeliveryDTO, FoodDeliveryDAOInt>
		implements FoodDeliveryServiceInt {

}
