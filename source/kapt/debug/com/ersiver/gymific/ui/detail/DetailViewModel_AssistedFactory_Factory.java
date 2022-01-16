package com.ersiver.gymific.ui.detail;

import com.ersiver.gymific.repository.UserPreferenceRepository;
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
public final class DetailViewModel_AssistedFactory_Factory implements Factory<DetailViewModel_AssistedFactory> {
  private final Provider<WorkoutRepository> repositoryProvider;

  private final Provider<UserPreferenceRepository> userPreferenceRepositoryProvider;

  public DetailViewModel_AssistedFactory_Factory(Provider<WorkoutRepository> repositoryProvider,
      Provider<UserPreferenceRepository> userPreferenceRepositoryProvider) {
    this.repositoryProvider = repositoryProvider;
    this.userPreferenceRepositoryProvider = userPreferenceRepositoryProvider;
  }

  @Override
  public DetailViewModel_AssistedFactory get() {
    return newInstance(repositoryProvider, userPreferenceRepositoryProvider);
  }

  public static DetailViewModel_AssistedFactory_Factory create(
      Provider<WorkoutRepository> repositoryProvider,
      Provider<UserPreferenceRepository> userPreferenceRepositoryProvider) {
    return new DetailViewModel_AssistedFactory_Factory(repositoryProvider, userPreferenceRepositoryProvider);
  }

  public static DetailViewModel_AssistedFactory newInstance(Provider<WorkoutRepository> repository,
      Provider<UserPreferenceRepository> userPreferenceRepository) {
    return new DetailViewModel_AssistedFactory(repository, userPreferenceRepository);
  }
}
