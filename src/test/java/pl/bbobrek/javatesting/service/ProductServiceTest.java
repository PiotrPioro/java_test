package pl.bbobrek.javatesting.service;

import org.junit.jupiter.api.Test;
import pl.bbobrek.javatesting.model.Product;
import pl.bbobrek.javatesting.model.ProductProcessResult;
import pl.bbobrek.javatesting.repo.ProductRepository;

import java.math.BigDecimal;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class ProductServiceTest {

    @Test
    void saveOrUpdate() {

        //given
        ProductRepository productRepository = mock(ProductRepository.class);
        ProductService productService = new ProductService(productRepository);
        Product product = prepareProduct();
        /*given().willReturn()*/

        //when
        ProductProcessResult productResult = productService.saveOrUpdate(product);

        //then
        /*assertThat()*/
    }

    private Product prepareProduct(){
        Product product = new Product();
        product.setPrice( new BigDecimal("10.23"));
        product.setName("name1");
        return product;
    }
}
