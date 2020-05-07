package com.demo.gdadesign.gda.service.impl;

import com.demo.gdadesign.gda.entity.TestEntity;
import com.demo.gdadesign.gda.repository.TestRepository;
import com.demo.gdadesign.gda.service.TestService;
import com.demo.gdadesign.gda.shard.SharedData;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class TestUserviceImpl implements TestService {
    @Override
    public List<TestEntity> selectByUsername(String username) {
        TestRepository testRepository = SharedData.getSharedData().getTestRepository();
        if (!StringUtils.isEmpty(username)) {
            return testRepository.findByUsername(username);
        }
        return null;
    }
}
