package com.demo.gdadesign.gda.service;

import com.demo.gdadesign.gda.entity.TestEntity;

import java.util.List;

public interface TestService {
    List<TestEntity> selectByUsername(String username);
}
