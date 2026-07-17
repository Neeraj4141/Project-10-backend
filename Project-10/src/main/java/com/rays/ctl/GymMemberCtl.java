package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.GymMemberDTO;
import com.rays.form.GymMemberForm;
import com.rays.service.GymMemberServiceInt;

@RestController
@RequestMapping("Gym")
public class GymMemberCtl extends BaseCtl<GymMemberForm, GymMemberDTO, GymMemberServiceInt> {

}
