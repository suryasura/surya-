package com.ersiver.gymific.ui.cardio;

import com.ersiver.gymific.repository.WorkoutRepository;
import dagger.internal.Factory;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CardioViewModel_AssistedFactory_Factory implements Factory<CardioViewModel_AssistedFactory> {
  private final Provider<WorkoutRepository> repositoryProvider;

  public CardioViewModel_AssistedFactory_Factory(Provider<WorkoutRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CardioViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider);
  }

  public static CardioViewModel_AssistedFactory_Factory create(
      Provider<WorkoutRepository> repositoryProvider) {
    return new CardioViewModel_AssistedFactory_Factory(repositoryProvider);
  }

  public static CardioViewModel_AssistedFactory newInstance(
      Provider<WorkoutRepository> repository) {
    return new CardioViewModel_AssistedFactory(repository);
  }
}
