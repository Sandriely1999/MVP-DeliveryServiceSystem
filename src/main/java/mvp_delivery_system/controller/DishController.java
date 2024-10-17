package mvp_delivery_system.controller;


import mvp_delivery_system.entites.Dish;
import mvp_delivery_system.services.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/dishes")
@CrossOrigin(origins = "http://localhost:4200")
public class DishController {

    @Autowired
    private DishService dishService;

    @GetMapping
    public ResponseEntity<List<Dish>> findAllDishes() {
        List<Dish> list = dishService.findAllDishes();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Dish> findDishById(@PathVariable Long id) {
        Dish obj = dishService.findDishById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Dish> createDish(@RequestBody Dish dish) {
        Dish objDish = dishService.createDish(dish);
        return ResponseEntity.ok().body(objDish);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Dish> updateDish(@PathVariable Long id, @RequestBody Dish dish) {
        Dish objDish = dishService.updateDish(id, dish);
        return ResponseEntity.ok().body(objDish);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> deleteDish(@PathVariable Long id) {
        dishService.deleteDish(id);
        return ResponseEntity.noContent().build();
    }
    
    
}
