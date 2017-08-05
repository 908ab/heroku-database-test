package com.example.herokudatabasetest.repository;

import com.example.herokudatabasetest.entity.Data;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {
}
