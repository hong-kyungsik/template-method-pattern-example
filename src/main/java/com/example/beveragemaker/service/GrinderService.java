package com.example.beveragemaker.service;

import org.springframework.stereotype.Service;

@Service
public class GrinderService {
  public String grind(){
    return "커피 콩을 갈아서 가루를 냅니다.";
  }
}
