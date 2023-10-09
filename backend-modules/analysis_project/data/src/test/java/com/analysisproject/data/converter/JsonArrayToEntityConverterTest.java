package com.analysisproject.data.converter;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.analysisproject.data.common.converter.JsonArrayToEntityCoverter;
import com.analysisproject.data.heat.HeatEntity;

public class JsonArrayToEntityConverterTest {
  @Test
  void convertTest() {
    String test = """
      [ {
      "facTypeCd" : "005",
      "facTypeNm" : "CHP",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-12",
      "branchNm" : "동부지사",
      "produceSum" : "706.70",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "003",
      "facTypeNm" : "INC",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-12",
      "branchNm" : "동부지사",
      "produceSum" : "35557.70",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "002",
      "facTypeNm" : "PLB",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-12",
      "branchNm" : "동부지사",
      "produceSum" : "52751.83",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "001",
      "facTypeNm" : "CHP",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-12",
      "branchNm" : "동부지사",
      "produceSum" : "53232.60",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "005",
      "facTypeNm" : "CHP",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-11",
      "branchNm" : "동부지사",
      "produceSum" : "712.96",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "003",
      "facTypeNm" : "INC",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-11",
      "branchNm" : "동부지사",
      "produceSum" : "14583.90",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "002",
      "facTypeNm" : "PLB",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-11",
      "branchNm" : "동부지사",
      "produceSum" : "63423.66",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "001",
      "facTypeNm" : "CHP",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-11",
      "branchNm" : "동부지사",
      "produceSum" : "131.46",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "005",
      "facTypeNm" : "CHP",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-10",
      "branchNm" : "동부지사",
      "produceSum" : "549.19",
      "branchCd" : "2"
    }, {
      "facTypeCd" : "003",
      "facTypeNm" : "INC",
      "areaCd" : "2",
      "prodUnit" : "GCAL",
      "areaNm" : "노원",
      "dates" : "2019-10",
      "branchNm" : "동부지사",
      "produceSum" : "21302.80",
      "branchCd" : "2"
    } ]
  """;

    List<HeatEntity> entities = JsonArrayToEntityCoverter.<HeatEntity>convert(test, HeatEntity.class);

    assertEquals(entities.size(), 10);
    assertEquals(entities.get(1).getBranchNm(), "동부지사");
  }
}
