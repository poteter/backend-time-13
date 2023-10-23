create table if not exists part(
     part_id bigint not null auto_increment primary key,
     part_name varchar(100) not null,
     part_quantity bigint
);

create sequence part_seq;