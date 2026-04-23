package ru.kuznetsov.shop.represent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class StockDto extends AbstractDto {
    private Integer amount;
    private Long productId;
    private String productName;
    private String store;
    private String storeAddress;
    private Boolean isReserved = false;
    private Long reservationOrderId;
}
