package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.StockDto;
import ru.kuznetsov.shop.represent.dto.StoreDto;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

public interface StoreContract extends AbstractContract<StoreDto> {

    List<StoreDto> getAll(Long id, String name, Long addressId);

    Collection<StoreDto> getAllByOwnerId(UUID ownerId);

    List<StockDto> getAllStockByStoreId(Long storeId);
}
