package com.example.shoppingmall_springboot.Dto;

import com.example.shoppingmall_springboot.constant.OrderStatus;
import com.example.shoppingmall_springboot.entity.Order;
import lombok.Data;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Data
public class OrderHistDto {
    public OrderHistDto(Order order){
        this.orderId = order.getId();
        this.orderDate = order.getOrderDate().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
        this.orderStatus = order.getOrderStatus();
    }

    private Long orderId; //주문아이디
    private String orderDate; //주문날짜
    private OrderStatus orderStatus; //주문 상태

    private List<OrderItemDto> orderItemDtoList = new ArrayList<>();

    //주문 상품리스트
    public void addOrderItemDto(OrderItemDto orderItemDto){
        orderItemDtoList.add(orderItemDto);
    }
}
