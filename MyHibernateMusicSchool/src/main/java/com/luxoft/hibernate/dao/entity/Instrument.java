/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luxoft.hibernate.dao.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import javax.persistence.Temporal;


@Entity
@Table(name = "INSTRUMENT")
public class Instrument implements Serializable {
    @Id
    @Column
	private long id;
       @Column(name = "INSTRUMENT_TYPE")
	private String instrumentType;
    @Column(name = "PRODUCER")
	private String producer;
    @Column(name = "PROD_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
	private Date progDate;
     @Column(name = "PURCH_DATE")
    @Temporal(javax.persistence.TemporalType.DATE)
	private Date purchDate;

 @OneToMany(mappedBy = "instrument", fetch = FetchType.EAGER)
    private List<Student> students;
  
  
    public Instrument() {
    }   
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(String instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Date getProgDate() {
        return progDate;
    }

    public void setProgDate(Date progDate) {
        this.progDate = progDate;
    }

    public Date getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(Date purchDate) {
        this.purchDate = purchDate;
    }
    

    @Override
    public String toString() {
        return "Instrument{" +
                "id=" + id + 
                ", instrumentType=" + instrumentType + 
                ", producer=" + producer +
                ", progDate=" + progDate + 
                ", purchDate=" + purchDate +  
                '}';
    }

   
        
    
        
}
