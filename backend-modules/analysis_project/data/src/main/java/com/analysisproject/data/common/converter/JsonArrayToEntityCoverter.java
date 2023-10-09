package com.analysisproject.data.common.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

@Component
public class JsonArrayToEntityCoverter {
  public static <T> List<T> convert(String json, Class<T> target) {
    Gson gson = new Gson();
    
    return gson.fromJson(json, TypeToken.getParameterized(ArrayList.class, target).getType());
  }
}
