package mvp_delivery_system.repositories;

import mvp_delivery_system.entites.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

