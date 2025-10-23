package ru.kuznetsov.shop.represent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import ru.kuznetsov.shop.represent.enums.OperationType;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperationDto {
    private String id;
    private OperationType operationType;
    private int result;
}
