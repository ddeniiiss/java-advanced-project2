package lesson21.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lesson21.domain.Applicant;
import lesson21.domain.Faculty;

public interface ApplicantRepository extends JpaRepository<Applicant, Long>{
	List<Applicant> findByFaculty(Faculty faculty);
}