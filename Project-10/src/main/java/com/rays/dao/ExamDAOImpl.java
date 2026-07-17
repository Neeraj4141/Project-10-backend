package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ExamDTO;

@Repository
public class ExamDAOImpl extends BaseDAOImpl<ExamDTO> implements ExamDAOInt {

	@Override
	public Class<ExamDTO> getDTOClass() {
		return ExamDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ExamDTO dto, CriteriaBuilder builder, Root<ExamDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getSubjectName())) {
			wherecondition.add(builder.like(qRoot.get("subjectName"), dto.getSubjectName()));
		}
		return wherecondition;
	}

}
