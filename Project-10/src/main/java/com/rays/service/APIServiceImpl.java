package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.APIDAOInt;
import com.rays.dto.APIDTO;

@Service
@Transactional
public class APIServiceImpl extends BaseServiceImpl<APIDTO, APIDAOInt> implements APIServiceInt {

}
