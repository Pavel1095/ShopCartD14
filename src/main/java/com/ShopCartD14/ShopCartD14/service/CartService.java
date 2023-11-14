package com.ShopCartD14.ShopCartD14.service;

import java.util.List;

public interface  CartService {

    void add(List<Long> items);

    List<Long> get();
}
