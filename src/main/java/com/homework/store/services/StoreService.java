package com.homework.store.services;

import com.homework.store.interfaces.OrderInterface;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Service
@SessionScope
public class StoreService implements OrderInterface {
    private final List<Integer> ids;

    public StoreService() {
        ids = new ArrayList<>();
    }

    @Override
    public void add(List<Integer> id) {
        ids.addAll(id);
    }

    @Override
    public List<Integer> get() {
        return Collections.unmodifiableList(ids);
    }
}
