package ru.kuznetsov.shop.represent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductDto extends AbstractDto {
    private String name;
    private String description;
    private Integer price;
    private String category;
    private String ownerId;
}
