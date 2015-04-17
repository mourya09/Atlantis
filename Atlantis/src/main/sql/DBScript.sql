Create Table Bank(ID INTEGER NOT NULL,
	Name varchar(100) NOT NULL,
	CustomerType Varchar(1) NOT NULL,
	min_charge float default 25,
	charge float default 0.005,
	ceiling float default 0.0025,
	chrg_less_10 float default 0.0025,
	saleTax float default 0.001236,
	Sec_Tx_tax float default 0.001,
	Sec_Tx_tax2 float default 0.00001,
	StampDuty float default 0.00001,
	Sebi_Turn_tax float default 0.0000022472,
	primary key(ID,Name,CustomerType)	
	
	);
	
	
CREATE TABLE SHARE(
	SHAREID INTEGER NOT NULL,
	NAME varchar(30) not null,
	SYMBOL VARCHAR(20)  default 0.0 NOT NULL,
	SERIES varchar(5) default 'EQ'  NOT NULL ,
	DATE1 TIMESTAMP default NOW,
	PREV_CLOSE float default 0.0,
	OPEN_PRICE float default 0.0,
	HIGH_PRICE float default 0.0,
	LOW_PRICE float default 0.0,
	LAST_PRICE float default 0.0,
	CLOSE_PRICE float default 0.0,
	AVG_PRICE float default 0.0,
	TTL_TRD_QNTY BIGINT default 0,
	TURNOVER_LACS float default 0.0,
	NO_OF_TRADES BIGINT default 0,
	DELIV_QTY BIGINT default 0,
	primary key(SHAREID)
);


CREATE TABLE ALARM_DETAILS(
	ALARM_ID INTEGER NOT NULL,
	USER_ID INTEGER NOT NULL,
	SYMBOL VARCHAR(20) NOT NULL,
	THRESHOLD_PRICE FLOAT DEFAULT 0.0 NOT NULL,
	CURRENT_PRICE FLOAT DEFAULT 0.0 NOT NULL,
	VALIDITY TIMESTAMP DEFAULT NOW,
	BORKERAGE FLOAT DEFAULT 25,
	BUY_OR_SELL VARCHAR(2) DEFAULT 'SE',
	PRIMARY KEY(USER_ID,SYMBOL)
);

CREATE TABLE PORTFOLIO(
	 USER_ID INTEGER NOT NULL,
	 PORTFOLIO_NAME VARCHAR(20) NOT NULL,
	 SYMBOL VARCHAR(20) NOT NULL,
	 ALARM_ID INTEGER NOT NULL
);