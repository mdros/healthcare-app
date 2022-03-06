drop table if exists "users";

create table "users"(
    id serial primary key not null,
    user_type varchar(10) not null check (user_type in ('USER', 'DOCTOR')) default 'USER',
    login varchar(255) not null,
    password varchar(255) not null,
    email varchar(255) not null,
    name varchar(100) not null,
    surname varchar(100) not null,
    specialisation varchar(100)
)