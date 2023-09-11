package com.analysisproject.data.common.entity;

import java.util.Date;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CommonEntity {
  protected final Date dates;
  protected final String branchCd;
  protected final String branchNm;
}
