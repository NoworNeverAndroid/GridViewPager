package noworneverandroid.com.gridviewpager;

import android.content.Context;
import android.graphics.Color;
import android.support.wearable.view.GridPagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * Created by now or never android.
 */
public class ImageAdapter extends GridPagerAdapter {


    Integer[][] carImageIDs = {
            {R.drawable.coche00, R.drawable.coche01, R.drawable.coche02,},
            {R.drawable.coche11, R.drawable.coche12, R.drawable.coche13,},
            {R.drawable.coche21, R.drawable.coche22, R.drawable.coche23,}
    };



        final Context mContext;

        public ImageAdapter( Context mContext) {
            this.mContext = mContext;
        }

        @Override
        public int getRowCount() {
            return 3;
        }

        @Override
        public int getColumnCount(int i) {
            return 3;
        }

        @Override
        public int getCurrentColumnForRow(int row, int currentColumn) {
            return currentColumn;
        }

        @Override
        public Object instantiateItem(ViewGroup viewGroup, int row, int col) {
            ImageView imageView;
            imageView = new ImageView(mContext);
            imageView.setImageResource(carImageIDs[row][col]);
            imageView.setBackgroundColor(Color.rgb(236, 238, 242));
            viewGroup.addView(imageView);

            return imageView;
        }



        @Override
        public void destroyItem(ViewGroup viewGroup, int i, int i1, Object o) {
            viewGroup.removeView((View) o);
        }

        @Override
        public boolean isViewFromObject(View view, Object o) {
            return view.equals(o);
        }
    }

