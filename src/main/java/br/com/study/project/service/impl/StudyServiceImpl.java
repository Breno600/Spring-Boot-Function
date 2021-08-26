package br.com.study.project.service.impl;

import br.com.study.project.exception.StudyNotFoundException;
import br.com.study.project.domain.model.StudyInfo;
import br.com.study.project.domain.repository.StudyRepository;
import br.com.study.project.service.StudyService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import lombok.AccessLevel;
import java.util.Collection;

@AllArgsConstructor(access = AccessLevel.PACKAGE)
@Service
public class StudyServiceImpl implements StudyService {

    private StudyRepository studyRepository;

    public Collection<StudyInfo> findAllStudy() {
        return studyRepository.findAll();
    }

    public StudyInfo findAllMatric(String matric) {
        return studyRepository.findAllMatric(matric)
                .orElseThrow(() -> new StudyNotFoundException("Matric Não Encontrada!!"));
    }

    public StudyInfo findByAgeAndMatric(Integer age, String matric) {
        return studyRepository.findByAgeAndMatric(age,matric)
                .orElseThrow(() -> new StudyNotFoundException("Age Ou Matric não encontrado!!"));
    }

}
