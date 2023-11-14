package com.ShopCartD14.ShopCartD14.repository;

import org.springframework.stereotype.Repository;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Repository
@SessionScope
public class Cart  {

    private List<Long> cartList = new ArrayList<>();

    public void add(Long id) {
        cartList.add(id) ;
    }

    public List<Long> get(){
        return Collections.unmodifiableList(cartList);
    }
}
