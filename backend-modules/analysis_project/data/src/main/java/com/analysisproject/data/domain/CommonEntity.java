package com.analysisproject.data.domain;

import java.util.Calendar;

import lombok.Getter;
import lombok.experimental.SuperBuilder;

@Getter
@SuperBuilder
public class CommonEntity {
  protected final Calendar dates;
  protected final String branchCd;
  protected final String branchNm;
}
