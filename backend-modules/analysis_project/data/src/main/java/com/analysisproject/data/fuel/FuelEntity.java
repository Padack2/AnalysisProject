package com.analysisproject.data.fuel;

import com.analysisproject.data.common.entity.CommonEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class FuelEntity extends CommonEntity {
  private final String facTypeCd;
  private final double fuelSum;
  private final String factTypeNm;
  private final String areaCd;
  private final String fuelNm;
  private final String fuelUnit;
}
