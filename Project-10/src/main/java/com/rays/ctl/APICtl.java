package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.APIDTO;
import com.rays.form.APIForm;
import com.rays.service.APIServiceInt;

@RestController
@RequestMapping("API")
public class APICtl extends BaseCtl<APIForm, APIDTO, APIServiceInt> {

}
