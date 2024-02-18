package com.homework.store.order;

import com.homework.store.interfaces.OrderInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Repository
@SessionScope
public class MyOrder implements OrderInterface {
    private final List<Integer> ids;

    public MyOrder() {
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
