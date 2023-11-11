package com.example.beveragemaker.service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public abstract class MakeBeverageService {

  protected final PurifierService purifierService;

  public String makeBeverage(){
    return prepareGlass() + "\n" +
      prepareBase() + "\n" +
      pourBaseIntoGlass() + "\n" +
      infuseGradient() + "\n" +
      addGarnish() + "\n" +
      serve();
  }
  public abstract String prepareGlass();
  public abstract String prepareBase();
  public abstract String pourBaseIntoGlass();
  public abstract String infuseGradient();
  public abstract String addGarnish();
  public String serve(){
    return "서빙합니다.";
  }
}
