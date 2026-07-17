package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.FaceDAOInt;
import com.rays.dto.FaceDTO;

@Service
@Transactional
public class FaceServiceImpl extends BaseServiceImpl<FaceDTO, FaceDAOInt> implements FaceServiceInt {

}
