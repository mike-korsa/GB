/*
 * Copyright 2019 Alexander Kosarev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package name.alexkosarev.tutorials.catalog.web;

import name.alexkosarev.tutorials.catalog.Product;
import name.alexkosarev.tutorials.catalog.ProductRepository;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ProductsControllerTest {

    private ProductRepository productRepository = Mockito.mock(ProductRepository.class);

    private ProductsController productsController = new ProductsController(productRepository);

    @Test
    public void list_ReturnsValidModelAndView() {
        // given
        List<Product> products = IntStream.range(1, 4)
                .mapToObj(i -> new Product(UUID.randomUUID(), "Product #" + i,
                        "Product #" + i + " description"))
                .collect(Collectors.toList());

        Mockito.doReturn(products).when(this.productRepository).findAll();

        // when
        ModelAndView modelAndView = this.productsController.list();

        // then
        Assert.assertNotNull(modelAndView);
        Assert.assertEquals(products, modelAndView.getModel().get("products"));
        Assert.assertEquals("catalog/products/list", modelAndView.getViewName());
        Assert.assertEquals(HttpStatus.OK, modelAndView.getStatus());

        Mockito.verify(this.productRepository).findAll();
    }

    @Test
    public void product_ProductExists_ReturnsValidModelAndView() {
        // given
        Product product = new Product(UUID.randomUUID(), "Product #1", "Product #1 description");
        Mockito.doReturn(Optional.of(product)).when(this.productRepository).findOneById(ArgumentMatchers.any());

        // when
        ModelAndView modelAndView = this.productsController.product(product.getId());

        // then
        Assert.assertNotNull(modelAndView);
        Assert.assertEquals(product, modelAndView.getModel().get("product"));
        Assert.assertEquals("catalog/products/product", modelAndView.getViewName());
        Assert.assertEquals(HttpStatus.OK, modelAndView.getStatus());

        Mockito.verify(this.productRepository).findOneById(ArgumentMatchers.eq(product.getId()));
    }

    @Test
    public void product_ProductDoesNotExist_ReturnsModelAndViewWithError() {
        // given
        UUID productId = UUID.randomUUID();
        Mockito.doReturn(Optional.empty()).when(this.productRepository).findOneById(ArgumentMatchers.any());

        // when
        ModelAndView modelAndView = this.productsController.product(productId);

        // then
        Assert.assertNotNull(modelAndView);
        Assert.assertEquals("Couldn't find a product", modelAndView.getModel().get("error"));
        Assert.assertEquals("errors/404", modelAndView.getViewName());
        Assert.assertEquals(HttpStatus.NOT_FOUND, modelAndView.getStatus());

        Mockito.verify(this.productRepository).findOneById(ArgumentMatchers.eq(productId));
    }
}
