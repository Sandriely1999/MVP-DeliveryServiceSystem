package mvp_delivery_system.repositories;

import mvp_delivery_system.entites.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}