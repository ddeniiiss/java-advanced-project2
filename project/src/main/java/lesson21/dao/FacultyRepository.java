package lesson21.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lesson21.domain.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Long> {

}