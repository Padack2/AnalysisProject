package com.analysisproject.data.domain.heat;
import com.analysisproject.data.domain.CommonEntity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class Heat extends CommonEntity {
  private String facTypeCd;
  private String factTypeNm;
  private String areaCd;
  private String prodUnit;
  private String areaNm;
  private double produceSum;
}
