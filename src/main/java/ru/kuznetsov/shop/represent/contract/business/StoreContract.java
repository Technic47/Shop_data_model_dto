package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.StockDto;
import ru.kuznetsov.shop.represent.dto.StoreDto;

import java.util.Collection;
import java.util.UUID;

public interface StoreContract extends AbstractContract<StoreDto> {

    Collection<StoreDto> getAll(Long id, String name, Long addressId, UUID ownerId);

    Collection<StockDto> getAllStockByStoreId(Long storeId);
}
