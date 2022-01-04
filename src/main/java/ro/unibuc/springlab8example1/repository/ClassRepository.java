package ro.unibuc.springlab8example1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.unibuc.springlab8example1.domain.Class;

import java.util.List;

public interface ClassRepository extends JpaRepository<Class, Long> {
    Class findClassById(Long classId);
    List<Class> findAll();
}
