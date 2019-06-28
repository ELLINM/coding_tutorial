--시퀀스 생성

CREATE SEQUENCE PRODUCTSEQ;
CREATE SEQUENCE SOLDSEQ;

 

--커스터머 생성

CREATE TABLE CUSTOMER (
CUSTOMERID VARCHAR2(30) CONSTRAINT CUSTOMER_CUSTOMERID_PK PRIMARY KEY,
CUSTOMERPW VARCHAR2(30),
NAME VARCHAR2(30),
PHONE VARCHAR2(30),
BIRTHDATE DATE DEFAULT SYSDATE,
ADDRESS VARCHAR2(30),
INDATE DATE DEFAULT SYSDATE 
);

 

--프러덕트 생성

CREATE TABLE PRODUCT(
PRODUCTSEQ NUMBER(6) CONSTRAINT PRODUCT_PRODUCTSEQ_PK PRIMARY KEY,
NAME VARCHAR2(30),
QUANTITY NUMBER(6),
PRICE NUMBER(6),
COMMENTS VARCHAR2(30),
INDATE DATE DEFAULT SYSDATE
);

 

--솔드 생성

CREATE TABLE SOLD(
SOLDSEQ NUMBER(6) CONSTRAINT SOLD_SOLDSEQ_PK PRIMARY KEY,
CUSTOMERID VARCHAR2(30) CONSTRAINT SOLD_CUSTOMERID_FK  REFERENCES CUSTOMER(CUSTOMERID), 
PRODUCTSEQ NUMBER(6) CONSTRAINT SOLD_PRODUCTSEQ_FK  REFERENCES PRODUCT(PRODUCTSEQ), 
QUANTITY NUMBER(6),
INDATE DATE DEFAULT SYSDATE
);

 

--어드민 생성
CREATE TABLE ADMIN(
ADMINID VARCHAR2(30) CONSTRAINT ADMIN_ADMINID_PK PRIMARY KEY,
ADMINPW VARCHAR2(30)
);

 

--문제 생길시 드랍

DROP TABLE ADMIN;
DROP TABLE SOLD;
DROP TABLE PRODUCT;
DROP TABLE CUSTOMER;
DROP SEQUENCE SOLDSEQ;
DROP SEQUENCE PRODUCTSEQ;
