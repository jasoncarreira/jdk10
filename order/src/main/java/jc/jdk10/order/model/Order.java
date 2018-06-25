package jc.jdk10.order.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.query.ViewIndexed;

import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@ViewIndexed(designDoc = "blog", viewName = "all")
public @ToString class Order {
    @Id
    private @Getter @Setter String orderId = UUID.randomUUID().toString();
    private @Getter @Setter String customerId;
    private @Getter @Setter Set<OrderLine> lines;

    public BigDecimal getOrderTotal() {
        if (lines == null || lines.size() == 0) return BigDecimal.ZERO;
        return lines.stream().map(OrderLine::getLineTotal).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

}
