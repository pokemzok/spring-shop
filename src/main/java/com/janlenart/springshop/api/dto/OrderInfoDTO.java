package com.janlenart.springshop.api.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderInfoDTO {

    private Integer id;
    private LocalDateTime orderDateTime;
    private float totalPrice;
    private String totalPriceCurrency;
    private String status;
    private CustomerDTO customerDTO;
    private List<ItemDTO> itemDTOList;
}
