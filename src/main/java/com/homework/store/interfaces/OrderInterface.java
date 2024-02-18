package com.homework.store.interfaces;

import java.util.List;

public interface OrderInterface {
    void add(List<Integer> id);

    List<Integer> get();
}
