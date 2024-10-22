package mvp_delivery_system.models.response;

import lombok.Getter;
import lombok.Setter;
import mvp_delivery_system.entites.Dish;

@Getter
@Setter
public class DishResponse {
    private String name;
    private String description;
    private Double price;


    public DishResponse (Dish dish) {
        this.name = dish.getName();
        this.description = dish.getDescription();
        this.price = dish.getPrice();

    }
}

