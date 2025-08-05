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
--社員 NO
    empno VARCHAR2(3) primary key,
--社員名
    ename VARCHAR2(20) not null,
--上司
    superior VARCHAR2(20),
--入社日
    hiredate DATE not null,
--給与
    sal number not null,
--職種 
    job VARCHAR2(30),
--部署 NO 
    deptno VARCHAR2(2),
/*表制約deptテーブルのdeptnoに今テーブルのdeptinoを関連付
*/
    constraint fk_deptno FOREIGN KEY(deptno) references dept(deptno)
);

delete from dept;
--3(1)
INSERT INTO dept VALUES ('01','システム企画本部','東京都江東区豊洲 3-3-3'); 
INSERT INTO dept VALUES ('02','ソリューション事業部','神奈川県川崎市中原区上小田中 4-1-1'); 
INSERT INTO dept VALUES ('03','営業部','大阪府大阪市中央区城見 1-4-24'); 
INSERT INTO dept VALUES ('04','総務部',NULL); 

 

COMMIT; 


INSERT INTO emp VALUES ('001', '鈴木 仁', NULL, '2000/01/01', 600000,'PL', '01'); 
 INSERT INTO emp VALUES ('002','佐藤 幸助','鈴木 仁','2000/03/22',350000,'ブリッジ SE','01'); 
 INSERT INTO emp VALUES ('003', '高橋 ひとみ', NULL, '2000/01/01', 500000,'PL', '02'); 
 INSERT INTO emp VALUES ('004', '大前 貢', '鈴木 仁', '2000/04/01', 320000,'SE', '01'); 
 INSERT INTO emp VALUES ('005', '真田 博之', '鈴木 仁', '2001/04/01',300000, 'SE', '01'); 
 INSERT INTO emp VALUES ('006', '大城 勉', '鈴木 仁', '2001/04/01', 300000,'SE', '01'); 
 INSERT INTO emp VALUES ('007', '神城 陣', '高橋 ひとみ', '2001/04/01',280000, 'PG', '02'); 
 INSERT INTO emp VALUES ('008', '結城 瞳', '高橋 ひとみ', '2002/04/01',280000, 'PG', '02'); 
 INSERT INTO emp VALUES ('009', '博多 弁', '高橋 ひとみ', '2003/04/01',260000, 'PG', '02'); 
 INSERT INTO emp VALUES ('010', '小山 浩', '高橋 ひとみ', '2006/04/01',180000, 'デザイナー', '02'); 
 
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
update dept set dname = '人事部' where deptno = 4;

--5(2)
update emp set superior = '鈴木 仁'　, sal = 290000, job = 'SE',deptno = '01' where empno = 8;

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
select empno,ename from emp where ename like '%城%';

--7(6)
select * from emp where hiredate between '2000/1/1' and '2001/12/31';

--8(1)
select count(*) AS "行数" from emp;

--8(2)
select max(sal) AS "給与(最大値)" , MIN(sal) AS "給与(最小値)", sum(sal) as "給与(合計値)" from emp;

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