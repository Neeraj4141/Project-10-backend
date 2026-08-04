package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ScholarshipDTO;
import com.rays.form.ScholarshipForm;
import com.rays.service.ScholarshipServiceInt;

/**
 * @author Neeraj Mewada
 *
 */
@RestController
@RequestMapping(value = "Scholarship")
public class ScholarshipCtl extends BaseCtl<ScholarshipForm, ScholarshipDTO, ScholarshipServiceInt> {

}
