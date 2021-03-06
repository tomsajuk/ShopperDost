package com.example.android.bigbasket;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openCart(View view){
        Intent intent = new Intent(this,Cart.class);
        startActivity(intent);
    }
    public void openShoppingList(View view){
        Intent intent = new Intent(this,ShoppingList.class);
        startActivity(intent);
    }

    public void openItemSearch(View view){
        Intent intent = new Intent(this,ItemSearch.class);
        startActivity(intent);
    }

    public void offers(View v){
        Toast.makeText(this,"Sorry, no offers are available.",Toast.LENGTH_SHORT).show();
    }
    public void callCustomerCare(View view){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:8007821185"));
        startActivity(intent);
    }
    public void callHelp(View v){
        Intent intent = new Intent(this,Help.class);
        startActivity(intent);
    }
}
