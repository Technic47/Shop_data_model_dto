package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.StockDto;
import ru.kuznetsov.shop.represent.dto.StoreDto;

import java.util.List;

public interface StoreContract extends AbstractContract<StoreDto>{

    List<StoreDto> getAll(Long id, String name, Long addressId);

    List<StockDto> getAllStockByStoreId(Long storeId);
}
