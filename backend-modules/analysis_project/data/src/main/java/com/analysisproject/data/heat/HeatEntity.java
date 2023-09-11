package com.analysisproject.data.heat;
import com.analysisproject.data.common.entity.CommonEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class HeatEntity extends CommonEntity {
  private String facTypeCd;
  private String factTypeNm;
  private String areaCd;
  private String prodUnit;
  private String areaNm;
  private double produceSum;
}
