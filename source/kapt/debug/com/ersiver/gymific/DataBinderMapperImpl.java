package com.ersiver.gymific;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.ersiver.gymific.databinding.ActivityMainBindingImpl;
import com.ersiver.gymific.databinding.CategoryViewItemBindingImpl;
import com.ersiver.gymific.databinding.ContentMainBindingImpl;
import com.ersiver.gymific.databinding.FragmentCardioBindingImpl;
import com.ersiver.gymific.databinding.FragmentDetailBindingImpl;
import com.ersiver.gymific.databinding.FragmentFavouriteBindingImpl;
import com.ersiver.gymific.databinding.FragmentHomeBindingImpl;
import com.ersiver.gymific.databinding.FragmentLegsBindingImpl;
import com.ersiver.gymific.databinding.FragmentViewPagerBindingImpl;
import com.ersiver.gymific.databinding.FramgentArmsBindingImpl;
import com.ersiver.gymific.databinding.WorkoutGridItemBindingImpl;
import com.ersiver.gymific.databinding.WorkoutViewItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.annotation.Generated;

@Generated("Android Data Binding")
public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_CATEGORYVIEWITEM = 2;

  private static final int LAYOUT_CONTENTMAIN = 3;

  private static final int LAYOUT_FRAGMENTCARDIO = 4;

  private static final int LAYOUT_FRAGMENTDETAIL = 5;

  private static final int LAYOUT_FRAGMENTFAVOURITE = 6;

  private static final int LAYOUT_FRAGMENTHOME = 7;

  private static final int LAYOUT_FRAGMENTLEGS = 8;

  private static final int LAYOUT_FRAGMENTVIEWPAGER = 9;

  private static final int LAYOUT_FRAMGENTARMS = 10;

  private static final int LAYOUT_WORKOUTGRIDITEM = 11;

  private static final int LAYOUT_WORKOUTVIEWITEM = 12;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(12);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.category_view_item, LAYOUT_CATEGORYVIEWITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.content_main, LAYOUT_CONTENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.fragment_cardio, LAYOUT_FRAGMENTCARDIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.fragment_detail, LAYOUT_FRAGMENTDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.fragment_favourite, LAYOUT_FRAGMENTFAVOURITE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.fragment_legs, LAYOUT_FRAGMENTLEGS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.fragment_view_pager, LAYOUT_FRAGMENTVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.framgent_arms, LAYOUT_FRAMGENTARMS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.workout_grid_item, LAYOUT_WORKOUTGRIDITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.ersiver.gymific.R.layout.workout_view_item, LAYOUT_WORKOUTVIEWITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_CATEGORYVIEWITEM: {
          if ("layout/category_view_item_0".equals(tag)) {
            return new CategoryViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for category_view_item is invalid. Received: " + tag);
        }
        case  LAYOUT_CONTENTMAIN: {
          if ("layout/content_main_0".equals(tag)) {
            return new ContentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for content_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTCARDIO: {
          if ("layout/fragment_cardio_0".equals(tag)) {
            return new FragmentCardioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_cardio is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAIL: {
          if ("layout/fragment_detail_0".equals(tag)) {
            return new FragmentDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTFAVOURITE: {
          if ("layout/fragment_favourite_0".equals(tag)) {
            return new FragmentFavouriteBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_favourite is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLEGS: {
          if ("layout/fragment_legs_0".equals(tag)) {
            return new FragmentLegsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_legs is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTVIEWPAGER: {
          if ("layout/fragment_view_pager_0".equals(tag)) {
            return new FragmentViewPagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_view_pager is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAMGENTARMS: {
          if ("layout/framgent_arms_0".equals(tag)) {
            return new FramgentArmsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for framgent_arms is invalid. Received: " + tag);
        }
        case  LAYOUT_WORKOUTGRIDITEM: {
          if ("layout/workout_grid_item_0".equals(tag)) {
            return new WorkoutGridItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for workout_grid_item is invalid. Received: " + tag);
        }
        case  LAYOUT_WORKOUTVIEWITEM: {
          if ("layout/workout_view_item_0".equals(tag)) {
            return new WorkoutViewItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for workout_view_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(5);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "category");
      sKeys.put(2, "clickListener");
      sKeys.put(3, "viewModel");
      sKeys.put(4, "workout");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(12);

    static {
      sKeys.put("layout/activity_main_0", com.ersiver.gymific.R.layout.activity_main);
      sKeys.put("layout/category_view_item_0", com.ersiver.gymific.R.layout.category_view_item);
      sKeys.put("layout/content_main_0", com.ersiver.gymific.R.layout.content_main);
      sKeys.put("layout/fragment_cardio_0", com.ersiver.gymific.R.layout.fragment_cardio);
      sKeys.put("layout/fragment_detail_0", com.ersiver.gymific.R.layout.fragment_detail);
      sKeys.put("layout/fragment_favourite_0", com.ersiver.gymific.R.layout.fragment_favourite);
      sKeys.put("layout/fragment_home_0", com.ersiver.gymific.R.layout.fragment_home);
      sKeys.put("layout/fragment_legs_0", com.ersiver.gymific.R.layout.fragment_legs);
      sKeys.put("layout/fragment_view_pager_0", com.ersiver.gymific.R.layout.fragment_view_pager);
      sKeys.put("layout/framgent_arms_0", com.ersiver.gymific.R.layout.framgent_arms);
      sKeys.put("layout/workout_grid_item_0", com.ersiver.gymific.R.layout.workout_grid_item);
      sKeys.put("layout/workout_view_item_0", com.ersiver.gymific.R.layout.workout_view_item);
    }
  }
}
