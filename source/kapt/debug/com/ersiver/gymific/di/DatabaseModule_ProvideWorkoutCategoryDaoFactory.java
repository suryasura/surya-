package com.ersiver.gymific.di;

import com.ersiver.gymific.db.GymificDatabase;
import com.ersiver.gymific.db.WorkoutCategoryDao;
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
public final class DatabaseModule_ProvideWorkoutCategoryDaoFactory implements Factory<WorkoutCategoryDao> {
  private final Provider<GymificDatabase> dbProvider;

  public DatabaseModule_ProvideWorkoutCategoryDaoFactory(Provider<GymificDatabase> dbProvider) {
    this.dbProvider = dbProvider;
  }

  @Override
  public WorkoutCategoryDao get() {
    return provideWorkoutCategoryDao(dbProvider.get());
  }

  public static DatabaseModule_ProvideWorkoutCategoryDaoFactory create(
      Provider<GymificDatabase> dbProvider) {
    return new DatabaseModule_ProvideWorkoutCategoryDaoFactory(dbProvider);
  }

  public static WorkoutCategoryDao provideWorkoutCategoryDao(GymificDatabase db) {
    return Preconditions.checkNotNull(DatabaseModule.INSTANCE.provideWorkoutCategoryDao(db), "Cannot return null from a non-@Nullable @Provides method");
  }
}
