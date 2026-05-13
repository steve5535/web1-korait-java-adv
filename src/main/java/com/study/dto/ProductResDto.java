package com.study.dto;

import com.study.entity.Product;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class ProductResDto {
    public String name;
    private int price;
    private int stock;
    private String category;
}
