package com.ersiver.gymific.ui.cardio;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.ersiver.gymific.repository.WorkoutRepository;
import java.lang.Override;
import javax.annotation.Generated;
import javax.inject.Inject;
import javax.inject.Provider;

@Generated("androidx.hilt.AndroidXHiltProcessor")
public final class CardioViewModel_AssistedFactory implements ViewModelAssistedFactory<CardioViewModel> {
  private final Provider<WorkoutRepository> repository;

  @Inject
  CardioViewModel_AssistedFactory(Provider<WorkoutRepository> repository) {
    this.repository = repository;
  }

  @Override
  @NonNull
  public CardioViewModel create(SavedStateHandle arg0) {
    return new CardioViewModel(repository.get());
  }
}
