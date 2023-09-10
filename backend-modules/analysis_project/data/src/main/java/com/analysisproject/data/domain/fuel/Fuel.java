package com.analysisproject.data.domain.fuel;

import com.analysisproject.data.domain.CommonEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Fuel extends CommonEntity {
  private final String facTypeCd;
  private final double fuelSum;
  private final String factTypeNm;
  private final String areaCd;
  private final String fuelNm;
  private final String fuelUnit;
}
