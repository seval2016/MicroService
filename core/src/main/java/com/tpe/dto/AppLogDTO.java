package com.tpe.dto;


import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppLogDTO {
    private String id;

    private String level; // enum type STring olarak girilecek

    private String description;

    private LocalDateTime time;
}