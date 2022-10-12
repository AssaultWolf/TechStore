package com.example.sale.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private Integer productId;
	private String productName;
	private Double productPrice;
	private Date productCreatedDate;
	private Integer categoryId;
	private String categoryName;
	private String oneImage;
	private Integer discountPercent;
	private Date discountEndDate;
	private Double avgRate;
	private Boolean isActive;
	private String brandName;

}
