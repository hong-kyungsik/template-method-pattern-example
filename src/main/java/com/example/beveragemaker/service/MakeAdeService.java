package com.example.beveragemaker.service;

import org.springframework.stereotype.Service;

@Service
public class MakeAdeService extends MakeBeverageService{

  public MakeAdeService(PurifierService purifierService) {
    super(purifierService);
  }

  @Override
  public String prepareGlass() {
    return "얼음잔을 준비합니다."+
      purifierService.getIce()+"를 넣고 "+
      purifierService.getIce()+"를 반 채웁니다.";
  }

  @Override
  public String prepareBase() {
    return "사이다를 잔에 넣습니다.";
  }

  @Override
  public String pourBaseIntoGlass() {
    return "에이드 시럽을 잔에 넣습니다.";
  }

  @Override
  public String infuseGradient() {
    return "잘 저어줍니다.";
  }

  @Override
  public String addGarnish() {
    return "라임 슬라이스 하나를 넣어둡니다.";
  }
}
