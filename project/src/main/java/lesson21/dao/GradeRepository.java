package lesson21.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lesson21.domain.Applicant;
import lesson21.domain.Grade;

public interface GradeRepository extends JpaRepository<Grade, Long> {
	List<Grade> findByApplicant(Applicant applicant);
}