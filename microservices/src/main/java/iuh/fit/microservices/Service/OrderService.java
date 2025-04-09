package iuh.fit.microservices.Service;

import iuh.fit.microservices.Entity.Order;
import iuh.fit.microservices.Repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public List<Order> getAll() {
        return repository.findAll();
    }

    public Order getById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public Order create(Order order) {
        return repository.save(order);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Order update(Long id, Order order) {
        order.setId(id);
        return repository.save(order);
    }
}
