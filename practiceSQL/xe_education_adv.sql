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

--2(1)
select ename AS "社員名",superior AS "上司", sal AS "給与" from emp;

--2(2)
select DISTINCT job from emp;

--3(1)
INSERT INTO dept VALUES ('20', '経理部', 'Redmond, WA 98052-7329 USA'); 
INSERT INTO dept VALUES ('21', '水産食品開発部',null); 
INSERT INTO dept VALUES ('22', '食品総合研究所',null); 
rollback;
select * from dept;
 
--3(2)
INSERT INTO dept VALUES ('20', '経理部', 'Redmond, WA 98052-7329 USA'); 
savepoint sp;
INSERT INTO dept VALUES ('21', '水産食品開発部',null); 
INSERT INTO dept VALUES ('22', '食品総合研究所',null); 
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
insert into plan values('0001','001',' 2007/02/03','14 時から A 社様との面談');
insert into plan values('0002','003',' 2007/02/03','大阪出張');
insert into plan values('0003','003',' 2007/02/05','大阪出張');
insert into plan values('0004','001',' 2007/02/04','9 時 30 分から進捗報告会');
insert into plan values('0005','001',' 2007/02/06','18 時から経営会議 ');
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