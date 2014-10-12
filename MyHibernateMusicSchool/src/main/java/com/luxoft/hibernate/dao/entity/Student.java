/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luxoft.hibernate.dao.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student implements Serializable{
        @Id
    @Column
	private long id;
    @Column(name = "FIRST_NAME")
	private String firstName;
    @Column(name = "LAST_NAME")
	private String lastName;
    @Column(name = "BIRTH_DATE")
	private Date birthDate;    
             @ManyToOne(targetEntity = Instrument.class)
    private Instrument instrument;

    public Student() {
    }

    public Student(long id, String firstName, String lastName, Date birthDate, Instrument instrument) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.instrument = instrument;
    }
             
             

    public Instrument getInstrument() {
        return instrument;
    }

    public void setInstrument(Instrument instrument) {
        this.instrument = instrument;
    }

   


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

     @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        return id == student.id;
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }


    @Override
    public String toString() {
        return "Student{" + 
                "id=" + id + 
                ", firstName=" + firstName + 
                ", lastName=" + lastName +
                ", birthDate=" + birthDate + 
                ", instrument=" + instrument + 
                '}';
    }
     
     
    
}
