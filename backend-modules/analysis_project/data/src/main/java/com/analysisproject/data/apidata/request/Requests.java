package com.analysisproject.data.apidata.request;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;

public class Requests {
  // 추후 config 파일에서 관리하게 될 상수
  private static final String HEAT_DATA_SERVICE_KEY = "rkjHYrfrYIYTAQHKLXE7UaosSup8Xp0kYw1LoEDTuqj6DLPWIwfmAJO11IMEJwa8A7PdkPme0Q/MFGLtRBj6vg==";

  public String getHeatData() {
    WebClient client = WebClient.builder()
      .baseUrl("http://apis.data.go.kr")
      .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
      .build();

    return client.get().uri(uriBuilder -> uriBuilder
        .path("/B553734/iseheatproduce/getHeatProduceAmt")
        .queryParam("ServiceKey", HEAT_DATA_SERVICE_KEY)
        .queryParam("returnType", "json")
        .queryParam("numOfRows", "10")
        .queryParam("pageNo", "1")
        .queryParam("startDate", "2016-01")
        .queryParam("endDate", "2019-12")
        .build()
      )
      .retrieve()
      .bodyToMono(String.class)
      .block();
  }
}
