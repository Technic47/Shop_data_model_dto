package ru.kuznetsov.shop.represent.dto.order;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
import java.util.UUID;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class SellerNotificationDto {
    private UUID id;
    private String ownerId;
    private Long orderId;
    private Set<BucketItemDto> products;
}
