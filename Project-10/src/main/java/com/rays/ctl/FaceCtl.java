package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.FaceDTO;
import com.rays.form.FaceForm;
import com.rays.service.FaceServiceInt;

@RestController
@RequestMapping("Face")
public class FaceCtl extends BaseCtl<FaceForm, FaceDTO, FaceServiceInt> {

}
