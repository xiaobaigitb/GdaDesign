package com.demo.gdadesign.gda.controller;

import com.alibaba.fastjson.JSONObject;
import com.demo.gdadesign.gda.entity.TestEntity;
import com.demo.gdadesign.gda.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RestController
public class TestControler {
    @Autowired
    private TestService testService;

    @GetMapping("/test")
    public JSONObject test(String username) {
        List<TestEntity> testEntities = testService.selectByUsername(username);
        HashMap<String, Object> map = new HashMap<>();
        map.put("test", testEntities);
        return (JSONObject) JSONObject.toJSON(map);
    }
}
