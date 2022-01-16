package com.ersiver.gymific.repository;

import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
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
public final class UserPreferenceRepository_Factory implements Factory<UserPreferenceRepository> {
  private final Provider<DataStore<Preferences>> dataStoreProvider;

  public UserPreferenceRepository_Factory(Provider<DataStore<Preferences>> dataStoreProvider) {
    this.dataStoreProvider = dataStoreProvider;
  }

  @Override
  public UserPreferenceRepository get() {
    return newInstance(dataStoreProvider.get());
  }

  public static UserPreferenceRepository_Factory create(
      Provider<DataStore<Preferences>> dataStoreProvider) {
    return new UserPreferenceRepository_Factory(dataStoreProvider);
  }

  public static UserPreferenceRepository newInstance(DataStore<Preferences> dataStore) {
    return new UserPreferenceRepository(dataStore);
  }
}
