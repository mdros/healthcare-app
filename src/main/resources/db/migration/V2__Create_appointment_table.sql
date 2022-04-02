drop table if exists "appointments";

create table "appointments" (
    id serial primary key not null,
    appointment_date_time timestamp without time zone not null,
    reserved bool not null default false,
    user_id int references users (id),
    doctor_id int references users (id)
);