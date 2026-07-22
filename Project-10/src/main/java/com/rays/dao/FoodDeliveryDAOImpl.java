package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FoodDeliveryDTO;

@Repository
public class FoodDeliveryDAOImpl extends BaseDAOImpl<FoodDeliveryDTO> implements FoodDeliveryDAOInt {

	@Override
	public Class<FoodDeliveryDTO> getDTOClass() {
		return FoodDeliveryDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(FoodDeliveryDTO dto, CriteriaBuilder builder,
			Root<FoodDeliveryDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getFoodName())) {
			wherecondition.add(builder.like(qRoot.get("foodName"), dto.getFoodName()));
		}
		return wherecondition;
	}

}
