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
--�Ј� NO
    empno VARCHAR2(3) primary key,
--�Ј���
    ename VARCHAR2(20) not null,
--��i
    superior VARCHAR2(20),
--���Г�
    hiredate DATE not null,
--���^
    sal number not null,
--�E�� 
    job VARCHAR2(30),
--���� NO 
    deptno VARCHAR2(2),
/*�\����dept�e�[�u����deptno�ɍ��e�[�u����deptino���֘A�t
*/
    constraint fk_deptno FOREIGN KEY(deptno) references dept(deptno)
);

INSERT INTO dept VALUES ('01','�V�X�e�����{��','�����s�]����L�F 3-3-3'); 
INSERT INTO dept VALUES ('02','�\�����[�V�������ƕ�','�_�ސ쌧���s������㏬�c�� 4-1-1'); 
INSERT INTO dept VALUES ('03','�c�ƕ�','���{���s������錩 1-4-24'); 
INSERT INTO dept VALUES ('04','������',NULL); 

 

COMMIT; 


INSERT INTO emp VALUES ('001', '��� �m', NULL, '2000/01/01', 600000,'PL', '01'); 
INSERT INTO emp VALUES ('002','���� �K��','��� �m','2000/03/22',350000,'�u���b�W SE','01'); 
INSERT INTO emp VALUES ('003', '���� �ЂƂ�', NULL, '2000/01/01', 500000,'PL', '02'); 
INSERT INTO emp VALUES ('004', '��O �v', '��� �m', '2000/04/01', 320000,'SE', '01'); 
INSERT INTO emp VALUES ('005', '�^�c ���V', '��� �m', '2001/04/01',300000, 'SE', '01'); 
INSERT INTO emp VALUES ('006', '��� ��', '��� �m', '2001/04/01', 300000,'SE', '01'); 
INSERT INTO emp VALUES ('007', '�_�� �w', '���� �ЂƂ�', '2001/04/01',280000, 'PG', '02'); 
INSERT INTO emp VALUES ('008', '���� ��', '���� �ЂƂ�', '2002/04/01',280000, 'PG', '02'); 
INSERT INTO emp VALUES ('009', '���� ��', '���� �ЂƂ�', '2003/04/01',260000, 'PG', '02'); 
INSERT INTO emp VALUES ('010', '���R �_', '���� �ЂƂ�', '2006/04/01',180000, '�f�U�C�i�[', '02'); 
 
COMMIT;

--2(1)
select ename AS "�Ј���",superior AS "��i", sal AS "���^" from emp;

--2(2)
select DISTINCT job from emp;

--3(1)
INSERT INTO dept VALUES ('20', '�o����', 'Redmond, WA 98052-7329 USA'); 
INSERT INTO dept VALUES ('21', '���Y�H�i�J����',null); 
INSERT INTO dept VALUES ('22', '�H�i����������',null); 
rollback;
select * from dept;
 
--3(2)
INSERT INTO dept VALUES ('20', '�o����', 'Redmond, WA 98052-7329 USA'); 
savepoint sp;
INSERT INTO dept VALUES ('21', '���Y�H�i�J����',null); 
INSERT INTO dept VALUES ('22', '�H�i����������',null); 
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
insert into plan values('0001','001',' 2007/02/03','14 ������ A �Зl�Ƃ̖ʒk');
insert into plan values('0002','003',' 2007/02/03','���o��');
insert into plan values('0003','003',' 2007/02/05','���o��');
insert into plan values('0004','001',' 2007/02/04','9 �� 30 ������i���񍐉�');
insert into plan values('0005','001',' 2007/02/06','18 ������o�c��c ');
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