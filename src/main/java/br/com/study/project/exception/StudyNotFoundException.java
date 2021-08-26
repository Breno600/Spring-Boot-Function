package br.com.study.project.exception;

public class StudyNotFoundException extends RuntimeException{

    public StudyNotFoundException(String message) {
        super(message);
    }
}
