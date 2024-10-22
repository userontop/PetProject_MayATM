

CREATE TABLE KHACHHANG(
	CCCD varchar(12),	
	HoTenKH nvarchar2(50) NOT NULL,
	GioiTinh nvarchar2(3),
	NgaySinh DATE,
    CONSTRAINT g_cccd_pk PRIMARY KEY(CCCD)
);


CREATE TABLE TTTK(
	SoTK varchar(10),
    CCCD varchar(12),
	SoDuTK NUMBER NOT NULL,
    MaPin VARCHAR(6),
    SoThe varchar(12),
	CONSTRAINT g_sotk_pk PRIMARY KEY(SoTK)
);


CREATE TABLE TTGD(
    SoTK varchar(10),
    TK_NHAN varchar(20),
    Ten_NHAN NVARCHAR2(50),
	SoGD NUMBER NOT NULL,
	NgayGD DATE,
	SoTienGD NUMBER NOT NULL,
	CONSTRAINT g_sogd_pk PRIMARY KEY(SoGD)
);



INSERT INTO C##SA.KHACHHANG (CCCD, HOTENKH, GIOITINH, NGAYSINH) VALUES ('012345678911', N'NGUYEN VAN A', N'Nam', to_date('01-JUN-13','DD-MON-RR'));
INSERT INTO C##SA.KHACHHANG (CCCD, HOTENKH, GIOITINH, NGAYSINH) VALUES ('987654321111', N'NGUYEN THI B', N'Nu', to_date('17-JAN-03','DD-MON-RR'));
INSERT INTO C##SA.KHACHHANG (CCCD, HOTENKH, GIOITINH, NGAYSINH) VALUES ('567678913845', N'VO VAN C', N'Nam', to_date('18-JAN-04','DD-MON-RR'));


INSERT INTO "C##SA"."TTTK" (SOTK,CCCD, SODUTK, MAPIN, SOTHE) VALUES ('0123456789','012345678911', '1000000', '7485', '5942589');
INSERT INTO "C##SA"."TTTK" (SOTK,CCCD, SODUTK, MAPIN, SOTHE) VALUES ('9999999999','987654321111', '200000', '6847', '7842500');
INSERT INTO "C##SA"."TTTK" (SOTK,CCCD, SODUTK, MAPIN, SOTHE) VALUES ('7777777779','567678913845', '500000', '2584', '0125489');

Insert into C##SA.TTGD (SOTK,TK_NHAN, TEN_NHAN,SOGD,NGAYGD,SOTIENGD) values ('0123456789','9999999999',N'NGUYEN THI B',012345,to_date('17-JAN-21','DD-MON-RR'),100000);
Insert into C##SA.TTGD (SOTK,TK_NHAN, TEN_NHAN,SOGD,NGAYGD,SOTIENGD) values ('9999999999','7777777779',N'VO VAN C',013459,to_date('21-JAN-23','DD-MON-RR'),15022);
Insert into C##SA.TTGD (SOTK,TK_NHAN, TEN_NHAN,SOGD,NGAYGD,SOTIENGD) values ('7777777779','0123456789',N'NGUYEN VAN A',901340,to_date('11-JUN-24','DD-MON-RR'),20000);



ALTER TABLE TTTK ADD CONSTRAINT m_key_one_fk FOREIGN KEY(CCCD) REFERENCES KHACHHANG(CCCD);
ALTER TABLE TTGD ADD CONSTRAINT m_key_two_fk FOREIGN KEY(SoTK) REFERENCES TTTK(SoTK);


--UPDATE TTTK SET SODUTK = (SODUTK + 123) WHERE SOTK like '0123456789';
--
--SELECT G.NGAYGD, G.SOGD, G.TK_NHAN, G.TEN_NHAN, G.SOTIENGD,g.sotk, K.SODUTK FROM TTGD G, TTTK K WHERE G.SOTK = K.SOTK AND G.SOGD LIKE '12345';
--
--DROP TABLE C##SA.KHACHHANG;
--DROP TABLE C##SA.TTGD;
--DROP TABLE C##SA.TTTK;
