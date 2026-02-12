package ru.kuznetsov.shop.represent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCardDto implements Serializable {
    private Long id;
    private String name;
    private String description;
    private Integer price;
    private String category;
    private String ownerId;
    private LocalDateTime created;
    private Map<String, Integer> stock;
}
