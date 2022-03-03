package com.example.homework_1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.homework_1.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        String[] name = {"Oatmeal", "Almonds","Banana","Sweet Potatoes","Broccoli","Steak","Protein Smoothie","Tuna Sandwich","Yogurt","Scrambled Eggs"};
        String[] rich = {"Oatmeal has a well-balanced nutritional profile, providing these nutrients: Calories: 95. Protein: 5 grams. Fat: 3 grams.",
                        "vitamin E, magnesium, and riboflavin, and a good source of fiber and phosphorus",
        "potassium and fiber", "beta carotene, vitamin C, and potassium","a wealth of nutrients and antioxidants","rich in high-quality protein, vitamins, and minerals",
        "Rich in protein and calories", "omega-3 fatty acids", "protein, calcium and potassium", "protein, B vitamins, calcium, vitamin A, phosphorus and iron"};

        ArrayList<Item> itemArrayList = new ArrayList<>();
        for(int i = 0; i< name.length;i++){
            Item item = new Item(name[i], rich[i]);
            itemArrayList.add(item);
        }

        ListAdapter adapter = new ListAdapter(MainActivity.this, itemArrayList);

        binding.listview.setAdapter(adapter);
        binding.listview.setClickable(true);
        binding.listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l) {

                Intent i = new Intent(MainActivity.this, ItemActivity.class);
                i.putExtra("name",name[position]);
                i.putExtra("nutrition",rich[position]);
                startActivity(i);

            }
        });
    }
}