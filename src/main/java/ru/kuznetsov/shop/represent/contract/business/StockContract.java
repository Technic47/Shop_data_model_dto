package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.StockDto;

import java.util.Collection;
import java.util.UUID;

public interface StockContract extends AbstractContract<StockDto> {

    Collection<StockDto> getAllByStoreId(Long storeId);

    Collection<StockDto> getAllByStoreIdAndOwnerId(Long storeId, UUID ownerId);

    Collection<StockDto> getAllByProductId(Long productId);
}
