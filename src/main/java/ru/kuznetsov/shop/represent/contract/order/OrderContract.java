package ru.kuznetsov.shop.represent.contract.order;

import ru.kuznetsov.shop.represent.contract.business.AbstractContract;
import ru.kuznetsov.shop.represent.dto.order.OrderDto;

import java.util.Collection;
import java.util.UUID;

public interface OrderContract extends AbstractContract<OrderDto> {

    Collection<OrderDto> getAllByCustomerId(UUID customerId);
}
