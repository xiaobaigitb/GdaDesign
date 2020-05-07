package com.demo.gdadesign.gda.repository;

import com.demo.gdadesign.gda.entity.GdaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<GdaEntity,String> {
}
