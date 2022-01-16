package com.ersiver.gymific.ui.cardio;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;
import javax.annotation.Generated;

@Generated("androidx.hilt.AndroidXHiltProcessor")
@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = CardioViewModel.class
)
public interface CardioViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.ersiver.gymific.ui.cardio.CardioViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(CardioViewModel_AssistedFactory factory);
}
