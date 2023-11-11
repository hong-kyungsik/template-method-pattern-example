package com.example.beveragemaker.service;

import org.springframework.stereotype.Service;

@Service
public class MakeTeaService extends MakeBeverageService{
  public MakeTeaService(PurifierService purifierService) {
    super(purifierService);
  }

  @Override
  public String prepareGlass() {
    return "찻잔을 준비합니다.";
  }

  @Override
  public String prepareBase() {
    return purifierService.getHotWater()+"를 준비합니다.";
  }

  @Override
  public String pourBaseIntoGlass() {
    return "잔에 "+purifierService.getHotWater()+"를 넣습니다.";
  }

  @Override
  public String infuseGradient() {
    return "티백을 잔에 넣고 우립니다.";
  }

  @Override
  public String addGarnish() {
    return "";
  }
}
