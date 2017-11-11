package nyc.c4q.recyclerviewsaturday2.View;

import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import nyc.c4q.recyclerviewsaturday2.Model.Album;
import nyc.c4q.recyclerviewsaturday2.R;

/**
 * Created by c4q on 11/11/17.
 */

public class AlbumViewHolder extends RecyclerView.ViewHolder{


   @BindView(R.id.album_title) TextView title;
   @BindView(R.id.album_year) TextView year;
   @BindView(R.id.album_label) TextView label;
   @BindView(R.id.album_art)  ImageView art;
   @BindView(R.id.alt_art_button) Button changeArt;

    public AlbumViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }

    public void Bind(final Album album){
        title.setText("Album title: "+ album.getTitle());
        year.setText("Year released: "+ album.getYear());
        label.setText("Label: "+album.getLabel());
        art.setImageDrawable(album.getDrawable());

        changeArt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable temp = album.getDrawable();
                Drawable temp2 = album.getDrawable2();
                art.setImageDrawable(album.getDrawable2());
                album.setDrawable2(temp);
                album.setDrawable(temp2);
            }
        });

        }
    }



