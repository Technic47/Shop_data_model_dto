package ru.kuznetsov.shop.represent.contract.order;

import ru.kuznetsov.shop.represent.contract.business.AbstractContract;
import ru.kuznetsov.shop.represent.dto.order.OrderStatusDto;

import java.util.Collection;
import java.util.Optional;

public interface OrderStatusContract extends AbstractContract<OrderStatusDto> {

    Collection<OrderStatusDto> getAllByOrderId(Long orderId);

    Optional<OrderStatusDto> getLastByOrderId(Long orderId);
}
