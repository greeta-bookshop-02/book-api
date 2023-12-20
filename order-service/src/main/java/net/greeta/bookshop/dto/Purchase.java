package net.greeta.bookshop.dto;

import net.greeta.bookshop.entity.Address;
import net.greeta.bookshop.entity.Customer;
import net.greeta.bookshop.entity.Order;
import net.greeta.bookshop.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}
