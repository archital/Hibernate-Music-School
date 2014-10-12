/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luxoft.hibernate.dao.entity;

import java.io.Serializable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Table(name = "PERFOMANCE_PARTICIPANS") 
public class PerfomanceParticipans implements Serializable{
    @ManyToMany
    @JoinColumn(name = "COMPOSITION_ID", referencedColumnName="ID")
	private Composition composition;
    @ManyToMany
    @JoinColumn(name = "STUDENT_ID", referencedColumnName = "ID")
	private Student student;

    public Composition getComposition() {
        return composition;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "PerfomanceParticipans{" + "composition=" + composition + ", student=" + student + '}';
    }
    
}
