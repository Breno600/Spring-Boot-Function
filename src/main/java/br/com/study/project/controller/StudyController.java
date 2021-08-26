package br.com.study.project.controller;

//import br.com.study.project.domain.model.Study;
import br.com.study.project.domain.model.StudyInfo;
import br.com.study.project.service.StudyService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@CrossOrigin
@RequestMapping("study/v1")
public class StudyController {

    private final StudyService studyService;

    public StudyController(StudyService studyService) {
        this.studyService = studyService;
    }

    @GetMapping("/all")
    private Collection<StudyInfo> getAllStudy(){
        return studyService.findAllStudy();
    }

}
