package android.support.v7.internal.widget;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

class SpinnerICS$DropDownAdapter
  implements ListAdapter, SpinnerAdapter
{
  private SpinnerAdapter mAdapter;
  private ListAdapter mListAdapter;

  public SpinnerICS$DropDownAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    this.mAdapter = paramSpinnerAdapter;
    if (!(paramSpinnerAdapter instanceof SpinnerAdapter))
      return;
    ListAdapter localListAdapter = (SpinnerAdapter)paramSpinnerAdapter;
    this.mListAdapter = localListAdapter;
  }

  public boolean areAllItemsEnabled()
  {
    ListAdapter localListAdapter = this.mListAdapter;
    if (localListAdapter != null);
    for (boolean bool = localListAdapter.areAllItemsEnabled(); ; bool = true)
      return bool;
  }

  public int getCount()
  {
    if (this.mAdapter == null);
    for (int i = 0; ; i = this.mAdapter.getCount())
      return i;
  }

  public View getDropDownView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    if (this.mAdapter == null);
    for (View localView = null; ; localView = this.mAdapter.getDropDownView(paramInt, paramView, paramViewGroup))
      return localView;
  }

  public Object getItem(int paramInt)
  {
    if (this.mAdapter == null);
    for (Object localObject = null; ; localObject = this.mAdapter.getItem(paramInt))
      return localObject;
  }

  public long getItemId(int paramInt)
  {
    if (this.mAdapter == null);
    for (long l = 65535L; ; l = this.mAdapter.getItemId(paramInt))
      return l;
  }

  public int getItemViewType(int paramInt)
  {
    return 0;
  }

  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    return getDropDownView(paramInt, paramView, paramViewGroup);
  }

  public int getViewTypeCount()
  {
    return 1;
  }

  public boolean hasStableIds()
  {
    if ((this.mAdapter != null) && (this.mAdapter.hasStableIds()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isEmpty()
  {
    if (getCount() == 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean isEnabled(int paramInt)
  {
    ListAdapter localListAdapter = this.mListAdapter;
    if (localListAdapter != null);
    for (boolean bool = localListAdapter.isEnabled(paramInt); ; bool = true)
      return bool;
  }

  public void registerDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.mAdapter == null)
      return;
    this.mAdapter.registerDataSetObserver(paramDataSetObserver);
  }

  public void unregisterDataSetObserver(DataSetObserver paramDataSetObserver)
  {
    if (this.mAdapter == null)
      return;
    this.mAdapter.unregisterDataSetObserver(paramDataSetObserver);
  }
}

/* Location:           /home/vovs/Downloads/apk_decompile/tmp/code_dec/com.google.android.music-2/classes_dex2jar.jar
 * Qualified Name:     android.support.v7.internal.widget.SpinnerICS.DropDownAdapter
 * JD-Core Version:    0.6.2
 */