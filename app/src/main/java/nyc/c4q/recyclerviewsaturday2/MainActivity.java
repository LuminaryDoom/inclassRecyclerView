package nyc.c4q.recyclerviewsaturday2;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import static butterknife.ButterKnife.findById;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import nyc.c4q.recyclerviewsaturday2.Controller.AlbumAdapter;
import nyc.c4q.recyclerviewsaturday2.Model.Album;

public class MainActivity extends AppCompatActivity {


    @BindView(R.id.album_recycler_view) RecyclerView albumRecyclerView;
    @BindDrawable(R.drawable.views_cover) Drawable views;
    @BindDrawable(R.drawable.born_sinner) Drawable bornsinner;
    @BindDrawable(R.drawable.blond) Drawable Blonde;
    @BindDrawable(R.drawable.starboy) Drawable starboy;
    @BindDrawable(R.drawable.views_alt) Drawable viewsAlt;
    @BindDrawable(R.drawable.blond_alt) Drawable blond_alt;
    @BindDrawable(R.drawable.butterfly) Drawable pimpButterfly;
    @BindDrawable(R.drawable.butterfly_alt) Drawable ButterFlyalt;
    @BindDrawable(R.drawable.starboy_alt) Drawable startboyAlt;
    @BindDrawable(R.drawable.born_deluxe) Drawable bornDeluxe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        List<Album> albums = new ArrayList<>();

        albums.add(new Album("Views","2016","Young Money",views ,viewsAlt));
        albums.add(new Album("Born Sinner","2013","Roc Nation", bornsinner, bornDeluxe ));
        albums.add(new Album("To Pimp a Butterfly","2015","Top Dawg Records", pimpButterfly , ButterFlyalt));
        albums.add(new Album("StarBoy","2016","Columbia Records", starboy ,startboyAlt ));
        albums.add(new Album("Blonde","2016","Boys Don't Cry", Blonde ,blond_alt));


        AlbumAdapter albumAdapter = new AlbumAdapter(albums);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false);
        albumRecyclerView.setAdapter(albumAdapter);
        albumRecyclerView.setLayoutManager(linearLayoutManager);
    }




}
