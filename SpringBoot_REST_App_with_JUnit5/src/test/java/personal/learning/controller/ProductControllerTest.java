package personal.learning.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import personal.learning.services.ProductService;

@SpringBootTest
class ProductControllerTest {
	
	private ProductController productController;
	
	@Autowired
	private ProductService productService;
	
	@BeforeEach
	public void setUp() {
		productController = new ProductController(productService);
	}

	@Test
	void productListShouldNotBeEmptyForAnySizeIfProductIsAvailable() {
		assertThat(productController.getProductsByBrand(42, null, 0).size()).isNotEqualTo(0);
		assertThat(productController.getProductsByBrand(42, null, 100).size()).isNotEqualTo(0);
		assertThat(productController.getProductsByBrand(42, null, -3).size()).isNotEqualTo(0);
	}

}
