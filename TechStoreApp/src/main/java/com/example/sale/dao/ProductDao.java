package com.example.sale.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sale.dto.ProductDto;
import com.example.sale.entity.Products;

@Repository
public interface ProductDao extends JpaRepository<Products, Integer>{
	
//	@Query("SELECT new com.example.sale.dto.ProductDto( "
//			+ "p.id, p.name, p.currentPrice, p.createdDate, c.id, "
//			+ "c.name, min(pi.name), pd.discount, pd.endDate, AVG(pr.rating) "
//			+ ") FROM Product p "
//			+ "INNER JOIN p.productImages pi "
//			+ "INNER JOIN p.category c "
//			+ "FULL JOIN p.productDiscounts pd "
//			+ "FULL JOIN p.productRates pr "
//			+ "GROUP BY p.id, p.name, p.currentPrice, p.createdDate, c.id, "
//			+ "c.name, pd.discount, pd.endDate")
//	public List<ProductDto> findAllProduct();
}
