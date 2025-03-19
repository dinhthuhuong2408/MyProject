package com.example.myapplication;

import java.util.ArrayList;
import java.util.List;

public class GioHang {
    private static GioHang instance;
    private List<Product> cartItems;

    private GioHang() {
        cartItems = new ArrayList<>();
    }

    public static synchronized GioHang getInstance() {
        if (instance == null) {
            instance = new GioHang();
        }
        return instance;
    }

    public void addProduct(Product product) {
        cartItems.add(product);
    }

    public List<Product> getCartItems() {
        return cartItems;
    }
}
