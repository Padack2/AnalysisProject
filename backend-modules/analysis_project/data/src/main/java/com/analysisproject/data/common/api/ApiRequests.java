package com.analysisproject.data.common.api;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class ApiRequests {
  // 추후 config 파일에서 관리하게 될 상수
  private static final String API_KEY = "rkjHYrfrYIYTAQHKLXE7UaosSup8Xp0kYw1LoEDTuqj6DLPWIwfmAJO11IMEJwa8A7PdkPme0Q/MFGLtRBj6vg==";

  private final WebClient client = WebClient.builder()
    .baseUrl("http://apis.data.go.kr")
    .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
    .build();

  public String getElectronicData(ApiFilterObject object) {
    return client.get().uri(uriBuilder -> uriBuilder
        .path("/B553734/iseelectricprod/getElectricProduction")
        .queryParam("ServiceKey", API_KEY)
        .queryParam("returnType", "json")
        .queryParam("numOfRows", object.getNumberOfRows())
        .queryParam("pageNo", object.getPageNo())
        .queryParam("startDate", object.getStartDate())
        .queryParam("endDate", object.getEndDate())
        .build()
      )
      .retrieve()
      .bodyToMono(String.class)
      .block();
  }

  public String getFuelData(ApiFilterObject object) {
    return client.get().uri(uriBuilder -> uriBuilder
        .path("/B553734/isefuel/getFuelTotalAmt")
        .queryParam("ServiceKey", API_KEY)
        .queryParam("returnType", "json")
        .queryParam("numOfRows", object.getNumberOfRows())
        .queryParam("pageNo", object.getPageNo())
        .queryParam("startDate", object.getStartDate())
        .queryParam("endDate", object.getEndDate())
        .build()
      )
      .retrieve()
      .bodyToMono(String.class)
      .block();
  }

  public String getHeatData(ApiFilterObject object) {
    return client.get().uri(uriBuilder -> uriBuilder
        .path("/B553734/iseheatproduce/getHeatProduceAmt")
        .queryParam("ServiceKey", API_KEY)
        .queryParam("returnType", "json")
        .queryParam("numOfRows", object.getNumberOfRows())
        .queryParam("pageNo", object.getPageNo())
        .queryParam("startDate", object.getStartDate())
        .queryParam("endDate", object.getEndDate())
        .build()
      )
      .retrieve()
      .bodyToMono(String.class)
      .block();
  }
}
