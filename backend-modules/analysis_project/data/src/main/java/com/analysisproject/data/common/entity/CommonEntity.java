package com.analysisproject.data.common.entity;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CommonEntity {
  protected final String dates;
  protected final String branchCd;
  protected final String branchNm;
}
