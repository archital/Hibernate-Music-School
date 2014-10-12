
insert into STUDENT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, INSTRUMENT_ID) values (1,'James', 'Hetfield', '1963-08-03',2);
insert into STUDENT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, INSTRUMENT_ID) values (2,'Lars', 'Ulrich', '1963-12-26',7);
insert into STUDENT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, INSTRUMENT_ID) values (3,'Kirk', 'Hammett', '1962-11-18',1);
insert into STUDENT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, INSTRUMENT_ID) values (4,'Jason', 'Newsted', '1963-03-04',4);
insert into STUDENT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, INSTRUMENT_ID) values (5,'Shavo', 'Odadjian', '1974-04-22',6);
insert into STUDENT (ID, FIRST_NAME, LAST_NAME, BIRTH_DATE, INSTRUMENT_ID) values (6,'Rob', 'Bourdon', '1979-07-20',8);


insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (1,'Guitar', 'Fender', '1974-06-14', '1999-10-24');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (2,'Guitar', 'Gibson', '1982-10-18', '2000-02-27');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (3,'Guitar', 'Paul Reed Smith', '2012-01-01', '2014-05-06');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (4,'Bass Guitar', 'Warwick', '2006-02-28', '2010-05-15');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (5,'Bass Guitar', 'Aria Pro', '1982-08-12', '2001-12-10');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (6,'Bass Guitar', 'Music Man', '1996-02-17', '2009-07-04');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (7,'Drums', 'TAMA', '2007-03-07', '2009-10-08');
insert into INSTRUMENT (ID, INSTRUMENT_TYPE, PRODUCER, PROD_DATE, PURCH_DATE) values (8,'Drums', 'Yamaha', '2000-02-12', '2005-02-20');


insert into COMPOSITION (ID, TITLE, AUTHOR) values (1,'Unforgiven', 'Metallica');
insert into COMPOSITION (ID, TITLE, AUTHOR) values (2,'In the end', 'Linkin Park');
insert into COMPOSITION (ID, TITLE, AUTHOR) values (3,'Toxicity', 'SOAD');

insert into PERFOMANCE_PARTICIPANS (COMPOSITION_ID, STUDENT_ID) values ( 1 , 1);
insert into PERFOMANCE_PARTICIPANS (COMPOSITION_ID, STUDENT_ID) values ( 1 , 2);
insert into PERFOMANCE_PARTICIPANS (COMPOSITION_ID, STUDENT_ID) values ( 1 , 3);
insert into PERFOMANCE_PARTICIPANS (COMPOSITION_ID, STUDENT_ID) values ( 1 , 4);
insert into PERFOMANCE_PARTICIPANS (COMPOSITION_ID, STUDENT_ID) values ( 2 , 6);
insert into PERFOMANCE_PARTICIPANS (COMPOSITION_ID, STUDENT_ID) values ( 3 , 5);
