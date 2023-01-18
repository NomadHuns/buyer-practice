package shop.mtcoding.buyer.model;

import java.sql.Timestamp;

import lombok.Getter;
import lombok.Setter;

/*  id int auto_increment primary key,
    name varchar not null unique,
    price int not null,
    qty int not null,
    createdAt timestamp */

@Getter
@Setter
public class Product {
    private Integer id;
    private String name;
    private Integer price;
    private Integer qty;
    private Timestamp createdAt;
}
