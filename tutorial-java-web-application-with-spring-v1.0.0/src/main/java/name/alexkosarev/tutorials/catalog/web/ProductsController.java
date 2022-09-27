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

import lombok.RequiredArgsConstructor;
import name.alexkosarev.tutorials.catalog.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;
import java.util.UUID;

/**
 * Контроллер для обработки запросов, связанных с продуктами.
 *
 * @author Alexander Kosarev
 * @since 1.0.0
 */
@Controller
@RequestMapping("catalog/products")
@RequiredArgsConstructor
public class ProductsController {

    private final ProductRepository productRepository;

    @GetMapping("list")
    public ModelAndView list() {
        return new ModelAndView("catalog/products/list",
                Map.of("products", this.productRepository.findAll()), HttpStatus.OK);
    }

    @GetMapping("{productId}")
    public ModelAndView product(@PathVariable UUID productId) {
        return this.productRepository.findOneById(productId)
                .map(product -> new ModelAndView("catalog/products/product",
                        Map.of("product", product), HttpStatus.OK))
                .orElseGet(() -> new ModelAndView("errors/404",
                        Map.of("error", "Couldn't find a product"), HttpStatus.NOT_FOUND));
    }
}
