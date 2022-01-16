package com.ersiver.gymific.databinding;
import com.ersiver.gymific.R;
import com.ersiver.gymific.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
@javax.annotation.Generated("Android Data Binding")
public class WorkoutViewItemBindingImpl extends WorkoutViewItemBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public WorkoutViewItemBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private WorkoutViewItemBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[3]
            , (com.google.android.material.imageview.ShapeableImageView) bindings[1]
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.workoutCategory.setTag(null);
        this.workoutImage.setTag(null);
        this.workoutItemContainer.setTag(null);
        this.workoutTime.setTag(null);
        this.workoutTitle.setTag(null);
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
        if (BR.clickListener == variableId) {
            setClickListener((android.view.View.OnClickListener) variable);
        }
        else if (BR.workout == variableId) {
            setWorkout((com.ersiver.gymific.model.Workout) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setClickListener(@Nullable android.view.View.OnClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }
    public void setWorkout(@Nullable com.ersiver.gymific.model.Workout Workout) {
        this.mWorkout = Workout;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.workout);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String workoutIconCode = null;
        android.view.View.OnClickListener clickListener = mClickListener;
        java.lang.String WorkoutTitle1 = null;
        java.lang.String WorkoutCategory1 = null;
        com.ersiver.gymific.model.Workout workout = mWorkout;
        long WorkoutTime1 = 0;

        if ((dirtyFlags & 0x5L) != 0) {
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (workout != null) {
                    // read workout.iconCode
                    workoutIconCode = workout.getIconCode();
                    // read workout.title
                    WorkoutTitle1 = workout.getTitle();
                    // read workout.category
                    WorkoutCategory1 = workout.getCategory();
                    // read workout.time
                    WorkoutTime1 = workout.getTime();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.workoutCategory, WorkoutCategory1);
            com.ersiver.gymific.util.BindingUtilsKt.bindImage(this.workoutImage, workoutIconCode);
            com.ersiver.gymific.util.BindingUtilsKt.bindWorkTime(this.workoutTime, WorkoutTime1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.workoutTitle, WorkoutTitle1);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            this.workoutItemContainer.setOnClickListener(clickListener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): clickListener
        flag 1 (0x2L): workout
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}