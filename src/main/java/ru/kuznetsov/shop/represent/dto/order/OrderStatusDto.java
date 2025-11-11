package ru.kuznetsov.shop.represent.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.kuznetsov.shop.represent.dto.AbstractDto;
import ru.kuznetsov.shop.represent.enums.OrderStatusType;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderStatusDto extends AbstractDto {
    private OrderStatusType status;
    private String statusChangerId;
    private String comment;
    private Long orderId;
}
