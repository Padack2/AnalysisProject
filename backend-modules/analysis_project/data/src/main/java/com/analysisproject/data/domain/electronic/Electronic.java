package com.analysisproject.data.domain.electronic;

import com.analysisproject.data.domain.CommonEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Electronic extends CommonEntity {
  private final String unit;
  private final double elecprodqty;
}
