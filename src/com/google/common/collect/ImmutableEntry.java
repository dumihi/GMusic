package com.google.common.collect;

import java.io.Serializable;

class ImmutableEntry<K, V> extends AbstractMapEntry<K, V>
  implements Serializable
{
  private static final long serialVersionUID;
  private final K key;
  private final V value;

  ImmutableEntry(K paramK, V paramV)
  {
    this.key = paramK;
    this.value = paramV;
  }

  public K getKey()
  {
    return this.key;
  }

  public V getValue()
  {
    return this.value;
  }

  public final V setValue(V paramV)
  {
    throw new UnsupportedOperationException();
  }
}

/* Location:           /home/vovs/Downloads/apk_decompile/tmp/code_dec/com.google.android.music-2/classes_dex2jar.jar
 * Qualified Name:     com.google.common.collect.ImmutableEntry
 * JD-Core Version:    0.6.2
 */