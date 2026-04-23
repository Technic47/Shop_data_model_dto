package ru.kuznetsov.shop.represent.dto.order;

import lombok.*;
import ru.kuznetsov.shop.represent.dto.AbstractDto;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BucketItemDto extends AbstractDto {
    private Long productId;
    private String ownerId;
    private Integer amount;
    private Long orderId;
    private String customerId;
}
