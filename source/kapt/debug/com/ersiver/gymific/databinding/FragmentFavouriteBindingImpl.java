package com.ersiver.gymific.databinding;
import com.ersiver.gymific.R;
import com.ersiver.gymific.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentFavouriteBindingImpl extends FragmentFavouriteBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_favourite, 2);
        sViewsWithIds.put(R.id.toolbar_favourite, 3);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentFavouriteBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private FragmentFavouriteBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (com.google.android.material.appbar.AppBarLayout) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (androidx.appcompat.widget.Toolbar) bindings[3]
            );
        this.favouriteList.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
            setViewModel((com.ersiver.gymific.ui.favourite.FavouriteViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ersiver.gymific.ui.favourite.FavouriteViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelFavouriteUiModel((androidx.lifecycle.LiveData<com.ersiver.gymific.ui.favourite.FavouriteViewModel.FavouriteUiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelFavouriteUiModel(androidx.lifecycle.LiveData<com.ersiver.gymific.ui.favourite.FavouriteViewModel.FavouriteUiModel> ViewModelFavouriteUiModel, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        java.util.List<com.ersiver.gymific.model.Workout> viewModelFavouriteUiModelWorkouts = null;
        androidx.lifecycle.LiveData<com.ersiver.gymific.ui.favourite.FavouriteViewModel.FavouriteUiModel> viewModelFavouriteUiModel = null;
        com.ersiver.gymific.ui.favourite.FavouriteViewModel.FavouriteUiModel viewModelFavouriteUiModelGetValue = null;
        com.ersiver.gymific.ui.favourite.FavouriteViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.favouriteUiModel
                    viewModelFavouriteUiModel = viewModel.getFavouriteUiModel();
                }
                updateLiveDataRegistration(0, viewModelFavouriteUiModel);


                if (viewModelFavouriteUiModel != null) {
                    // read viewModel.favouriteUiModel.getValue()
                    viewModelFavouriteUiModelGetValue = viewModelFavouriteUiModel.getValue();
                }


                if (viewModelFavouriteUiModelGetValue != null) {
                    // read viewModel.favouriteUiModel.getValue().workouts
                    viewModelFavouriteUiModelWorkouts = viewModelFavouriteUiModelGetValue.getWorkouts();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.ersiver.gymific.util.BindingUtilsKt.bindRecyclerView(this.favouriteList, viewModelFavouriteUiModelWorkouts);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.favouriteUiModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}