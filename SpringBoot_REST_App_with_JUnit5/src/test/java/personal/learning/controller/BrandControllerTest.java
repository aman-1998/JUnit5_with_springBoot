package personal.learning.controller;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import personal.learning.custom.response.ErrorPayload;
import personal.learning.model.entity.Brand;
import personal.learning.services.BrandService;

@SpringBootTest
class BrandControllerTest {
	
	private BrandController brandController;
	
	@Autowired
	BrandService brandService;
	
	@BeforeEach
	public void setUp() {
		brandController = new BrandController(brandService);
	}

	@Test
	public void shouldReturnNonEmptyList() {
		assertThat(brandController.getBrands().getBody()).isNotEqualTo(Collections.emptyList());
	}
	
	@Test
	public void shouldReturnDefaultBrandWhenBrandwithGivenIdNotPresent() {
		assertThat(brandController.getBrand(123).getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
	
	@Test
	public void shouldGiveErrorDuringBrandCreationIfBrandAlreadyExists() {
		Brand brand = new Brand(2, "Mahindra");
		assertThat(brandController.createBrand(brand).getBody()).isEqualTo(new ErrorPayload("Creation of brand is unsuccessful", HttpStatus.UNPROCESSABLE_ENTITY));
		assertThat(brandController.createBrand(brand).getStatusCode()).isEqualTo(HttpStatus.UNPROCESSABLE_ENTITY);
	}
	
	@Test
	public void shouldReturnErrorDuringUpdationIfBrandDoesNotExist() {
		Brand brand = new Brand(2, "Ducati");
		assertThat(brandController.updateBrand(2, brand).getBody()).isEqualTo(new ErrorPayload("Brand with brand id ["+ 2 +"] is not updated", HttpStatus.NOT_FOUND));
		assertThat(brandController.updateBrand(2, brand).getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
	
	@Test
	public void shouldReturnErrorDuringUpdationIfBrandIdOfPayloadAndParameterDoesNotMatch() {
		Brand brand = new Brand(1, "Mahindra");
		assertThat(brandController.updateBrand(2, brand).getBody()).isEqualTo(new ErrorPayload("Brand with brand id ["+ 2 +"] is not updated", HttpStatus.NOT_FOUND));
		assertThat(brandController.updateBrand(2, brand).getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}
	
	@Test
	public void shouldReturnErrorIfDuringDeletionBrandDoesNotExist() {
		int id = 2;
		assertThat(brandController.deleteBrand(2).getBody()).isEqualTo(new ErrorPayload("Brand with brand id ["+ 2 +"] is not deleted", HttpStatus.NOT_FOUND));
		assertThat(brandController.deleteBrand(2).getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
	}

}
