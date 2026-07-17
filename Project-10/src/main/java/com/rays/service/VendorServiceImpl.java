package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.VendoDAOInt;
import com.rays.dto.VendorDTO;
@Service
@Transactional
public class VendorServiceImpl extends BaseServiceImpl<VendorDTO, VendoDAOInt> implements VendorServiceInt{

}
