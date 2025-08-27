--1(1)
create table dept(
    deptno VARCHAR2(2) primary key,
    dname VARCHAR2(50) NOT NULL,
    loc  VARCHAR2(2)
);
alter table dept modify loc VARCHAR2(100);
--1(2)
--1(3)
create table emp(
--ŽÐˆõ NO
    empno VARCHAR2(3) primary key,
--ŽÐˆõ–¼
    ename VARCHAR2(20) not null,
--ãŽi
    superior VARCHAR2(20),
--“üŽÐ“ú
    hiredate DATE not null,
--‹‹—^
    sal number not null,
--EŽí 
    job VARCHAR2(30),
--•” NO 
    deptno VARCHAR2(2),
/*•\§–ñdeptƒe[ƒuƒ‹‚Ìdeptno‚É¡ƒe[ƒuƒ‹‚Ìdeptino‚ðŠÖ˜A•t
*/
    constraint fk_deptno FOREIGN KEY(deptno) references dept(deptno)
);

INSERT INTO dept VALUES ('01','ƒVƒXƒeƒ€Šé‰æ–{•”','“Œ‹ž“s]“Œ‹æ–LF 3-3-3'); 
INSERT INTO dept VALUES ('02','ƒ\ƒŠƒ…[ƒVƒ‡ƒ“Ž–‹Æ•”','_“ÞìŒ§ìèŽs’†Œ´‹æã¬“c’† 4-1-1'); 
INSERT INTO dept VALUES ('03','‰c‹Æ•”','‘åã•{‘åãŽs’†‰›‹æéŒ© 1-4-24'); 
INSERT INTO dept VALUES ('04','‘–±•”',NULL); 

 

COMMIT; 


INSERT INTO emp VALUES ('001', '—é–Ø m', NULL, '2000/01/01', 600000,'PL', '01'); 
INSERT INTO emp VALUES ('002','²“¡ K•','—é–Ø m','2000/03/22',350000,'ƒuƒŠƒbƒW SE','01'); 
INSERT INTO emp VALUES ('003', '‚‹´ ‚Ð‚Æ‚Ý', NULL, '2000/01/01', 500000,'PL', '02'); 
INSERT INTO emp VALUES ('004', '‘å‘O v', '—é–Ø m', '2000/04/01', 320000,'SE', '01'); 
INSERT INTO emp VALUES ('005', '^“c ”Ž”V', '—é–Ø m', '2001/04/01',300000, 'SE', '01'); 
INSERT INTO emp VALUES ('006', '‘åé •×', '—é–Ø m', '2001/04/01', 300000,'SE', '01'); 
INSERT INTO emp VALUES ('007', '_é w', '‚‹´ ‚Ð‚Æ‚Ý', '2001/04/01',280000, 'PG', '02'); 
INSERT INTO emp VALUES ('008', 'Œ‹é “µ', '‚‹´ ‚Ð‚Æ‚Ý', '2002/04/01',280000, 'PG', '02'); 
INSERT INTO emp VALUES ('009', '”Ž‘½ •Ù', '‚‹´ ‚Ð‚Æ‚Ý', '2003/04/01',260000, 'PG', '02'); 
INSERT INTO emp VALUES ('010', '¬ŽR _', '‚‹´ ‚Ð‚Æ‚Ý', '2006/04/01',180000, 'ƒfƒUƒCƒi[', '02'); 
 
COMMIT;

--2(1)
select ename AS "ŽÐˆõ–¼",superior AS "ãŽi", sal AS "‹‹—^" from emp;

--2(2)
select DISTINCT job from emp;

--3(1)
INSERT INTO dept VALUES ('20', 'Œo—•”', 'Redmond, WA 98052-7329 USA'); 
INSERT INTO dept VALUES ('21', '…ŽYH•iŠJ”­•”',null); 
INSERT INTO dept VALUES ('22', 'H•i‘‡Œ¤‹†Š',null); 
rollback;
select * from dept;
 
--3(2)
INSERT INTO dept VALUES ('20', 'Œo—•”', 'Redmond, WA 98052-7329 USA'); 
savepoint sp;
INSERT INTO dept VALUES ('21', '…ŽYH•iŠJ”­•”',null); 
INSERT INTO dept VALUES ('22', 'H•i‘‡Œ¤‹†Š',null); 
rollback to sp;
select * from dept;
 
--4
select MAX(hiredate) from emp;

--5(1)
select superior ,count(superior) from emp group by superior having superior is not null;

--5(2)
select job, round(avg(sal),2) from emp group by job having job is not null;

--6(1)
create table plan(
    planno varchar2(4) primary key,
    empno varchar2(5) references emp(empno),
    scheduled_date date not null,
    plan varchar2(200) not null
);

--6(2)
insert into plan values('0001','001',' 2007/02/03','14 Žž‚©‚ç A ŽÐ—l‚Æ‚Ì–Ê’k');
insert into plan values('0002','003',' 2007/02/03','‘åão’£');
insert into plan values('0003','003',' 2007/02/05','‘åão’£');
insert into plan values('0004','001',' 2007/02/04','9 Žž 30 •ª‚©‚çi’»•ñ‰ï');
insert into plan values('0005','001',' 2007/02/06','18 Žž‚©‚çŒo‰c‰ï‹c ');
commit;

--6(3)
select 
    plan.planno,
    plan.scheduled_date,
    plan.plan,
    emp.empno,
    emp.ename,
    dept.dname
from 
    (plan inner join emp
        on plan.empno = emp.empno)
    inner join dept
        on emp.deptno = dept.deptno
;

--6(4)
select
    plan.empno,
    emp.ename,
    dept.dname,
    count(*)
from
    (plan inner join emp
        on plan.empno = emp.empno)
    inner join dept
        on emp.deptno = dept.deptno
group by 
    plan.empno,
    emp.ename,
    dept.dname
;

commit;

--7(1)

select
    empno,
    ename,
    sal
from
    emp
where
    sal >= (select avg(sal) from emp)
;
    
--7(2)
select
    empno,
    ename,
    job
from
    emp e1
where
    (select
        count(*)
     from
        emp e2
     where
        e1.job = e2.job
     group by
        job
    ) >= 2
;

select * from emp;

commit;