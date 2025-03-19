package com.example.myapplication;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Laptop Legion", 15000000, R.drawable.laptop_image));
        productList.add(new Product("Chuột Gaming", 500000, R.drawable.mouse_image));
        productList.add(new Product("Bàn phím cơ", 1200000, R.drawable.keyboard_image));
        productList.add(new Product("Màn hình 24 inch", 3500000, R.drawable.monitor_image));
        productList.add(new Product("Tai nghe Bluetooth", 800000, R.drawable.headphone_image));


        DanhSachSP adapter = new DanhSachSP(productList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);


        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            return itemId == R.id.nav_home || itemId == R.id.nav_cart || itemId == R.id.nav_profile;
        });




        bottomNavigationView.setSelectedItemId(R.id.nav_home);
    }
}
