package com.hackaton.enumeracao.entities;

import com.hackaton.data.application.Date;
import com.hackaton.enumeracao.entities.enums.OrderStatus;

public class Order {

    private Integer id;
    private Date moment;
    private OrderStatus status;

    
public Order() {

}

public Order(Integer id, Date moment, OrderStatus status){
    
    this.id = id;
    this.moment = moment;
    this.status = status;
}
 
}

