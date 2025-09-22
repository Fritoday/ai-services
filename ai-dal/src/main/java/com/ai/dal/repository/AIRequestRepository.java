package com.ai.dal.repository;

import com.ai.dal.entity.AIRequestRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AIRequestRepository extends JpaRepository<AIRequestRecord, Long> {
}