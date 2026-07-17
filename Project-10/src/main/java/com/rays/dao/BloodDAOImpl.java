package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BloodDTO;

@Repository
public class BloodDAOImpl extends BaseDAOImpl<BloodDTO> implements BloodDAOInt {

	@Override
	public Class<BloodDTO> getDTOClass() {
		return BloodDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BloodDTO dto, CriteriaBuilder builder, Root<BloodDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if(!isEmptyString(dto.getName())) {
			wherecondition.add(builder.like(qRoot.get("name"), dto.getName() + "%" ));
			
		}
		return null;
	}

}
