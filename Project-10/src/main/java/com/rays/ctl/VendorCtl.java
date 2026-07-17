package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.VendorDTO;
import com.rays.form.VendorForm;
import com.rays.service.VendorServiceInt;

@RestController
@RequestMapping("Vendor")
public class VendorCtl extends BaseCtl<VendorForm, VendorDTO, VendorServiceInt>{

}
