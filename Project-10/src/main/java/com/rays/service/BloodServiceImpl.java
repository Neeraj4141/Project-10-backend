package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BloodDAOInt;
import com.rays.dto.BloodDTO;

@Service
@Transactional
public class BloodServiceImpl extends BaseServiceImpl<BloodDTO, BloodDAOInt> implements BloodServiceInt {

}
