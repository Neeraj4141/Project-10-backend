package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ExaminationDTO;
import com.rays.form.ExaminationForm;
import com.rays.service.ExaminationServiceInt;

@RestController
@RequestMapping("Examination")
public class ExaminationCtl extends BaseCtl<ExaminationForm, ExaminationDTO, ExaminationServiceInt> {

}
