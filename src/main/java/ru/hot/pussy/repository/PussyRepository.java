package ru.hot.pussy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.hot.pussy.entity.Pussy;

public interface PussyRepository extends JpaRepository<Pussy, Long> {

}
