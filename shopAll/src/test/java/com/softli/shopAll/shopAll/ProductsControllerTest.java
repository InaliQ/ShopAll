package com.softli.shopAll.shopAll;

import com.softli.shopAll.shopAll.controller.ProductsController;
import com.softli.shopAll.shopAll.exceptions.ProductNotFoundException;
import com.softli.shopAll.shopAll.service.IProducts;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductsController.class)
public class ProductsControllerTest {
	@Autowired
	private MockMvc mockMvc;

	@MockBean
	private IProducts productsService;


	@Test
	void testProductNotFound() throws Exception {
		Mockito.when(productsService.findById(10)).thenThrow(new ProductNotFoundException("Producto no encontrado con id 10"));

		mockMvc.perform(MockMvcRequestBuilders.get("/api/v1/product/10")
						.accept(MediaType.APPLICATION_JSON))
				.andExpect(status().isNotFound())
				.andExpect(content().string("Producto no encontrado con id 10"));
	}

}
