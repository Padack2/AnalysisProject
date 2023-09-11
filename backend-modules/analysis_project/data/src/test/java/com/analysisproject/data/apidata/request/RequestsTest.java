package com.analysisproject.data.apidata.request;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.analysisproject.data.common.api.ApiFilterObject;
import com.analysisproject.data.common.api.ApiRequests;

@ExtendWith(SpringExtension.class)
public class RequestsTest {
  ApiRequests requests = new ApiRequests();

  @Test
  void heatRequestTest() throws Exception
  {
    ApiFilterObject filter = ApiFilterObject
      .builder()
      .startDate("2019-01")
      .endDate("2019-01").build();
    String response = requests.getHeatData(filter);
    JSONObject json = new JSONObject(response);
    assertEquals(json.getJSONObject("header").getString("resultCode"), "00");
  }
}
