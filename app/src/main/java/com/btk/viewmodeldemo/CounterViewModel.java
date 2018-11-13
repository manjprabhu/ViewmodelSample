package com.btk.viewmodeldemo;

import android.arch.lifecycle.ViewModel;

public class CounterViewModel extends ViewModel {

  private int count  = 0;

  public void setCount(int count) {
      this.count = count;
  }

  public int getCount() {
      return this.count;
  }
}
