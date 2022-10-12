package com.example.sale.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sale.dto.ProductDto;
import com.example.sale.entity.Products;

@Repository
public interface ProductDao extends JpaRepository<Products, Integer>{
	
	@Query("SELECT new com.example.sale.dto.ProductDto( "
			+ "p.id, p.name, p.currentprice, p.createddate, c.id, "
			+ "c.name, min(pi.name), pd.discount, pd.enddate, AVG(pr.rating) "
			+ ") FROM Products p "
			+ "INNER JOIN p.productimagesCollection pi "
			+ "INNER JOIN p.categoryid c "
			+ "FULL JOIN p.productdiscountsCollection pd "
			+ "FULL JOIN p.productratesCollection pr "
			+ "GROUP BY p.id, p.name, p.currentprice, p.createddate, c.id, "
			+ "c.name, pd.discount, pd.enddate")
	public List<ProductDto> findAllProduct();
}
