package com.ersiver.gymific.databinding;
import com.ersiver.gymific.R;
import com.ersiver.gymific.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentCardioBindingImpl extends FragmentCardioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentCardioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 2, sIncludes, sViewsWithIds));
    }
    private FragmentCardioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            );
        this.cardioList.setTag(null);
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
            setViewModel((com.ersiver.gymific.ui.cardio.CardioViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ersiver.gymific.ui.cardio.CardioViewModel ViewModel) {
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
                return onChangeViewModelCardioUiModel((androidx.lifecycle.LiveData<com.ersiver.gymific.ui.cardio.CardioViewModel.CardioUiModel>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelCardioUiModel(androidx.lifecycle.LiveData<com.ersiver.gymific.ui.cardio.CardioViewModel.CardioUiModel> ViewModelCardioUiModel, int fieldId) {
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
        androidx.lifecycle.LiveData<com.ersiver.gymific.ui.cardio.CardioViewModel.CardioUiModel> viewModelCardioUiModel = null;
        com.ersiver.gymific.ui.cardio.CardioViewModel.CardioUiModel viewModelCardioUiModelGetValue = null;
        com.ersiver.gymific.ui.cardio.CardioViewModel viewModel = mViewModel;
        java.util.List<com.ersiver.gymific.model.Workout> viewModelCardioUiModelWorkouts = null;

        if ((dirtyFlags & 0x7L) != 0) {



                if (viewModel != null) {
                    // read viewModel.cardioUiModel
                    viewModelCardioUiModel = viewModel.getCardioUiModel();
                }
                updateLiveDataRegistration(0, viewModelCardioUiModel);


                if (viewModelCardioUiModel != null) {
                    // read viewModel.cardioUiModel.getValue()
                    viewModelCardioUiModelGetValue = viewModelCardioUiModel.getValue();
                }


                if (viewModelCardioUiModelGetValue != null) {
                    // read viewModel.cardioUiModel.getValue().workouts
                    viewModelCardioUiModelWorkouts = viewModelCardioUiModelGetValue.getWorkouts();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x7L) != 0) {
            // api target 1

            com.ersiver.gymific.util.BindingUtilsKt.bindRecyclerView(this.cardioList, viewModelCardioUiModelWorkouts);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.cardioUiModel
        flag 1 (0x2L): viewModel
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}