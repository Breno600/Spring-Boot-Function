package br.com.study.project.service.impl;

import br.com.study.project.domain.model.StudyInfo;
import br.com.study.project.domain.repository.StudyRepository;
import br.com.study.project.service.StudyService;
import javassist.NotFoundException;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
public class StudyServiceImpl implements StudyService {

    private StudyRepository studyRepository;

    public StudyServiceImpl(StudyRepository studyRepository) {
        this.studyRepository = studyRepository;
    }

    @Override
    public Collection<StudyInfo> findAllStudy() { return studyRepository.findAll(); }

    @Override
    public StudyInfo findNome(String nome) throws NotFoundException {
        return this.studyRepository.findNome(nome)
                .orElseThrow(() -> new NotFoundException(
                        String.format(" '%s' Não Encontramos no Banco de Dados!!",nome)));
    }

    @Override
    public StudyInfo findSobrenome(String sobrenome) throws NotFoundException {
        return this.studyRepository.findSobrenome(sobrenome)
                .orElseThrow(() -> new NotFoundException("Não Encontramos esse Sobrenome"));
    }

    @Override
    public StudyInfo findNomeAndSobrenome(String nome, String sobrenome) throws NotFoundException {
        return this.studyRepository.findNomeAndSobrenome(nome,sobrenome)
                .orElseThrow(() -> new NotFoundException("Não encontramos esse Nome e Sobrenome"));
    }

    @Override
    public StudyInfo save(StudyInfo studyInfo) {
        return this.studyRepository.save(studyInfo);
    }

}
