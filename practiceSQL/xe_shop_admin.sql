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
INSERT INTO customers(id,name,mail_address) values(1,'�c�����Y','t.tanaka@abc.jp');
INSERT INTO customers(id,name,mail_address) values(2,'��؎��Y','j.suzuki@def.jp');
INSERT INTO customers(id,name,mail_address) values(3,'�n�ӉԎq','h.watanabe@ghi.jp');

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
    customers.name AS "�ڋq��",
    items.name AS "�J�e�S����",
    categories.name AS "���i��",
    orders.quantity AS "������"
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
insert into items values(mon_seq.nextval,'�~���N�`���R���[�g�i15����j',270,sysdate,sysdate,1);

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

--dept�o�^
insert into deptTest values(1,'�c�ƕ�');
insert into deptTest values(2,'�V�X�e���J����');
insert into deptTest values(3,'������');
insert into deptTest values(4,'�J�X�^�}�[�T�|�[�g��');

--customer�o�^
insert into addressTest values(1,'�����s');
insert into addressTest values(2,'��ʌ�');
insert into addressTest values(3,'��t��');
insert into addressTest values(4,'���{');

--addressTest�o�^
insert into customersTest values(2,'�吼�V�X�e��','���R���Y');
insert into customersTest values(2,'�W���p���X�[�p�[�l�b�g','���R���Y');


--emp�o�^
insert into empTest values(1,'�R�c���Y',23,1,1,1);
insert into empTest values(2,'��쐽',33,1,1,2);
insert into empTest values(3,'�ɓ��M�q',25,4,1,null);
insert into empTest values(4,'��؍O��',42,4,2,null);
insert into empTest values(5,'���c��',27,2,3,null);
insert into empTest values(6,'���R�T�O',30,2,4,null);
insert into empTest values(7,'�l�c�b��',33,3,1,null);

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