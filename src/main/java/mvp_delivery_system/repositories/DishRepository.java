package mvp_delivery_system.repositories;

import mvp_delivery_system.entites.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DishRepository extends JpaRepository<Dish, Long> {
}
