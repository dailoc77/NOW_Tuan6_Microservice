package iuh.fit.microservices.Service;

import iuh.fit.microservices.Entity.Product;
import iuh.fit.microservices.Repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;

    public Product create(Product p) {
        return repository.save(p);
    }

    public Product get(Long id) {
        return repository.findById(id).orElseThrow();
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Product update(Long id, Product p) {
        p.setId(id);
        return repository.save(p);
    }
}

