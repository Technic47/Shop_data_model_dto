package ru.kuznetsov.shop.represent.dto;

import lombok.*;

import java.time.LocalDateTime;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractDto {
    private Long id;
    private LocalDateTime created;
    private LocalDateTime updated;
}
