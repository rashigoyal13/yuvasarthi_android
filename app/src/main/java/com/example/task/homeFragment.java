package com.example.task;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link homeFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class homeFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    //public  ActionBarDrawerToggle actionBarDrawerToggle;

    public homeFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment homeFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static homeFragment newInstance(String param1, String param2) {
        homeFragment fragment = new homeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        //image slider
        ImageSlider imageSlider = v.findViewById(R.id.imgslider);
        ArrayList<SlideModel> slideModels = new ArrayList<>();
        slideModels.add(new SlideModel(R.drawable.imgsl1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.imgsl2, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.imgsl3, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.imgsl4, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.imgsl5, ScaleTypes.FIT));
        imageSlider.setImageList(slideModels, ScaleTypes.FIT);
        return (v);

    }
        //option menu


   /* @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        int item_id = item.getItemId();
        switch (item_id) {
            case R.id.o1:
                Toast.makeText(getActivity(), "option 1 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sh:
                Toast.makeText(getActivity(), "option 2 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.help:
                Toast.makeText(getActivity(), "option 3 selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.contactus:
                Intent i1 = new Intent(getContext(), contactus.class);
                startActivity(i1);
                return true;
            case R.id.o3:
                BottomSheetFragment bottom_sheet = new BottomSheetFragment();
                bottom_sheet.show(getFragmentManager(), bottom_sheet.getTag());


                return true;
            case R.id.o4:
                Intent i = new Intent(getContext(), list_view.class);
                startActivity(i);
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        inflater.inflate(R.menu.optionlistmenu,menu);

    }*/


}