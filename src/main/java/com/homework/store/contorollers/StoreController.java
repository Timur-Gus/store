package com.homework.store.contorollers;

import com.homework.store.services.StoreService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public void add(@RequestParam("id") List<Integer> id) {
        storeService.add(id);
    }

    @GetMapping("/get")
    public List<Integer> get() {
        return storeService.get();
    }
}
