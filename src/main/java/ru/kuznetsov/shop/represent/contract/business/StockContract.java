package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.StockDto;

import java.util.Collection;
import java.util.UUID;

public interface StockContract extends AbstractContract<StockDto> {

    Collection<StockDto> getAll(Long productId, Long storeId, UUID ownerId);
}
