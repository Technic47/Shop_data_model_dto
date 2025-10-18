package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.ProductDto;

import java.util.Collection;

public interface ProductContract extends AbstractContract<ProductDto> {

    Collection<Boolean> createBatch(Collection<ProductDto> productDtoList);
}
