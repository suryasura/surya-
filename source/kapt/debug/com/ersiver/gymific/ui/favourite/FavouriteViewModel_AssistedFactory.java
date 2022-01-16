package com.ersiver.gymific.ui.favourite;

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
public final class FavouriteViewModel_AssistedFactory implements ViewModelAssistedFactory<FavouriteViewModel> {
  private final Provider<WorkoutRepository> repository;

  private final Provider<UserPreferenceRepository> userPreferenceRepository;

  @Inject
  FavouriteViewModel_AssistedFactory(Provider<WorkoutRepository> repository,
      Provider<UserPreferenceRepository> userPreferenceRepository) {
    this.repository = repository;
    this.userPreferenceRepository = userPreferenceRepository;
  }

  @Override
  @NonNull
  public FavouriteViewModel create(SavedStateHandle arg0) {
    return new FavouriteViewModel(repository.get(), userPreferenceRepository.get());
  }
}
