package com.example.android_playlist_music;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MusicAdapter musicAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Music> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        arrayList= new ArrayList<>();

            arrayList.add(new Music(R.drawable.gangnam,"GANGNAM_STYLE","SPY"));
            arrayList.add(new Music(R.drawable.alonekshmr,"ALONE","KSHMR"));
            arrayList.add(new Music(R.drawable.backtomekshmr,"BACK_TO_ME","KSHMR"));
            arrayList.add(new Music(R.drawable.deeperkshmr,"DEEPER","KSHMR"));
            arrayList.add(new Music(R.drawable.wildcardkshmr,"WILDCARD","KSHMR"));
            arrayList.add(new Music(R.drawable.powerkshmr,"POWER","KSHMR_&_HARDWELL"));


        recyclerView=findViewById(R.id.recyclerView);
        musicAdapter=new MusicAdapter(arrayList,this);
        recyclerView.setAdapter(musicAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        GridLayoutManager layoutManager= new GridLayoutManager(MainActivity.this,1,GridLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);

    }
}