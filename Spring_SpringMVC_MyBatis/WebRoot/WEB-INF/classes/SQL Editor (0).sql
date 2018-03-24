create database ssm

create table goods(
			id int primary key  auto_increment,
			name varchar(15) ,
			price double,
			type varchar(10),
			stock int)
alter table goods change type type varchar(20)
create unique index index_name on goods(name)
desc goods