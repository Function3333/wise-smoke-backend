package com.smokeWise.demo.findSmkArea;

import org.springframework.stereotype.Service;

import java.util.Map;

public interface SmkAreaService {

    //흡연구역정보 가져오기
    public Map<String, Object> getSmkArea() throws Exception;

}
