package com.ersiver.gymific.databinding;
import com.ersiver.gymific.R;
import com.ersiver.gymific.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class FragmentDetailBindingImpl extends FragmentDetailBinding implements com.ersiver.gymific.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_detail, 7);
        sViewsWithIds.put(R.id.overview_layout, 8);
        sViewsWithIds.put(R.id.workout_progress, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FragmentDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (com.google.android.material.appbar.AppBarLayout) bindings[7]
            , (androidx.core.widget.NestedScrollView) bindings[8]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.ImageButton) bindings[4]
            , (android.widget.ImageButton) bindings[6]
            , (androidx.appcompat.widget.Toolbar) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.TextView) bindings[3]
            , (com.ersiver.gymific.ui.detail.WorkoutProgressBar) bindings[9]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.pauseButton.setTag(null);
        this.playButton.setTag(null);
        this.stopButton.setTag(null);
        this.toolbarDetail.setTag(null);
        this.workoutImage.setTag(null);
        this.workoutInstruction.setTag(null);
        setRootTag(root);
        // listeners
        mCallback3 = new com.ersiver.gymific.generated.callback.OnClickListener(this, 3);
        mCallback1 = new com.ersiver.gymific.generated.callback.OnClickListener(this, 1);
        mCallback2 = new com.ersiver.gymific.generated.callback.OnClickListener(this, 2);
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
            setViewModel((com.ersiver.gymific.ui.detail.DetailViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.ersiver.gymific.ui.detail.DetailViewModel ViewModel) {
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
                return onChangeViewModelWorkout((androidx.lifecycle.LiveData<com.ersiver.gymific.model.Workout>) object, fieldId);
            case 1 :
                return onChangeViewModelTimerStatus((androidx.lifecycle.LiveData<com.ersiver.gymific.ui.detail.TimerStatus>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelWorkout(androidx.lifecycle.LiveData<com.ersiver.gymific.model.Workout> ViewModelWorkout, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelTimerStatus(androidx.lifecycle.LiveData<com.ersiver.gymific.ui.detail.TimerStatus> ViewModelTimerStatus, int fieldId) {
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
        com.ersiver.gymific.model.Workout viewModelWorkoutGetValue = null;
        androidx.lifecycle.LiveData<com.ersiver.gymific.model.Workout> viewModelWorkout = null;
        java.lang.String viewModelWorkoutIconCode = null;
        java.lang.String viewModelWorkoutInstruction = null;
        androidx.lifecycle.LiveData<com.ersiver.gymific.ui.detail.TimerStatus> viewModelTimerStatus = null;
        com.ersiver.gymific.ui.detail.TimerStatus viewModelTimerStatusGetValue = null;
        java.lang.String viewModelWorkoutTitle = null;
        com.ersiver.gymific.ui.detail.DetailViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.workout
                        viewModelWorkout = viewModel.getWorkout();
                    }
                    updateLiveDataRegistration(0, viewModelWorkout);


                    if (viewModelWorkout != null) {
                        // read viewModel.workout.getValue()
                        viewModelWorkoutGetValue = viewModelWorkout.getValue();
                    }


                    if (viewModelWorkoutGetValue != null) {
                        // read viewModel.workout.getValue().iconCode
                        viewModelWorkoutIconCode = viewModelWorkoutGetValue.getIconCode();
                        // read viewModel.workout.getValue().instruction
                        viewModelWorkoutInstruction = viewModelWorkoutGetValue.getInstruction();
                        // read viewModel.workout.getValue().title
                        viewModelWorkoutTitle = viewModelWorkoutGetValue.getTitle();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.timerStatus
                        viewModelTimerStatus = viewModel.getTimerStatus();
                    }
                    updateLiveDataRegistration(1, viewModelTimerStatus);


                    if (viewModelTimerStatus != null) {
                        // read viewModel.timerStatus.getValue()
                        viewModelTimerStatusGetValue = viewModelTimerStatus.getValue();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.ersiver.gymific.util.BindingUtilsKt.pauseButtonBehaviour(this.pauseButton, viewModelTimerStatusGetValue);
            com.ersiver.gymific.util.BindingUtilsKt.playButtonBehaviour(this.playButton, viewModelTimerStatusGetValue);
            com.ersiver.gymific.util.BindingUtilsKt.stopButtonBehaviour(this.stopButton, viewModelTimerStatusGetValue);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.pauseButton.setOnClickListener(mCallback2);
            this.playButton.setOnClickListener(mCallback1);
            this.stopButton.setOnClickListener(mCallback3);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            this.toolbarDetail.setTitle(viewModelWorkoutTitle);
            com.ersiver.gymific.util.BindingUtilsKt.bindImage(this.workoutImage, viewModelWorkoutIconCode);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.workoutInstruction, viewModelWorkoutInstruction);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // viewModel
                com.ersiver.gymific.ui.detail.DetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.resetTimer();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // viewModel
                com.ersiver.gymific.ui.detail.DetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.startTimer();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // viewModel
                com.ersiver.gymific.ui.detail.DetailViewModel viewModel = mViewModel;
                // viewModel != null
                boolean viewModelJavaLangObjectNull = false;



                viewModelJavaLangObjectNull = (viewModel) != (null);
                if (viewModelJavaLangObjectNull) {


                    viewModel.pauseTimer();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.workout
        flag 1 (0x2L): viewModel.timerStatus
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}