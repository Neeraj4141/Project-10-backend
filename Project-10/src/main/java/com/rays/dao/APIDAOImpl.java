package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.APIDTO;

@Repository
public class APIDAOImpl extends BaseDAOImpl<APIDTO> implements APIDAOInt {

	@Override
	public Class<APIDTO> getDTOClass() {
		return APIDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(APIDTO dto, CriteriaBuilder builder, Root<APIDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getApiName())) {
			wherecondition.add(builder.like(qRoot.get("apiName"), dto.getApiName() + "%"));
		}
		return wherecondition;
	}

}
