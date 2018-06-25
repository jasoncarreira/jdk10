package jc.jdk10.app.rest;

import jc.jdk10.order.model.Order;
import jc.jdk10.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orders")
public class OrderEndpoint {
    @Autowired
    OrderService orderService;

    @GetMapping("/customer/{customerId}")
    public Flux<Order> getAllForCustomer(@PathVariable String customerId) {
        return orderService.findAllForCustomer(customerId);
    } 

    @GetMapping("/{orderId}")
    public Mono<Order> getOne(@PathVariable String orderId) {
        return orderService.findOne(orderId);
    }
}
