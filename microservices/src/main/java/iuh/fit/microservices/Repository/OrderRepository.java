package iuh.fit.microservices.Repository;

import iuh.fit.microservices.Entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
