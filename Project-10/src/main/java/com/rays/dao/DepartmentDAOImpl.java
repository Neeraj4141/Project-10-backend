package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.DepartmentDTO;

@Repository
public class DepartmentDAOImpl extends BaseDAOImpl<DepartmentDTO> implements DepartmentDAOInt {

	@Override
	public Class<DepartmentDTO> getDTOClass() {
		return DepartmentDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(DepartmentDTO dto, CriteriaBuilder builder, Root<DepartmentDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getDepartmentName())) {
			wherecondition.add(builder.like(qRoot.get("departmentName"), dto.getDepartmentName()));

		}
		return wherecondition;
	}

}
