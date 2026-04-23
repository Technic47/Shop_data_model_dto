package ru.kuznetsov.shop.represent.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import ru.kuznetsov.shop.represent.dto.AbstractDto;
import ru.kuznetsov.shop.represent.enums.DeliveryType;
import ru.kuznetsov.shop.represent.enums.PaymentType;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderDto extends AbstractDto {
    private String customerId;
    private Long totalSum;
    private DeliveryType deliveryType;
    private PaymentType paymentType;
    private String customerDeliveryAddress;
    private Long deliveryAddressId;
    private String comment;
    private Set<BucketItemDto> bucket;
    private Set<OrderStatusDto> statusList;
}
