package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.GymMemberDAOInt;
import com.rays.dto.GymMemberDTO;

@Service
@Transactional
public class GymMemberServiceImpl extends BaseServiceImpl<GymMemberDTO, GymMemberDAOInt>implements GymMemberServiceInt {

}
