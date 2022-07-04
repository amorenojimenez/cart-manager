package com.zenika.cartmanager.domain;

import java.util.Set;
import java.util.UUID;

public record Cart(
        UUID cartId,
        Set<Product> productList
) {
}
