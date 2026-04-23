package ru.kuznetsov.shop.represent.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.Set;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerNotificationDto {
    private UUID id;
    private String ownerId;
    private Long orderId;
    private Set<BucketItemDto> products;
}
