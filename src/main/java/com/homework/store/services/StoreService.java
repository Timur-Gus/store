package com.homework.store.services;

import com.homework.store.interfaces.OrderInterface;
import com.homework.store.order.MyOrder;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class StoreService {
    public MyOrder order;

    public StoreService(MyOrder order) {
        this.order = order;
    }

    public void add(List<Integer> id) {
        order.add(id);
    }

    public List<Integer> get() {
       return order.get();
    }
}

