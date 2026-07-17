package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.BloodDTO;
import com.rays.form.BloodForm;
import com.rays.service.BloodServiceInt;

@RestController
@RequestMapping("Blood")
public class BloodCtl extends BaseCtl<BloodForm, BloodDTO, BloodServiceInt> {

}
