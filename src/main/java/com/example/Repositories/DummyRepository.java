package com.example.Repositories;

import com.example.Entities.DummyEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DummyRepository extends JpaRepository <DummyEntity, Long> {
}
