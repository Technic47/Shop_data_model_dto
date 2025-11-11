package ru.kuznetsov.shop.represent.contract.order;

import ru.kuznetsov.shop.represent.contract.business.AbstractContract;
import ru.kuznetsov.shop.represent.dto.order.BucketItemDto;

import java.util.Collection;
import java.util.UUID;

public interface BucketItemContract extends AbstractContract<BucketItemDto> {

    Collection<BucketItemDto> getAllByCustomerId(UUID customerId);

    Collection<BucketItemDto> getAllByOrderId(Long orderId);
}
