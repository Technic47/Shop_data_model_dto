package ru.kuznetsov.shop.represent.dto.payment;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import ru.kuznetsov.shop.represent.dto.order.BucketItemDto;

import java.time.LocalDateTime;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ReceiptDto {
    private Long orderId;
    private Long totalSum;
    private String comment;
    private Set<BucketItemDto> bucket;
    private LocalDateTime created;
    private LocalDateTime expireDate;
}
