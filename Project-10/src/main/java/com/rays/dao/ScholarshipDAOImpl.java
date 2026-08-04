package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ScholarshipDTO;

/**
 * @author Neeraj Mewada
 *
 */
@Repository
public class ScholarshipDAOImpl extends BaseDAOImpl<ScholarshipDTO> implements ScholarshipDAOInt {

	@Override
	public Class<ScholarshipDTO> getDTOClass() {
		return ScholarshipDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ScholarshipDTO dto, CriteriaBuilder builder, Root<ScholarshipDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getScholarshipName())) {
			wherecondition.add(builder.like(qRoot.get("scholarshipName"), dto.getScholarshipName()));

		}
		return wherecondition;
	}

}
