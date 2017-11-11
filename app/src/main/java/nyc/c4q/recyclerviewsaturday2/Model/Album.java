package nyc.c4q.recyclerviewsaturday2.Model;

import android.graphics.drawable.Drawable;

/**
 * Created by c4q on 11/11/17.
 */

public class Album {
    String title;
    String year;
    String label;
    Drawable drawable;
    Drawable drawable2;

    public Album(String title, String year, String label, Drawable drawable, Drawable drawable2) {
        this.title = title;
        this.year = year;
        this.label = label;
        this.drawable = drawable;
        this.drawable2 = drawable2;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public String getLabel() {
        return label;
    }

    public Drawable getDrawable(){
        return drawable;
    }

    public void setDrawable(Drawable draw){
        drawable = draw;
    }

    public Drawable getDrawable2(){
        return drawable2;
    }
    public void setDrawable2(Drawable draw){
        drawable2 = draw;
    }
}
