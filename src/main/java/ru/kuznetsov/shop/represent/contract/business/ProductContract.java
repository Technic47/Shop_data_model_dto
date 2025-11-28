package ru.kuznetsov.shop.represent.contract.business;

import ru.kuznetsov.shop.represent.dto.ProductCardDto;
import ru.kuznetsov.shop.represent.dto.ProductDto;
import ru.kuznetsov.shop.represent.dto.util.ProductCardPage;

import java.util.Collection;
import java.util.UUID;

public interface ProductContract extends AbstractContract<ProductDto> {

    Collection<ProductDto> getAllByOwnerId(UUID ownerId);

    Collection<ProductDto> getAllByOwnerIdOrCategoryId(UUID ownerId, Long categoryId);

    Collection<ProductCardDto> getProductCardsByOwnerIdAOrCategoryId(UUID ownerId, Long categoryId);

    ProductCardPage getProductCardDtoPageable(int pageNum, int pageSize, String sortBy, String sortDirection);

    ProductCardPage getProductCardDtoByCategoryOrOwnerIdPageable(
            UUID ownerId,
            Long categoryId,
            int pageNum,
            int pageSize,
            String sortBy,
            String sortDirection
    );
}
