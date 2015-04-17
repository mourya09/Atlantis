CREATE TABLE BANK(
	ID INTEGER NOT NULL,
	NAME VARCHAR(100) NOT NULL,
	CUSTOMERTYPE VARCHAR(1) NOT NULL,
	MIN_CHARGE FLOAT DEFAULT 25,
	CHARGE FLOAT DEFAULT 0.005,
	CEILING FLOAT DEFAULT 0.0025,
	CHRG_LESS_10 FLOAT DEFAULT 0.0025,
	SALETAX FLOAT DEFAULT 0.001236,
	SEC_TX_TAX FLOAT DEFAULT 0.001,
	SEC_TX_TAX2 FLOAT DEFAULT 0.00001,
	STAMPDUTY FLOAT DEFAULT 0.00001,
	SEBI_TURN_TAX FLOAT DEFAULT 0.0000022472,
	PRIMARY KEY(ID,NAME,CUSTOMERTYPE)	
	
);

CREATE TABLE USER(
	USER_ID INTEGER NOT NULL,
	USERNAME VARCHAR(15) NOT NULL,
	USERPWD VARCHAR(20) NOT NULL,
	FIRST_NAME VARCHAR(20) NOT NULL,
	MID_NAME VARCHAR(20) NOT NULL,
	LAST_NAME VARCHAR(20) NOT NULL,
	EMAIL_ID VARCHAR(50) NOT NULL,
	BANKID INTEGER NOT NULL,
	USER_TYPE VARCHAR(3) DEFAULT 'DOM' NOT NULL,
	ADDRESS VARCHAR(100),
	MOBILE_NUM INTEGER NOT NULL,
	PRIMARY KEY(USER_ID)

);

	
CREATE TABLE SHARE(
	SHARE_ID INTEGER NOT NULL,
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


CREATE TABLE USER_SHARES(
	USER_ID INTEGER NOT NULL,
	SHARE_ID INTEGER NOT NULL,
	NUMBER_OF_SHARES INTEGER  DEFAULT 1 NOT NULL,
	BUY_PRICE_PER_SHARE FLOAT DEFAULT 1.0 NOT NULL,
	BUY_DATE TIMESTAMP DEFAULT NOW,
	SELL_DATE TIMESTAMP,
	BROKERAGE_BUY_CHARGE FLOAT DEFAULT 25 NOT NULL,
	BORKERAGE_SELL_CHARGE FLOAT DEFAULT 25 NOT NULL	
	
);