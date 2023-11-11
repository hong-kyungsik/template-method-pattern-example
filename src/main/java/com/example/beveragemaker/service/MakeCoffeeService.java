package com.example.beveragemaker.service;

import org.springframework.stereotype.Service;

@Service
public class MakeCoffeeService extends MakeBeverageService{
  private final GrinderService grinderService;

  public MakeCoffeeService(
    PurifierService purifierService,
    GrinderService grinderService
  ) {
    super(purifierService);
    this.grinderService = grinderService;
  }

  @Override
  public String prepareGlass() {
    return "커피잔을 준비합니다.";
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
    return grinderService.grind()+" 그 후 에스프레소를 준비해 잔에 넣습니다.";
  }

  @Override
  public String addGarnish() {
    return "시나몬 가루를 뿌립니다.";
  }

  @Override
  public String serve() {
    return "잔받침과 함께 서빙합니다.";
  }
}
