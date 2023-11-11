package com.example.beveragemaker.controller;

import com.example.beveragemaker.constants.BeverageType;
import com.example.beveragemaker.service.MakeAdeService;
import com.example.beveragemaker.service.MakeBeverageService;
import com.example.beveragemaker.service.MakeCoffeeService;
import com.example.beveragemaker.service.MakeTeaService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class BeverageController {

  private final MakeAdeService makeAdeService;
  private final MakeCoffeeService makeCoffeeService;
  private final MakeTeaService makeTeaService;

  private final Map<BeverageType, MakeBeverageService> serviceMap = new HashMap<>();

  @PostConstruct
  private void initServiceMap(){
    serviceMap.put(BeverageType.Ade, makeAdeService);
    serviceMap.put(BeverageType.Coffee, makeCoffeeService);
    serviceMap.put(BeverageType.Tea, makeTeaService);
  }

  @GetMapping("/beverages")
  public BeverageResponse getBeverage(BeverageType type){
    BeverageResponse response = new BeverageResponse();
    response.setBeverageType(type.name());
    response.setResult(serviceMap.get(type).makeBeverage());
    return response;
  }
}
