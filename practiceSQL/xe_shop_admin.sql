create table items(
    id number(4) primary key,
    name varchar2(30 char) not null unique,
    price number(7)DEFAULT 0 not null,
    registration_date DATE DEFAULT SYSDATE not null,
    update_date date DEFAULT SYSDATE not null,
    category_id number(4),
    foreign key(category_id) references categories(id)
);

create table categories(
    id number(4) primary key,
    name varchar2(20 char) not null unique,
    registration_date date DEFAULT SYSDATE not null,
    update_date date DEFAULT SYSDATE not null
);

insert into categories(id,name) values(1,'�َq��');
insert into categories(id,name)  values(2,'���[��');
insert into categories(id,name)  values(3,'����');
insert into categories(id,name)  values(4,'�ߗ�');

insert into items(id , name , price , category_id) values(1,'�V�X�e���蒠(A5 �T�C�Y)',8900 , 2);
insert into items(id , name , price , category_id) values(2,'�L�����f�B�[5 ��Z�b�g',340 ,1);
insert into items(id , name , price , category_id) values(3,'�wJava ����x',2980 , 3);
insert into items(id , name , price , category_id) values(4,'�J���[�y�� 3 �F�Z�b�g',340 , 2);
insert into items(id , name , price , category_id) values(5,'�wJava ����x�i�� 2 �Łj',2980 , 3);

select id�@,�@name,�@TO_CHAR(price,'99,999')�@|| '�~',�@registration_date,�@update_date, category_id from items order by id;
select * from categories order by id;

--(2)1
select * from categories;

--(2)2
select * from items;

--(2)3
select category_id from items;

--(2)4
select Distinct category_id from items;

--(2)5
select id,name,price from items where price = 340;

--(2)6
select * from items;
select id, name from categories;

--(2)7
update items set price = 3480 where id = 3 or id = 5;
select id as "���iID" , name as "���i��", price as "���i�P��", registration_date as "�o�^����", sysdate as "�o�^����", category_id as "�J�e�S��ID" from items where id = 3 or id = 5;

--(2)8
delete from categories where id = 4;
commit;
select * from categories;

--(2)9
update items set name = '�J���[�����y�� 3 �F�Z�b�g' where id = 4;
select * from items;
rollback;

--(2)10
insert into items values(6,'�X�e�B�b�N�̂�',180,sysdate,sysdate,2);
savepoint sp1;
update items set price = 240 where id = 6;
select * from items;
rollback to sp1;
select * from items;

commit;

--3(1)
select id, name, price*1.1 AS "���i�P���i�ō��݁j" from items�@order by id asc;

--3(2)
select id, name, price from items where price >= 500 order by id asc;

--3(3)
select id, name, price,category_id from items where price >= 500 and category_id = 2 order by id asc;

--3(4)
select id, name, price,category_id from items where category_id = 2 or price <= 1000 order by id asc;

--3(5)
select id, name, price,category_id from items where category_id <> 2 order by id asc;

--3(6)
select id, name, price from items where name like '%�Z�b�g' order by id asc;

--3(7)
select id, name, price from items where name like '%Java ����%' order by id asc;

--3(8)
select id, name, price from items where price between 200 and 500 order by id asc;

--3(9)
select id, name, price from items where category_id in (1,3) order by id asc;

--3(10)
select count(*) as "�s��" from items where category_id = 2;

--3(11)
select sum(price) as "���v" from items where category_id = 3;

--3(12)
select avg(price) as "����" from items where category_id = 2;

--3(13)
select MAX(price) as "�ő�l" from items;

--3(14)
select MIN(price) as "�Œ�l" from items;

--3(15)
select category_id , avg(price) as "���ω��i" from items group by category_id;

--3(16)
select category_id,  avg(price) as "���ω��i" from items group by category_id having avg(price) >= 3000;

--3(17)
select category_id, avg(price) as "���ω��i" from items group by category_id order by category_id asc;

--3(18)
select category_id, avg(price) as "���ω��i" from items group by category_id order by category_id desc;