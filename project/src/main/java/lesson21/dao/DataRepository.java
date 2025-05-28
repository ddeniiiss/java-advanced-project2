package lesson21.dao;

import javax.xml.crypto.Data;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DataRepository extends JpaRepository<Data, Long> {

}