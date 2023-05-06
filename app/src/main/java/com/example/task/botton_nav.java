package com.example.task;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;


//import com.example.task.databinding.ActivityMainBinding;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;

import java.io.IOException;


public class botton_nav extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener{
    BottomNavigationView bottomNavigationView;
    homeFragment hf = new homeFragment();
    MerchantFragment prof = new MerchantFragment();
    ServicesFragment nf = new ServicesFragment();
    faq_Fragment setf = new faq_Fragment();
    private DrawerLayout drawerLayout;
    ActionBarDrawerToggle actionBarDrawerToggle;





  /*  @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item1) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item1)) {
            return true;
        }
        return super.onOptionsItemSelected(item1);
    }*/

    //ActivityMainBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botton_nav);


        //bottom Navigation
        bottomNavigationView = findViewById(R.id.bottomnavigation);
        //profile = (ImageView) findViewById(R.id.profile_image);


        getSupportFragmentManager().beginTransaction().replace(R.id.rel, hf).commit();

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home:
                        getSupportFragmentManager().beginTransaction().replace(R.id.rel, hf).commit();
                        return true;

                    case R.id.pf:
                        getSupportFragmentManager().beginTransaction().replace(R.id.rel, prof).commit();
                        return true;
                    case R.id.noti:
                        getSupportFragmentManager().beginTransaction().replace(R.id.rel, nf).commit();
                        return true;
                    case R.id.set:
                        getSupportFragmentManager().beginTransaction().replace(R.id.rel, setf).commit();
                        return true;


                }
                return false;
            }
        });

        //Navigation drawer


        drawerLayout = findViewById(R.id.dl);
        NavigationView navigationView = findViewById(R.id.navdrawer);
        navigationView.setNavigationItemSelectedListener(this);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_baseline_person_pin_30);











       /* navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item1) {
                switch (item1.getItemId()) {
                    case R.id.pn: {
                        Toast.makeText(botton_nav.this, "account details", Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
                return false;
            }*/


        // Setup drawer view
        // setupDrawerContent(navigationView);


    /*private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        selectDrawerItem(menuItem);
                        return true;
                    }
                });
    }

    public void selectDrawerItem(MenuItem menuItem) {
        // Create a new fragment and specify the fragment to show based on nav item clicked
        Fragment fragment = null;
        Class fragmentClass;
        switch(menuItem.getItemId()) {
            case R.id.pn:
                fragmentClass = acFragment.class;
                break;

            default:
                fragmentClass = acFragment.class;
        }

        try {
            fragment = (Fragment) fragmentClass.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Insert the fragment by replacing any existing fragment
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.flContent, fragment).commit();

        // Highlight the selected item has been done by NavigationView
        menuItem.setChecked(true);
        // Set action bar title
        setTitle(menuItem.getTitle());
        // Close the navigation drawer
        drawerLayout.closeDrawers();
    }*/


        // case R.id.blog:
        //{
        //Intent i=new Intent(getApplicationContext(),notifiFragment.class);
        // startActivity(i);


        //setimagecode
      /*profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGallery();
            }
        });




    }
    private void openGallery() {
        Intent pickImage=new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
        //noinspection deprecation
        startActivityForResult(pickImage,REQ);

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==REQ && resultCode==RESULT_OK){
            Uri uri=data.getData();
            try {
                bitmap=MediaStore.Images.Media.getBitmap(getContentResolver(),uri);
            } catch (IOException e) {
                e.printStackTrace();
            }
            profile.setImageBitmap(bitmap);
        }
    }
*/



    /*@Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }
    */
    }

    //option menu


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.optionlistmenu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        int item_id=item.getItemId();
        final Intent i;
        switch (item_id) {
            case R.id.o1:
                i = new Intent(getApplicationContext(), settings.class);
                startActivity(i);
                return true;
            case R.id.sh:
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"DownLoad This Application \n\n https://play.google.com");
                startActivity(Intent.createChooser(intent,"Share Using"));
                return true;
            case R.id.help:
                i = new Intent(getApplicationContext(), aboutus.class);
                startActivity(i);
                return true;
            case R.id.contactus:
                i= new Intent(getApplicationContext(), contactus.class);
                startActivity(i);
                return true;
            case R.id.o3:
                BottomSheetFragment bottom_sheet=new BottomSheetFragment();
                bottom_sheet.show(getSupportFragmentManager(),bottom_sheet.getTag());


                return true;
            case R.id.o4:
                i = new Intent(getApplicationContext(), list_view.class);
                startActivity(i);
                return true;

            default:
            return super.onOptionsItemSelected(item);
        }
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        final Intent i1;
        switch (item.getItemId())

        {
            case R.id.pn:
                Toast.makeText(this, "account detail", Toast.LENGTH_SHORT).show();
                break;
            case R.id.blog:
                Toast.makeText(this, "blog", Toast.LENGTH_SHORT).show();
                break;
            case R.id.event:
                Toast.makeText(this, "event", Toast.LENGTH_SHORT).show();
                break;
            case R.id.job:
                Toast.makeText(this, "job", Toast.LENGTH_SHORT).show();
                break;
            case R.id.news:
                Toast.makeText(this, "news", Toast.LENGTH_SHORT).show();
                break;
            case R.id.pp:
                i1=new Intent(getApplicationContext(),privacy_policy.class);
                startActivity(i1);
                break;
             case R.id.set:
                 i1=new Intent(getApplicationContext(),settings.class);
                 startActivity(i1);
                 break;
            case R.id.shr:
                Intent intent=new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,"DownLoad This Application \n\n https://play.google.com");
                startActivity(Intent.createChooser(intent,"Share Using"));
                return true;
            case R.id.lo:
                i1= new Intent(botton_nav.this, MainActivity.class);
                startActivity(i1);
                finish();
                        break;

        }

        return true;
    }
    @Override
    public void onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }

    }
}
