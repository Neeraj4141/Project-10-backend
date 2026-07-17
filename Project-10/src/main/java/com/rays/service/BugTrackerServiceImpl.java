package com.rays.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.rays.common.BaseServiceImpl;
import com.rays.dao.BugTrackerDAOInt;
import com.rays.dto.BugTrackerDTO;

@Service
@Transactional
public class BugTrackerServiceImpl extends BaseServiceImpl<BugTrackerDTO, BugTrackerDAOInt>
		implements BugTarckerServiceInt {

}
