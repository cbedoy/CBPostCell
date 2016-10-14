package cbedoy.cbpostcell;

import android.widget.BaseAdapter;

import java.util.List;

import cbedoy.cbpostcell.Post.Post;

/**
 * Created by bedoy on 10/13/16.
 */

public abstract class AbstractAdapter<T> extends BaseAdapter
{
    protected List<T> dataModel;

    @Override
    public int getCount() {
        return dataModel.size();
    }

    @Override
    public Object getItem(int i) {
        return dataModel.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
}
