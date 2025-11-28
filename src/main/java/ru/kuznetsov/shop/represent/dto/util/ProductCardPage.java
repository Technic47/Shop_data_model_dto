package ru.kuznetsov.shop.represent.dto.util;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import ru.kuznetsov.shop.represent.dto.ProductCardDto;

import java.util.List;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class ProductCardPage {
    private int number;
    private int numberOfElements;
    private int totalElements;
    private int totalPages;
    private List<ProductCardDto> content;
}
