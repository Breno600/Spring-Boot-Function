package br.com.study.project.domain.repository;

//import br.com.study.project.domain.model.Study;
import br.com.study.project.domain.model.StudyInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudyRepository extends JpaRepository<StudyInfo, Integer> {

    @Query(value = "select * from info AS a where a.nome= ?1", nativeQuery = true)
    Optional<StudyInfo> findNome(String nome);

    @Query(value = "select * from info AS a where a.nome= ?1 AND a.sobrenome = ?2", nativeQuery = true)
    Optional<StudyInfo> findNomeAndSobrenome(String nome, String sobrenome);

    @Query(value = "select * from info AS a where a.sobrenome= ?1", nativeQuery = true)
    Optional<StudyInfo> findSobrenome(String nome);
}
