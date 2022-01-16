package com.ersiver.gymific.di;

import com.ersiver.gymific.db.GymificDatabase;
import com.ersiver.gymific.db.WorkoutDao;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class DatabaseModule_ProvideWorkoutDaoFactory implements Factory<WorkoutDao> {
  private final Provider<GymificDatabase> dbProvider;

  public DatabaseModule_ProvideWorkoutDaoFactory(Provider<GymificDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public WorkoutDao get() {
    return provideWorkoutDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideWorkoutDaoFactory create(
      Provider<GymificDatabase> dbProvider) {
    return new DatabaseModule_ProvideWorkoutDaoFactory(dbProvider);
  }

  public static WorkoutDao provideWorkoutDao(GymificDatabase db) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideWorkoutDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
