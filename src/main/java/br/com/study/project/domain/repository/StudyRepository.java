package br.com.study.project.domain.repository;

//import br.com.study.project.domain.model.Study;
import br.com.study.project.domain.model.StudyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface StudyRepository extends JpaRepository<StudyInfo, Integer> {

    @Query(value = "SELECT * FROM teste", nativeQuery = true)
    Optional<StudyInfo> findAllMatric(String matric);
    @Query(value = "SELECT * FROM teste", nativeQuery = true)
    Optional<StudyInfo> findByAgeAndMatric(Integer age,String matric);

}
