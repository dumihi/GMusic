package com.google.android.music.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

public class GenresExploreFragment extends MediaListFragment
{
  static final String[] PROJECTION = arrayOfString;
  private int mGenreLevel;
  private String mParentGenre;

  static
  {
    String[] arrayOfString = new String[4];
    arrayOfString[0] = "_id";
    arrayOfString[1] = "genreServerId";
    arrayOfString[2] = "name";
    arrayOfString[3] = "subgenreCount";
  }

  public static Bundle buildArguments(int paramInt)
  {
    Bundle localBundle = new Bundle();
    localBundle.putInt("level", paramInt);
    return localBundle;
  }

  protected void initEmptyScreen()
  {
    super.initEmptyScreen();
    setEmptyScreenText(2131231365);
    setEmptyImageView(2130837707);
  }

  MediaListCursorAdapter newAsyncCursorAdapter(Cursor paramCursor)
  {
    return new GenresExploreAdapter(this, paramCursor, null);
  }

  MediaListCursorAdapter newLoaderCursorAdapter()
  {
    return new GenresExploreAdapter(this, null);
  }

  public void onActivityCreated(Bundle paramBundle)
  {
    Bundle localBundle = getArguments();
    if (localBundle == null)
      throw new IllegalArgumentException("Level of genres should be provided to explore genres");
    String str1 = localBundle.getString("nautilusId");
    this.mParentGenre = str1;
    int i = localBundle.getInt("level");
    this.mGenreLevel = i;
    if (!isInitialized())
    {
      String str2 = this.mParentGenre;
      GenreExploreList localGenreExploreList = new GenreExploreList(str2);
      String[] arrayOfString = PROJECTION;
      init(localGenreExploreList, arrayOfString, false);
    }
    super.onActivityCreated(paramBundle);
  }

  public void onListItemClick(ListView paramListView, View paramView, int paramInt, long paramLong)
  {
    super.onListItemClick(paramListView, paramView, paramInt, paramLong);
    FragmentActivity localFragmentActivity = getActivity();
    Bundle localBundle = (Bundle)paramView.getTag();
    if (this.mGenreLevel == 0)
    {
      String str1 = localBundle.getString("nautilusId");
      String str2 = localBundle.getString("name");
      int i = localBundle.getInt("subgenreCount");
      Intent localIntent1 = GenresExploreActivity.buildStartIntent(localFragmentActivity, str1, str2, i, 1);
      localFragmentActivity.startActivity(localIntent1);
    }
    while (true)
    {
      localFragmentActivity.overridePendingTransition(0, 0);
      return;
      if (this.mGenreLevel != 1)
        break;
      String str3 = localBundle.getString("nautilusId");
      String str4 = localBundle.getString("name");
      String str5 = this.mParentGenre;
      Intent localIntent2 = SubGenresExploreActivity.buildStartIntent(localFragmentActivity, str3, str4, str5);
      localFragmentActivity.startActivity(localIntent2);
    }
    throw new IllegalArgumentException("Genres Explore only have two levels.");
  }

  public void onViewCreated(View paramView, Bundle paramBundle)
  {
    super.onViewCreated(paramView, paramBundle);
    getListView().setFastScrollEnabled(false);
  }

  final class GenresExploreAdapter extends MediaListCursorAdapter
  {
    private GenresExploreAdapter(GenresExploreFragment arg2)
    {
      super(17367043);
    }

    private GenresExploreAdapter(GenresExploreFragment paramCursor, Cursor arg3)
    {
      super(17367043, localCursor);
    }

    protected void bindViewToLoadingItem(View paramView, Context paramContext)
    {
      ((TextView)paramView.findViewById(16908308)).setText("");
    }

    protected void bindViewToMediaListItem(View paramView, Context paramContext, Cursor paramCursor, long paramLong)
    {
      String str1 = paramCursor.getString(1);
      String str2 = paramCursor.getString(2);
      int i = paramCursor.getInt(3);
      Bundle localBundle = new Bundle();
      localBundle.putString("nautilusId", str1);
      localBundle.putString("name", str2);
      localBundle.putInt("subgenreCount", i);
      paramView.setTag(localBundle);
      ((TextView)paramView.findViewById(16908308)).setText(str2);
    }

    public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      return super.getView(paramInt, paramView, paramViewGroup);
    }
  }
}

/* Location:           /home/vovs/Downloads/apk_decompile/tmp/code_dec/com.google.android.music-2/classes_dex2jar.jar
 * Qualified Name:     com.google.android.music.ui.GenresExploreFragment
 * JD-Core Version:    0.6.2
 */