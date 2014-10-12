/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.luxoft.hibernate.dao.instrument;

import com.luxoft.hibernate.dao.entity.Instrument;
import com.luxoft.hibernate.dao.entity.Student;
import java.util.List;


public interface InstrumentDao {
    List<Instrument> getAllInstruments();
      List<Student> getAllStudents();
}
