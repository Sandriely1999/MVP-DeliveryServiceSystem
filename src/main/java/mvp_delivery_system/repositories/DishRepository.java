package mvp_delivery_system.repositories;

import mvp_delivery_system.entites.Dish;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DishRepository extends JpaRepository<Dish, Long> {

    List<Dish> findAllByAvailability(Boolean availability);
}
