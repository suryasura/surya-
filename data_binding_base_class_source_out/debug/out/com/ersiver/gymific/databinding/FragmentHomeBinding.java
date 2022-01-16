// Generated by data binding compiler. Do not edit!
package com.ersiver.gymific.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.ersiver.gymific.R;
import com.ersiver.gymific.ui.home.HomeViewModel;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class FragmentHomeBinding extends ViewDataBinding {
  @NonNull
  public final AppBarLayout appBarHome;

  @NonNull
  public final RecyclerView categoryList;

  @NonNull
  public final RecyclerView recommendedList;

  @NonNull
  public final NestedScrollView scrollableLayout;

  @NonNull
  public final TextView subtitleCategories;

  @NonNull
  public final TextView subtitleRecommended;

  @NonNull
  public final Toolbar toolbarHome;

  @Bindable
  protected HomeViewModel mViewModel;

  protected FragmentHomeBinding(Object _bindingComponent, View _root, int _localFieldCount,
      AppBarLayout appBarHome, RecyclerView categoryList, RecyclerView recommendedList,
      NestedScrollView scrollableLayout, TextView subtitleCategories, TextView subtitleRecommended,
      Toolbar toolbarHome) {
    super(_bindingComponent, _root, _localFieldCount);
    this.appBarHome = appBarHome;
    this.categoryList = categoryList;
    this.recommendedList = recommendedList;
    this.scrollableLayout = scrollableLayout;
    this.subtitleCategories = subtitleCategories;
    this.subtitleRecommended = subtitleRecommended;
    this.toolbarHome = toolbarHome;
  }

  public abstract void setViewModel(@Nullable HomeViewModel viewModel);

  @Nullable
  public HomeViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.fragment_home, null, false, component)
   */
  @NonNull
  @Deprecated
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<FragmentHomeBinding>inflateInternal(inflater, R.layout.fragment_home, null, false, component);
  }

  public static FragmentHomeBinding bind(@NonNull View view) {
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
  public static FragmentHomeBinding bind(@NonNull View view, @Nullable Object component) {
    return (FragmentHomeBinding)bind(component, view, R.layout.fragment_home);
  }
}