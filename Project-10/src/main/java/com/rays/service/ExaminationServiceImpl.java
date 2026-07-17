package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ExaminationDAOInt;
import com.rays.dto.ExaminationDTO;

@Service
@Transactional
public class ExaminationServiceImpl extends BaseServiceImpl<ExaminationDTO, ExaminationDAOInt>
		implements ExaminationServiceInt {

}
