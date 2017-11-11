package nyc.c4q.recyclerviewsaturday2.Controller;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import nyc.c4q.recyclerviewsaturday2.Model.Album;
import nyc.c4q.recyclerviewsaturday2.R;
import nyc.c4q.recyclerviewsaturday2.View.AlbumViewHolder;

/**
 * Created by c4q on 11/11/17.
 */



public class AlbumAdapter extends RecyclerView.Adapter<AlbumViewHolder> {

   private List<Album> albumList;

   public AlbumAdapter(List<Album> albumList){
       this.albumList = albumList;
   }

    @Override
    public AlbumViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
       View childView = LayoutInflater.from(parent.getContext()).inflate(R.layout.album_itemview, parent,false);
        return new AlbumViewHolder(childView);
    }

    @Override
    public void onBindViewHolder(AlbumViewHolder holder, int position) {
       Album album = albumList.get(position);
       holder.Bind(album);
    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

}
