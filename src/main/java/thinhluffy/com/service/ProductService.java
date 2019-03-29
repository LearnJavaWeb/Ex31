package thinhluffy.com.service;

import thinhluffy.com.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface ProductService {

    Page<Product> findAll(Pageable pageable);

    Product findById(int id);

    void remove (int id);

    void save (Product product);

}
