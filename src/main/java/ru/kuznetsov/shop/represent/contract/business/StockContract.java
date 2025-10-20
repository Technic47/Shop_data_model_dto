package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.StockDto;

import java.util.Collection;

public interface StockContract extends AbstractContract<StockDto> {

    Collection<StockDto> getAllByStoreId(Long storeId);

    Collection<StockDto> getAllByProductId(Long productId);
}
