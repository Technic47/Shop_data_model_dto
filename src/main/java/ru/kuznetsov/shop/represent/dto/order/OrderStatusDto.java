package ru.kuznetsov.shop.represent.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import ru.kuznetsov.shop.represent.dto.AbstractDto;
import ru.kuznetsov.shop.represent.enums.OrderStatusType;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderStatusDto extends AbstractDto {
    private OrderStatusType status;
    private String statusChangerId;
    private String comment;
    private Long orderId;
}
