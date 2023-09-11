package com.analysisproject.data.common.api;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class ApiFilterObject {
  
  private String startDate;
  private String endDate;

  @Builder.Default
  private int numberOfRows = 1000000;

  @Builder.Default
  private int pageNo = 1;
  
}
