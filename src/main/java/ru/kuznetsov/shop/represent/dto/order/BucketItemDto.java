package ru.kuznetsov.shop.represent.dto.order;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.kuznetsov.shop.represent.dto.AbstractDto;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BucketItemDto extends AbstractDto {

    private Long productId;
    private Integer amount;
    private Long orderId;
    private String customerId;
}
