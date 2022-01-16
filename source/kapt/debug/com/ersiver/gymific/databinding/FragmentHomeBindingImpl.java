package com.ersiver.gymific.databinding;
import com.ersiver.gymific.R;
import com.ersiver.gymific.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_home, 3);
        sViewsWithIds.put(R.id.toolbar_home, 4);
        sViewsWithIds.put(R.id.scrollable_layout, 5);
        sViewsWithIds.put(R.id.subtitle_recommended, 6);
        sViewsWithIds.put(R.id.subtitle_categories, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.core.widget.NestedScrollView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[4]
            );
        this.categoryList.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.recommendedList.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.viewModel == variableId) {
            setViewModel((com.ersiver.gymific.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ersiver.gymific.ui.home.HomeViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelRecommendedUiModel((androidx.lifecycle.LiveData<com.ersiver.gymific.ui.home.HomeViewModel.RecommendedUiModel>) object, fieldId);
            case 1 :
                return onChangeViewModelCategoriesUiModel((androidx.lifecycle.LiveData<com.ersiver.gymific.ui.home.HomeViewModel.CategoryUiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelRecommendedUiModel(androidx.lifecycle.LiveData<com.ersiver.gymific.ui.home.HomeViewModel.RecommendedUiModel> ViewModelRecommendedUiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelCategoriesUiModel(androidx.lifecycle.LiveData<com.ersiver.gymific.ui.home.HomeViewModel.CategoryUiModel> ViewModelCategoriesUiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.util.List<com.ersiver.gymific.model.WorkoutCategory> viewModelCategoriesUiModelCategories = null;
        androidx.lifecycle.LiveData<com.ersiver.gymific.ui.home.HomeViewModel.RecommendedUiModel> viewModelRecommendedUiModel = null;
        androidx.lifecycle.LiveData<com.ersiver.gymific.ui.home.HomeViewModel.CategoryUiModel> viewModelCategoriesUiModel = null;
        java.util.List<com.ersiver.gymific.model.Workout> viewModelRecommendedUiModelWorkouts = null;
        com.ersiver.gymific.ui.home.HomeViewModel.CategoryUiModel viewModelCategoriesUiModelGetValue = null;
        com.ersiver.gymific.ui.home.HomeViewModel.RecommendedUiModel viewModelRecommendedUiModelGetValue = null;
        com.ersiver.gymific.ui.home.HomeViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.recommendedUiModel
                        viewModelRecommendedUiModel = viewModel.getRecommendedUiModel();
                    }
                    updateLiveDataRegistration(0, viewModelRecommendedUiModel);


                    if (viewModelRecommendedUiModel != null) {
                        // read viewModel.recommendedUiModel.getValue()
                        viewModelRecommendedUiModelGetValue = viewModelRecommendedUiModel.getValue();
                    }


                    if (viewModelRecommendedUiModelGetValue != null) {
                        // read viewModel.recommendedUiModel.getValue().workouts
                        viewModelRecommendedUiModelWorkouts = viewModelRecommendedUiModelGetValue.getWorkouts();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.categoriesUiModel
                        viewModelCategoriesUiModel = viewModel.getCategoriesUiModel();
                    }
                    updateLiveDataRegistration(1, viewModelCategoriesUiModel);


                    if (viewModelCategoriesUiModel != null) {
                        // read viewModel.categoriesUiModel.getValue()
                        viewModelCategoriesUiModelGetValue = viewModelCategoriesUiModel.getValue();
                    }


                    if (viewModelCategoriesUiModelGetValue != null) {
                        // read viewModel.categoriesUiModel.getValue().categories
                        viewModelCategoriesUiModelCategories = viewModelCategoriesUiModelGetValue.getCategories();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.ersiver.gymific.util.BindingUtilsKt.bindList(this.categoryList, viewModelCategoriesUiModelCategories);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.ersiver.gymific.util.BindingUtilsKt.bindRecyclerView(this.recommendedList, viewModelRecommendedUiModelWorkouts);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.recommendedUiModel
        flag 1 (0x2L): viewModel.categoriesUiModel
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}