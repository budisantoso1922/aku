package com.example.fajar.belajarlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class ListActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    Intent intent;
    String[] listgame = {"Color TV Game","NES","Super Nintendo","Nintendo 64","Game Cube","Panasonic Q","Nintendo Wii","Wii Mini","Nintendo Wii-U","Nintendo Switch"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        listView = (ListView) findViewById(R.id.list_item1);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listgame);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        switch(position){
            case 0:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Color TV Game");
                intent.putExtra("picture", R.drawable.nintendo_color_tv_game_large);
                intent.putExtra("detail","The Color TV Game series includes five different pieces of hardware, each one with a unique game. Color TV Game systems did not have interchangeable cartridges, so each console could only play a single title. (1977-1979)");
                startActivity(intent);
                break;

            case 1:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","NES");
                intent.putExtra("picture",R.drawable.nintendo_entertainment_system_model_large);
                intent.putExtra("detail","The Nintendo Entertainment System, an 8-bit system, was one of Nintendo's largest successes. Unlike the Color TV Games, the NES could play different titles that could be purchased at the store. (1985)");
                startActivity(intent);
                break;

            case 2:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Super Nintendo");
                intent.putExtra("picture",R.drawable.super_nintendo_north_america_model);
                intent.putExtra("detail","The Super Nintendo Entertainment System featured enhanced graphics, a brand new controller, and more. It was the first 16-bit console by Nintendo. (1991)");
                startActivity(intent);
                break;

            case 3:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Nintendo 64");
                intent.putExtra("picture",R.drawable.nintendo64_large);
                intent.putExtra("detail","The Nintendo 64 featured greatly improved 3D graphics and a new controller that introduced the modern joystick. It was also the first home console to have four controller ports built into the system. (1996)");
                startActivity(intent);
                break;

            case 4:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Game Cube");
                intent.putExtra("picture",R.drawable.nintendo_gamecube_purple_model_large);
                intent.putExtra("detail","The GameCube featured enhanced graphics and a new controller. The games came on mini-discs. It was the first Nintendo home console to solely use a disc format for games. (2001)");
                startActivity(intent);
                break;

            case 5:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Panasonic Q");
                intent.putExtra("picture",R.drawable.panasonicq_large);
                intent.putExtra("detail","The Panasonic Q is a hybrid version of the Nintendo GameCube with the ability to play DVDs, Audio CDs, MP3s and CDs as well as several other new features. It was only released in Japan. (2001)");
                startActivity(intent);
                break;

            case 6:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Nintendo Wii");
                intent.putExtra("picture", R.drawable.the_nintendo_wii_large);
                intent.putExtra("detail","The Wii featured motion controls, a new online system and slightly improved graphics. The graphical change wasn't nearly as dramatic as previous console transitions. The newer black, red, and blue models do not support Gamecube games.(2006)");
                startActivity(intent);
                break;

            case 7:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Wii Mini");
                intent.putExtra("picture",R.drawable.wiiminiconsole_large);
                intent.putExtra("detail","The Wii Mini is a smaller version of the Wii console that lacks most Wii features like internet connectivity and Gamecube backwards capability. It was released in North America, and Europe. (2012)");
                startActivity(intent);
                break;

            case 8:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Nintendo Wii-U");
                intent.putExtra("picture",R.drawable.wii_u_console_and_gamepad_large);
                intent.putExtra("detail","The Wii U features a new controller known as the Wii U GamePad, which has a 6.2\" touch screen built into it. It also boasts new 1080p HD graphics (only on the TV screen). It has a NFC chip used to scan in amiibo (2012)");
                startActivity(intent);
                break;

            case 9:
                intent = new Intent(this, DetailActivity.class);
                intent.putExtra("title","Nintendo Switch");
                intent.putExtra("picture",R.drawable.nintendo_switch_large);
                intent.putExtra("detail","The Nintendo Switch is a new hybrid of home and portable gaming systems. It features a portable console with a screen that can be docked to display on larger displays. It features modular controllers that can attach to the device itself, a grip or in each of the user's hands. (2017)");
                startActivity(intent);
                break;
        }
    }
}