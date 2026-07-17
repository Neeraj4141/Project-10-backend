package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.ParkingDTO;

@Repository
public class ParkingDAOImpl extends BaseDAOImpl<ParkingDTO> implements ParkingDAOInt {

	@Override
	public Class<ParkingDTO> getDTOClass() {
		return ParkingDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(ParkingDTO dto, CriteriaBuilder builder, Root<ParkingDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getParkingCode())) {
			wherecondition.add(builder.like(qRoot.get("parkingCode"), dto.getParkingCode()));

		}
		return wherecondition;
	}

}
