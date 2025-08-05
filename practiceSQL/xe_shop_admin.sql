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

insert into categories(id,name) values(1,'菓子類');
insert into categories(id,name)  values(2,'文房具');
insert into categories(id,name)  values(3,'書籍');
insert into categories(id,name)  values(4,'衣類');

insert into items(id , name , price , category_id) values(1,'システム手帳(A5 サイズ)',8900 , 2);
insert into items(id , name , price , category_id) values(2,'キャンディー5 種セット',340 ,1);
insert into items(id , name , price , category_id) values(3,'『Java 入門』',2980 , 3);
insert into items(id , name , price , category_id) values(4,'カラーペン 3 色セット',340 , 2);
insert into items(id , name , price , category_id) values(5,'『Java 入門』（第 2 版）',2980 , 3);

select id　,　name,　TO_CHAR(price,'99,999')　|| '円',　registration_date,　update_date, category_id from items order by id;
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
select id as "商品ID" , name as "商品名", price as "商品単価", registration_date as "登録日時", sysdate as "登録日時", category_id as "カテゴリID" from items where id = 3 or id = 5;

--(2)8
delete from categories where id = 4;
commit;
select * from categories;

--(2)9
update items set name = 'カラー水性ペン 3 色セット' where id = 4;
select * from items;
rollback;

--(2)10
insert into items values(6,'スティックのり',180,sysdate,sysdate,2);
savepoint sp1;
update items set price = 240 where id = 6;
select * from items;
rollback to sp1;
select * from items;

commit;

--3(1)
select id, name, price*1.1 AS "商品単価（税込み）" from items　order by id asc;

--3(2)
select id, name, price from items where price >= 500 order by id asc;

--3(3)
select id, name, price,category_id from items where price >= 500 and category_id = 2 order by id asc;

--3(4)
select id, name, price,category_id from items where category_id = 2 or price <= 1000 order by id asc;

--3(5)
select id, name, price,category_id from items where category_id <> 2 order by id asc;

--3(6)
select id, name, price from items where name like '%セット' order by id asc;

--3(7)
select id, name, price from items where name like '%Java 入門%' order by id asc;

--3(8)
select id, name, price from items where price between 200 and 500 order by id asc;

--3(9)
select id, name, price from items where category_id in (1,3) order by id asc;

--3(10)
select count(*) as "行数" from items where category_id = 2;

--3(11)
select sum(price) as "合計" from items where category_id = 3;

--3(12)
select avg(price) as "平均" from items where category_id = 2;

--3(13)
select MAX(price) as "最大値" from items;

--3(14)
select MIN(price) as "最低値" from items;

--3(15)
select category_id , avg(price) as "平均価格" from items group by category_id;

--3(16)
select category_id,  avg(price) as "平均価格" from items group by category_id having avg(price) >= 3000;

--3(17)
select category_id, avg(price) as "平均価格" from items group by category_id order by category_id asc;

--3(18)
select category_id, avg(price) as "平均価格" from items group by category_id order by category_id desc;