create table product_tb(
    id int auto_increment primary key,
    name varchar not null unique,
    price int not null,
    qty int not null,
    created_at timestamp
);

create table user_tb(
    id int auto_increment primary key,
    username varchar not null unique,
    password varchar not null,
    email varchar not null,
    created_at timestamp
);