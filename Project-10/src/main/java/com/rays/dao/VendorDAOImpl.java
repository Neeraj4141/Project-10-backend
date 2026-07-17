package com.rays.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.rays.common.BaseDAOImpl;
import com.rays.dto.VendorDTO;

@Repository
public class VendorDAOImpl extends BaseDAOImpl<VendorDTO> implements VendoDAOInt {

	@Override
	public Class<VendorDTO> getDTOClass() {
		return VendorDTO.class;
	}

	@Override
	protected List<Predicate> getWhereClause(VendorDTO dto, CriteriaBuilder builder, Root<VendorDTO> qRoot) {
		List<Predicate> wherecondition = new ArrayList<Predicate>();
		if (!isEmptyString(dto.getVendorName())) {
			wherecondition.add(builder.like(qRoot.get("vendorName"), dto.getVendorName() + "%"));
		}
		return wherecondition;
	}

}
