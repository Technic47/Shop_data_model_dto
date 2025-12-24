package ru.kuznetsov.shop.represent.contract.order;

import ru.kuznetsov.shop.represent.contract.business.AbstractContract;
import ru.kuznetsov.shop.represent.dto.order.OrderStatusDto;
import ru.kuznetsov.shop.represent.enums.OrderStatusType;

import java.util.Collection;
import java.util.Optional;

public interface OrderStatusContract extends AbstractContract<OrderStatusDto> {

    Collection<OrderStatusDto> getAllByOrderId(Long orderId);

    Optional<OrderStatusDto> getLastByOrderId(Long orderId);

    Collection<OrderStatusDto> getAllByStatus(OrderStatusType status);
}
