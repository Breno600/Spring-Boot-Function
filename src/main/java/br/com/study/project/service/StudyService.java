package br.com.study.project.service;

import br.com.study.project.domain.model.StudyInfo;
import javassist.NotFoundException;

import java.util.Collection;

public interface StudyService {

    Collection<StudyInfo> findAllStudy();

    StudyInfo findNome(String nome) throws NotFoundException;

    StudyInfo findSobrenome(String sobrenome) throws NotFoundException;

    StudyInfo findNomeAndSobrenome(String nome, String sobrenome) throws NotFoundException;

    StudyInfo save(StudyInfo studyInfo);
}
