package jc.jdk10.order.data;

import jc.jdk10.order.model.Order;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface OrderRepository extends ReactiveSortingRepository<Order, String> {

    Flux<Order> findAllByCustomerId(String customerId);
}
