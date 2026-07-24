package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.ResultDAOInt;
import com.rays.dto.ResultDTO;

@Service
@Transactional
public class ResultServiceImpl extends BaseServiceImpl<ResultDTO, ResultDAOInt> implements ResultServiceInt {

}
