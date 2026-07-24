package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ResultDTO;

@Repository
public class ResultDAOImpl extends BaseDAOImpl<ResultDTO> implements ResultDAOInt {

	@Override
	public Class<ResultDTO> getDTOClass() {
		return ResultDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ResultDTO dto, CriteriaBuilder builder, Root<ResultDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getStudentId())) {
			wherecondition.add(builder.like(qRoot.get("studentId"), dto.getStudentId()));
		}
		return wherecondition;
	}

}
