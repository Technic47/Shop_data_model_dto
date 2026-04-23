package ru.kuznetsov.shop.represent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Data
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
