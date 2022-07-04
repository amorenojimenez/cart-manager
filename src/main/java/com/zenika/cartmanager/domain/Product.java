package com.zenika.cartmanager.domain;

import java.math.BigDecimal;
import java.util.UUID;

public record Product(
        UUID productId,
        String name,
        int quantity,
        BigDecimal unitPrice
) {
}
