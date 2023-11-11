package com.example.beveragemaker.service;

import org.springframework.stereotype.Service;

@Service
public class PurifierService {
  public String getColdWater(){
    return "차가운 물";
  }

  public String getHotWater(){
    return "뜨거운 물";
  }

  public String getIce(){
    return "얼음";
  }
}
