package jc.jdk10.order.model;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

public class OrderLine {
    private @Getter @Setter String productId;
    private @Getter @Setter BigDecimal quantity;
    private @Getter @Setter BigDecimal unitPrice;

    public BigDecimal getLineTotal() {
        if (unitPrice == null || quantity == null) return BigDecimal.ZERO;
        return unitPrice.multiply(quantity);
    }
}
