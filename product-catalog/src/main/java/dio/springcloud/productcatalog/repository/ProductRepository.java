package dio.springcloud.productcatalog.repository;

import dio.springcloud.productcatalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {



}
