package com.ersiver.gymific.ui.arms;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.ersiver.gymific.repository.WorkoutRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class ArmsViewModel_AssistedFactory implements ViewModelAssistedFactory<ArmsViewModel> {
  private final Provider<WorkoutRepository> repository;

  @Inject
  ArmsViewModel_AssistedFactory(Provider<WorkoutRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public ArmsViewModel create(SavedStateHandle arg0) {
    return new ArmsViewModel(repository.get());
  }
}
