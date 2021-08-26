package br.com.study.project.controller;

//import br.com.study.project.domain.model.Study;
import br.com.study.project.domain.model.StudyInfo;
import br.com.study.project.service.StudyService;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/name/{name}")
    private ResponseEntity<StudyInfo> getName(@PathVariable("name") String nome) throws NotFoundException {
        return ResponseEntity.ok(this.studyService.findNome(nome));
    }

    @GetMapping("/name/{name}/{sobrenome}")
    private ResponseEntity<StudyInfo> getNameAndSobrenome(@PathVariable("name") String nome, @PathVariable("sobrenome") String sobrenome) throws NotFoundException {
        return ResponseEntity.ok(this.studyService.findNomeAndSobrenome(nome,sobrenome));
    }

    @GetMapping("/sobrenome/{sobrenome}")
    private ResponseEntity<StudyInfo> getSobrenome(@PathVariable("sobrenome") String sobrenome) throws NotFoundException {
        return ResponseEntity.ok(this.studyService.findSobrenome(sobrenome));
    }

    @PostMapping("/save")
    private ResponseEntity<StudyInfo> save(@RequestBody @Validated StudyInfo studyInfo){
        return ResponseEntity.ok(this.studyService.save(studyInfo));
    }
}
