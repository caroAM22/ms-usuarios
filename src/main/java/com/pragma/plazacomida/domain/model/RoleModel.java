package com.pragma.plazacomida.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleModel {
    private Long id;
    private String name;
    private String description;
} 