package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.FaceDTO;

@Repository
public class FaceDAOImpl extends BaseDAOImpl<FaceDTO> implements FaceDAOInt {

	@Override
	public Class<FaceDTO> getDTOClass() {
		return FaceDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(FaceDTO dto, CriteriaBuilder builder, Root<FaceDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getFaceCode())) {
			wherecondition.add(builder.like(qRoot.get("faceCode"), dto.getFaceCode()));

		}
		return wherecondition;
	}

}
