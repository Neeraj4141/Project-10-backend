package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ExamDAOInt;
import com.rays.dto.ExamDTO;

@Service
@Transactional
public class ExamServiceImpl extends BaseServiceImpl<ExamDTO, ExamDAOInt> implements ExamServiceInt {

}
