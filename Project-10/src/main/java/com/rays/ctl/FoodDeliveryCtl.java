package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.FoodDeliveryDTO;
import com.rays.form.FoodDeliveryForm;
import com.rays.service.FoodDeliveryServiceInt;

@RestController
@RequestMapping("Food")
public class FoodDeliveryCtl extends BaseCtl<FoodDeliveryForm, FoodDeliveryDTO, FoodDeliveryServiceInt> {

}
