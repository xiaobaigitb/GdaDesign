package com.demo.gdadesign.gda.repository;

import com.demo.gdadesign.gda.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TestRepository extends JpaRepository<TestEntity, String> {
    List<TestEntity> findByUsername(String username);

    List<TestEntity> findByUsernameLike(String username);
}
