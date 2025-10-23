package ru.kuznetsov.shop.represent.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperationPayloadDto {
    private Long payloadId;
    private LocalDateTime dateTime;
}
