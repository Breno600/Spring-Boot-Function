package br.com.study.project.domain.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "INFO_STUDY")
public class StudyInfo{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "date_change")
    private LocalDate date_change;
    @Column(name = "date_create")
    private LocalDate date_create;

    public StudyInfo() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate_change() {
        return date_change;
    }

    public void setDate_change(LocalDate date_change) {
        this.date_change = date_change;
    }

    public LocalDate getDate_create() {
        return date_create;
    }

    public void setDate_create(LocalDate date_create) {
        this.date_create = date_create;
    }
}
