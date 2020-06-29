DROP SEQUENCE NUMSEQ;
DROP TABLE BOARD;

CREATE SEQUENCE NUMSEQ NOCACHE;
CREATE TABLE BOARD(
	MYNUM NUMBER PRIMARY KEY,
	MYNAME VARCHAR2(1000) NOT NULL,
	MYTITLE VARCHAR2(2000) NOT NULL,
	MYCONTENT VARCHAR2(4000) NOT NULL,
	MYDATE DATE NOT NULL
);

INSERT INTO BOARD VALUES(NUMSEQ.NEXTVAL,'ADMIN','TITLE','CONTEXT',SYSDATE);
SELECT * FROM BOARD;