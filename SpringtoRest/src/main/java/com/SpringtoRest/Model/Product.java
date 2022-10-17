package com.SpringtoRest.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	private int ProductId;
	private String ProductName;
	private int ProductPrice;
	private int ProductAvail;

}
