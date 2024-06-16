package com.example.volleyBall.repository;

import com.example.volleyBall.model.volleyBallForm;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface volleyBallRepository extends JpaRepository<volleyBallForm, Long> {
}
