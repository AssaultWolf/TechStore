package com.example.sale.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sale.dto.ProductDto;
import com.example.sale.entity.Products;

@Repository
public interface ProductDao extends JpaRepository<Products, Integer>{
	
	@Query("SELECT new com.example.sale.dto.ProductDto( "
			+ "p.id, p.name, p.currentprice, p.createddate, c.id, "
			+ "c.name, min(pi.name), pd.discount, pd.enddate, AVG(pr.rating), p.isdeleted, pb.name "
			+ ") FROM Products p "
			+ "FULL JOIN p.productimagesCollection pi "
			+ "INNER JOIN p.categoryid c "
			+ "FULL JOIN p.productdiscountsCollection pd "
			+ "FULL JOIN p.productratesCollection pr "
			+ "INNER JOIN p.brandid pb "
			+ "GROUP BY p.id, p.name, p.currentprice, p.createddate, c.id, "
			+ "c.name, pd.discount, pd.enddate, p.isdeleted, pb.name "
			+ "ORDER BY p.createddate ")
	public Page<ProductDto> findAllProduct(Pageable pageable);
	
	@Query("SELECT new com.example.sale.dto.ProductDto( "
			+ "p.id, p.name, p.currentprice, p.createddate, c.id, "
			+ "c.name, min(pi.name), pd.discount, pd.enddate, AVG(pr.rating), p.isdeleted, pb.name "
			+ ") FROM Products p "
			+ "FULL JOIN p.productimagesCollection pi "
			+ "INNER JOIN p.categoryid c "
			+ "FULL JOIN p.productdiscountsCollection pd "
			+ "FULL JOIN p.productratesCollection pr "
			+ "INNER JOIN p.brandid pb "
			+ "WHERE p.id = ?1 "
			+ "GROUP BY p.id, p.name, p.currentprice, p.createddate, c.id, "
			+ "c.name, pd.discount, pd.enddate, p.isdeleted, pb.name "
			+ "ORDER BY p.createddate ")
	public ProductDto findProductDtoById(Integer id);
	
}	
