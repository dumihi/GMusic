package android.support.v4.view;

import android.view.VelocityTracker;

class VelocityTrackerCompatHoneycomb
{
  public static float getXVelocity(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return paramVelocityTracker.getXVelocity(paramInt);
  }

  public static float getYVelocity(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return paramVelocityTracker.getYVelocity(paramInt);
  }
}

/* Location:           /home/vovs/Downloads/apk_decompile/tmp/code_dec/com.google.android.music-2/classes_dex2jar.jar
 * Qualified Name:     android.support.v4.view.VelocityTrackerCompatHoneycomb
 * JD-Core Version:    0.6.2
 */