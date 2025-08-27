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

--
select * from items;
select * from categories;
--4(1)
select
    items.name,
    items.price,
    categories.name
from
    items inner join categories
        on items.category_id = categories.id
;

--4(2)
drop table customers;
create table customers(
    id number(4) primary key,
    name varchar2(25char) not null,
    mail_address varchar2(254) not null,
    registration_date date DEFAULT SYSDATE not null,
    update_date date DEFAULT SYSDATE not null
);

create table orders(
    id number(5) primary key,
    customer_id number(4) references customers(id) not null,
    item_id number(4) references items(id) not null,
    quantity number(3) not null,
    order_date date not null,
    registration_date date DEFAULT SYSDATE,
    update_date DATE DEFAULT SYSDATE
);

commit;
--4(3)
INSERT INTO customers(id,name,mail_address) values(1,'田中太郎','t.tanaka@abc.jp');
INSERT INTO customers(id,name,mail_address) values(2,'鈴木次郎','j.suzuki@def.jp');
INSERT INTO customers(id,name,mail_address) values(3,'渡辺花子','h.watanabe@ghi.jp');

INSERT INTO orders(id,customer_id,item_id,quantity,order_date) values(1,1,2,3,'2023/10/12');
INSERT INTO orders(id,customer_id,item_id,quantity,order_date) values(2,1,6,2,'2025/4/3');
INSERT INTO orders(id,customer_id,item_id,quantity,order_date) values(3,3,5,1,'2025/3/15');
INSERT INTO orders(id,customer_id,item_id,quantity,order_date) values(4,2,5,1,'2024/8/3');
INSERT INTO orders(id,customer_id,item_id,quantity,order_date) values(5,2,1,1,'2024/8/3');
INSERT INTO orders(id,customer_id,item_id,quantity,order_date) values(6,3,4,3,'2025/4/3');

commit;

--4(4)
select
    name,
    quantity,
    order_date
from
    items left outer join orders
        on items.id = orders.item_id
;

--4(5)
select
    customers.name AS "顧客名",
    items.name AS "カテゴリ名",
    categories.name AS "商品名",
    orders.quantity AS "注文数"
from
    ((categories inner join items
        on categories.id = items.category_id)
        inner join orders
            on items.id = orders.item_id)
            inner join customers
                on orders.customer_id = customers.id
where
    categories.id = 2
;

--5(1)
select * from items;
select 
    name,
    quantity,
    order_date
from
    (select
        *
     from
        items inner join orders
            on items.id = orders.item_id
    )
;

--5(2)
select
    name,
    quantity,
    order_date
from
    (select
        *
     from
        items inner join orders
            on items.id = orders.item_id
    )t1
where
    t1.price < (select
                        max(price) 
                   from 
                        items
                  )
;

--5(3)
create sequence mon_seq
    start with 7
    increment by 1
    nocache
;

--5(4)
insert into items values(mon_seq.nextval,'ミルクチョコレート（15個入り）',270,sysdate,sysdate,1);

--5(5)
select * from items order by id asc;
select * from orders;
select * from customers;

select
    customers.id,
    sum(items.price * orders.QUANTITY)
from
    ((customers inner join orders
        on customers.id = orders.customer_id)
    inner join items
        on orders.item_id = items.id)
group by 
    customers.id
having
    sum(items.price * orders.QUANTITY) 
    > 
    (select (sum(price * orders.QUANTITY)/count(Distinct orders.customer_id))
     from (customers inner join orders
                            on customers.id = orders.customer_id
                                inner join items
                                    on orders.item_id = items.id)
    )
order by 
    customers.id asc
;

--6(1)
create table empTest(
    empno number(5) primary key,
    name VARCHAR2(50),
    age number(3),
    dept_id number(3) references deptTest(dept_id),
    address_id number(3) references addressTest(adress_id),
    customer_id number(5) references customersTest(customer_id)
);

create table deptTest(
    dept_id number(3) primary key,
    dept_name VARCHAR2(50)
);

create table addressTest(
    adress_id number(3) primary key,
    adress_name VARCHAR2(50)
);

create table customersTest(
    customer_id number(5) primary key,
    customer_name VARCHAR2(50),
    customer_staff_name VARCHAR2(50)
);

drop table empTest;
drop table customersTest;
--6(2)

select * from customersTest;

--dept登録
insert into deptTest values(1,'営業部');
insert into deptTest values(2,'システム開発部');
insert into deptTest values(3,'総務部');
insert into deptTest values(4,'カスタマーサポート部');

--customer登録
insert into addressTest values(1,'東京都');
insert into addressTest values(2,'埼玉県');
insert into addressTest values(3,'千葉県');
insert into addressTest values(4,'大阪府');

--addressTest登録
insert into customersTest values(2,'大西システム','中山太郎');
insert into customersTest values(2,'ジャパンスーパーネット','中山太郎');


--emp登録
insert into empTest values(1,'山田太郎',23,1,1,1);
insert into empTest values(2,'井川誠',33,1,1,2);
insert into empTest values(3,'伊藤信子',25,4,1,null);
insert into empTest values(4,'鈴木弘道',42,4,2,null);
insert into empTest values(5,'西田葵',27,2,3,null);
insert into empTest values(6,'村山典弘',30,2,4,null);
insert into empTest values(7,'浜田恵美',33,3,1,null);

delete from emptest;
select * from emptest;

select
    empTest.name,
    deptTest.dept_name,
    customersTest.customer_id,
    customersTest.customer_name
from
    (empTest inner join deptTest
        on empTest.dept_id = deptTest.dept_id)
        left outer join customersTest
            on empTest.customer_id = customersTest.customer_id
;

commit;