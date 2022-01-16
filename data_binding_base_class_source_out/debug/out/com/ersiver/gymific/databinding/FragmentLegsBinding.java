// Generated by data binding compiler. Do not edit!
package com.ersiver.gymific.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ersiver.gymific.R;
import com.ersiver.gymific.ui.legs.LegsViewModel;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentLegsBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView legList;

  @Bindable
  protected LegsViewModel mViewModel;

  protected FragmentLegsBinding(Object _bindingComponent, View _root, int _localFieldCount,
      RecyclerView legList) {
    super(_bindingComponent, _root, _localFieldCount);
    this.legList = legList;
  }

  public abstract void setViewModel(@Nullable LegsViewModel viewModel);

  @Nullable
  public LegsViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentLegsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_legs, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLegsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentLegsBinding>inflateInternal(inflater, R.layout.fragment_legs, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentLegsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_legs, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentLegsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentLegsBinding>inflateInternal(inflater, R.layout.fragment_legs, null, false, component);
  }

  public static FragmentLegsBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static FragmentLegsBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentLegsBinding)bind(component, view, R.layout.fragment_legs);
  }
}
