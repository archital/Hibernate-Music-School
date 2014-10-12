package com.luxoft.hibernate.app;


import com.luxoft.hibernate.dao.instrument.InstrumentDao;
import java.sql.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main( String[] args ) throws SQLException{
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("app-context.xml");

         InstrumentDao instrumentDao = context.getBean(InstrumentDao.class);
         
            System.out.println(instrumentDao.getAllInstruments()); 
            System.out.println(instrumentDao.getAllStudents()); 
    }
}
