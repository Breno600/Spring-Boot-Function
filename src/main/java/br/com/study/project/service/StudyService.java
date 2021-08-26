package br.com.study.project.service;

//import br.com.study.project.domain.model.Study;
import br.com.study.project.domain.model.StudyInfo;

import java.util.Collection;

public interface StudyService {

    Collection<StudyInfo> findAllStudy();

    StudyInfo findAllMatric(String matric);

    StudyInfo findByAgeAndMatric(Integer age, String matric);

}
