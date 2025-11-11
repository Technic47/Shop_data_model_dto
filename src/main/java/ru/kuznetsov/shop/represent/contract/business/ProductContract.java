package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.ProductDto;

import java.util.Collection;
import java.util.UUID;

public interface ProductContract extends AbstractContract<ProductDto> {

    Collection<ProductDto> getAllByOwnerId(UUID ownerId);
}
