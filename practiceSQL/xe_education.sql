--2(1)
create table dept(
    deptno VARCHAR2(2) primary key,
    dname VARCHAR2(50) NOT NULL,
    loc  VARCHAR2(2)
);
alter table dept modify loc VARCHAR2(100);
--2(2)
--2(3)
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

delete from dept;
--3(1)
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

--4(1)
select * from dept;

--4(2)
select ename,superior,hiredate from emp;

--4(3)
select * from dept where deptno = 2;

--4(4)
select ename,ename,hiredate,job from emp where job = 'PG';

--5(1)
update dept set dname = '�l����' where deptno = 4;

--5(2)
update emp set superior = '��� �m'�@, sal = 290000, job = 'SE',deptno = '01' where empno = 8;

--6(1)
delete from emp where empno = 6;
select * from emp;

--7(1)
select ename, superior from emp where superior is not null;

--7(2)
select * from emp where sal <= 300000;

--7(3)
select * from emp where job = 'SE' and deptno = '01';

--7(4)
select * from emp where job = 'PL' or deptno = 1;

--7(5)
select empno,ename from emp where ename like '%��%';

--7(6)
select * from emp where hiredate between '2000/1/1' and '2001/12/31';

--8(1)
select count(*) AS "�s��" from emp;

--8(2)
select max(sal) AS "���^(�ő�l)" , MIN(sal) AS "���^(�ŏ��l)", sum(sal) as "���^(���v�l)" from emp;

--9(1)
select job, count(job) from emp group by job;

--10(1)
select empno, ename from emp order by empno desc;

--10(2)
select deptno, ename, sal from emp order by deptno asc, sal desc;

--11(1)
select 
    empno,
    ename,
    dname 
from
    emp inner join dept
        on emp.deptno = dept.deptno;
        
--11(2)
select
    empno,
    ename,
    dname
from
    emp right outer join dept
        on emp.deptno = dept.deptno
order by 
    empno asc
;