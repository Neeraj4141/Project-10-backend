package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.BugTrackerDTO;

@Repository
public class BugTrackerDAOImpl extends BaseDAOImpl<BugTrackerDTO> implements BugTrackerDAOInt {

	@Override
	public Class<BugTrackerDTO> getDTOClass() {
		return BugTrackerDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(BugTrackerDTO dto, CriteriaBuilder builder, Root<BugTrackerDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getTitle())) {
			wherecondition.add(builder.like(qRoot.get("title"), dto.getTitle()));
		}
		return wherecondition;
	}

}
