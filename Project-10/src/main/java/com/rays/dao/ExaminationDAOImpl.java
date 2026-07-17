package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ExaminationDTO;

@Repository
public class ExaminationDAOImpl extends BaseDAOImpl<ExaminationDTO> implements ExaminationDAOInt {

	@Override
	public Class<ExaminationDTO> getDTOClass() {
		return ExaminationDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ExaminationDTO dto, CriteriaBuilder builder, Root<ExaminationDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getSubject())) {
			wherecondition.add(builder.like(qRoot.get("subject"), dto.getSubject() + "%"));
		}
		return wherecondition;
	}

}
