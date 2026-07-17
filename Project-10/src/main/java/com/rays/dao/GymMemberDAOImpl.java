package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.GymMemberDTO;

@Repository
public class GymMemberDAOImpl extends BaseDAOImpl<GymMemberDTO> implements GymMemberDAOInt {

	@Override
	public Class<GymMemberDTO> getDTOClass() {
		return GymMemberDTO.class;

	}

	@Override
	protected List<Predicate> getWhereClause(GymMemberDTO dto, CriteriaBuilder builder, Root<GymMemberDTO> qRoot) {

		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getName())) {
			wherecondition.add(builder.like(qRoot.get("name"), dto.getName() + "%"));
		}

		return wherecondition;
	}

}
