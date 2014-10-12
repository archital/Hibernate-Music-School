/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luxoft.hibernate.dao.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COMPOSITION")
public class Composition implements Serializable {
    
       @Id
    @Column
	private long id; 
          @Column(name = "TITLE")
	private String title;
    @Column(name = "AUTHOR")
	private String author;
    

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    @Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Composition composition = (Composition) o;

		return id == composition.id;
	}

	@Override
	public int hashCode() {
		return (int) (id ^ (id >>> 32));
	}

    @Override
    public String toString() {
        return "Composition{" +
                "id=" + id + 
                ", title=" + title + 
                ", author=" + author +
                '}';
    }
       
    
}
