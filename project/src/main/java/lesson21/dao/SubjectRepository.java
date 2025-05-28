package lesson21.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lesson21.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Long> {

}