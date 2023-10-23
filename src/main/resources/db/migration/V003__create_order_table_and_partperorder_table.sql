create table if not exists ordertable(
    order_id bigint not null auto_increment primary key,
    order_customer_id bigint,
    order_part_per_order_id bigint
);

create table if not exists partperorder(
     partperorder_id bigint not null auto_increment primary key,
     order_id bigint not null,
     part_id bigint not null,
     part_quantity bigint not null
);
create sequence order_seq;