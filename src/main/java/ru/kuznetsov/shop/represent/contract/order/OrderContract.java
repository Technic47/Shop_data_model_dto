package ru.kuznetsov.shop.represent.contract.order;

import ru.kuznetsov.shop.represent.contract.business.AbstractContract;
import ru.kuznetsov.shop.represent.dto.order.OrderDto;
import ru.kuznetsov.shop.represent.dto.order.OrderThinDto;
import ru.kuznetsov.shop.represent.enums.OrderStatusType;

import java.util.Collection;
import java.util.UUID;

public interface OrderContract extends AbstractContract<OrderDto> {

    Collection<OrderDto> getAllByCustomerId(UUID customerId);

    /**
     * Метод для поиска заказов с определёнными статусами.
     *
     * @param customerId   - id того пользователя, кто сделал заказ (nullable)
     * @param dateAfter    - фильтровать заказы после этой даты формат - "yyyy-MM-dd'T'HH:mm:ss" (nullable)
     * @param dateBefore   - фильтровать запозы до этой даты формат - "yyyy-MM-dd'T'HH:mm:ss"  (nullable)
     * @param hasStatus    - статус должен быть у заказа
     * @param hasNotStatus - статус Не должен быть у заказа
     * @return Список отфильтрованных заказов по статусам и доп параметрам. Dto без статусов и корзины.
     */
    Collection<OrderThinDto> getAllByStatusAndOptionalParams(
            UUID customerId,
            String dateAfter,
            String dateBefore,
            OrderStatusType hasStatus,
            OrderStatusType hasNotStatus
    );
}
