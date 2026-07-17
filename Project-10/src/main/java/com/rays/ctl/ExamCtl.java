package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ExamDTO;
import com.rays.form.ExamForm;
import com.rays.service.ExamServiceInt;

@RestController
@RequestMapping("exam")
public class ExamCtl extends BaseCtl<ExamForm, ExamDTO, ExamServiceInt> {

}
