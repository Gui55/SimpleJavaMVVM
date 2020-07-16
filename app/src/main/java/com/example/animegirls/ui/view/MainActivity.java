package com.example.animegirls.ui.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;

import com.example.animegirls.R;
import com.example.animegirls.services.model.AnimeGirl;
import com.example.animegirls.viewmodel.MainViewModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    MainViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);

        viewModel = new ViewModelProvider(this).get(MainViewModel.class);

        viewModel.getRepositoryGirls().observe(this, new Observer<ArrayList<AnimeGirl>>() {
            @Override
            public void onChanged(ArrayList<AnimeGirl> animeGirls) {

                String textVariable = "";

                for(int i=0; i<animeGirls.size();i++){
                    textVariable += animeGirls.get(i).getName()+" -> "+animeGirls.get(i).getAnime()+"\n";
                }

                textView.setText(textVariable);
            }
        });
    }
}