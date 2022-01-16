package com.ersiver.gymific.ui.detail;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.ersiver.gymific.repository.UserPreferenceRepository;
import com.ersiver.gymific.repository.WorkoutRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class DetailViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailViewModel> {
  private final Provider<WorkoutRepository> repository;

  private final Provider<UserPreferenceRepository> userPreferenceRepository;

  @Inject
  DetailViewModel_AssistedFactory(Provider<WorkoutRepository> repository,
      Provider<UserPreferenceRepository> userPreferenceRepository) {
    this.repository = repository;
    this.userPreferenceRepository = userPreferenceRepository;
  }

  @Override
  @NonNull
  public DetailViewModel create(SavedStateHandle arg0) {
    return new DetailViewModel(repository.get(), userPreferenceRepository.get());
  }
}
