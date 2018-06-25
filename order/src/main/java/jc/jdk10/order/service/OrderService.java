package jc.jdk10.order.service;

import jc.jdk10.order.data.OrderRepository;
import jc.jdk10.order.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import javax.validation.Valid;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    public Mono<Order> findOne(String orderId) {
        return orderRepository.findById(orderId);
    }


    public Flux<Order> findAllForCustomer(String customerId) {
        return orderRepository.findAllByCustomerId(customerId);
    }

    public Mono<Order> save(@Valid Order order) {
        return orderRepository.save(order);
    }
}
