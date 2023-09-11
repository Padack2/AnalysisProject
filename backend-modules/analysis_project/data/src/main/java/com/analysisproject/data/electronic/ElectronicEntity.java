package com.analysisproject.data.electronic;

import com.analysisproject.data.common.entity.CommonEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class ElectronicEntity extends CommonEntity {
  private final String unit;
  private final double elecprodqty;
}
