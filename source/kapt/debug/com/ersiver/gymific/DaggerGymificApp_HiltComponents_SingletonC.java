package com.ersiver.gymific;

import android.app.Activity;
import android.app.Service;
import android.view.View;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import androidx.fragment.app.Fragment;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory;
import androidx.hilt.lifecycle.ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory;
import androidx.hilt.work.HiltWorkerFactory;
import androidx.hilt.work.WorkerAssistedFactory;
import androidx.hilt.work.WorkerFactoryModule_ProvideFactoryFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.work.ListenableWorker;
import com.ersiver.gymific.db.GymificDatabase;
import com.ersiver.gymific.db.WorkoutCategoryDao;
import com.ersiver.gymific.db.WorkoutDao;
import com.ersiver.gymific.di.DatabaseModule;
import com.ersiver.gymific.di.DatabaseModule_ProvideDataStoreFactory;
import com.ersiver.gymific.di.DatabaseModule_ProvideDatabaseFactory;
import com.ersiver.gymific.di.DatabaseModule_ProvideWorkoutCategoryDaoFactory;
import com.ersiver.gymific.di.DatabaseModule_ProvideWorkoutDaoFactory;
import com.ersiver.gymific.repository.UserPreferenceRepository;
import com.ersiver.gymific.repository.WorkoutRepository;
import com.ersiver.gymific.ui.arms.ArmsFragment;
import com.ersiver.gymific.ui.arms.ArmsViewModel_AssistedFactory;
import com.ersiver.gymific.ui.arms.ArmsViewModel_AssistedFactory_Factory;
import com.ersiver.gymific.ui.cardio.CardioFragment;
import com.ersiver.gymific.ui.cardio.CardioViewModel_AssistedFactory;
import com.ersiver.gymific.ui.cardio.CardioViewModel_AssistedFactory_Factory;
import com.ersiver.gymific.ui.detail.DetailFragment;
import com.ersiver.gymific.ui.detail.DetailViewModel_AssistedFactory;
import com.ersiver.gymific.ui.detail.DetailViewModel_AssistedFactory_Factory;
import com.ersiver.gymific.ui.favourite.FavouriteFragment;
import com.ersiver.gymific.ui.favourite.FavouriteViewModel_AssistedFactory;
import com.ersiver.gymific.ui.favourite.FavouriteViewModel_AssistedFactory_Factory;
import com.ersiver.gymific.ui.home.HomeFragment;
import com.ersiver.gymific.ui.home.HomeViewModel_AssistedFactory;
import com.ersiver.gymific.ui.home.HomeViewModel_AssistedFactory_Factory;
import com.ersiver.gymific.ui.legs.LegsFragment;
import com.ersiver.gymific.ui.legs.LegsViewModel_AssistedFactory;
import com.ersiver.gymific.ui.legs.LegsViewModel_AssistedFactory_Factory;
import com.ersiver.gymific.ui.viewpager.ViewPagerFragment;
import com.ersiver.gymific.worker.PopulateCategoryTableWorker_AssistedFactory;
import com.ersiver.gymific.worker.PopulateCategoryTableWorker_AssistedFactory_Factory;
import com.ersiver.gymific.worker.PopulateWorkoutTableWorker_AssistedFactory;
import com.ersiver.gymific.worker.PopulateWorkoutTableWorker_AssistedFactory_Factory;
import dagger.hilt.android.internal.builders.ActivityComponentBuilder;
import dagger.hilt.android.internal.builders.ActivityRetainedComponentBuilder;
import dagger.hilt.android.internal.builders.FragmentComponentBuilder;
import dagger.hilt.android.internal.builders.ServiceComponentBuilder;
import dagger.hilt.android.internal.builders.ViewComponentBuilder;
import dagger.hilt.android.internal.builders.ViewWithFragmentComponentBuilder;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideApplicationFactory;
import dagger.hilt.android.internal.modules.ApplicationContextModule_ProvideContextFactory;
import dagger.internal.DoubleCheck;
import dagger.internal.MapBuilder;
import dagger.internal.MemoizedSentinel;
import dagger.internal.Preconditions;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
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
public final class DaggerGymificApp_HiltComponents_SingletonC extends GymificApp_HiltComponents.SingletonC {
  private final ApplicationContextModule applicationContextModule;

  private volatile Object gymificDatabase = new MemoizedSentinel();

  private volatile Provider<GymificDatabase> provideDatabaseProvider;

  private volatile Provider<PopulateCategoryTableWorker_AssistedFactory> populateCategoryTableWorker_AssistedFactoryProvider;

  private volatile Provider<PopulateWorkoutTableWorker_AssistedFactory> populateWorkoutTableWorker_AssistedFactoryProvider;

  private volatile Object workoutDao = new MemoizedSentinel();

  private volatile Object workoutCategoryDao = new MemoizedSentinel();

  private DaggerGymificApp_HiltComponents_SingletonC(
      ApplicationContextModule applicationContextModuleParam) {
    this.applicationContextModule = applicationContextModuleParam;
  }

  public static Builder builder() {
    return new Builder();
  }

  private GymificDatabase getGymificDatabase() {
    Object local = gymificDatabase;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = gymificDatabase;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideDatabaseFactory.provideDatabase(ApplicationContextModule_ProvideApplicationFactory.provideApplication(applicationContextModule));
          gymificDatabase = DoubleCheck.reentrantCheck(gymificDatabase, local);
        }
      }
    }
    return (GymificDatabase) local;
  }

  private Provider<GymificDatabase> getGymificDatabaseProvider() {
    Object local = provideDatabaseProvider;
    if (local == null) {
      local = new SwitchingProvider<>(1);
      provideDatabaseProvider = (Provider<GymificDatabase>) local;
    }
    return (Provider<GymificDatabase>) local;
  }

  private PopulateCategoryTableWorker_AssistedFactory getPopulateCategoryTableWorker_AssistedFactory(
      ) {
    return PopulateCategoryTableWorker_AssistedFactory_Factory.newInstance(getGymificDatabaseProvider());
  }

  private Provider<PopulateCategoryTableWorker_AssistedFactory> getPopulateCategoryTableWorker_AssistedFactoryProvider(
      ) {
    Object local = populateCategoryTableWorker_AssistedFactoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(0);
      populateCategoryTableWorker_AssistedFactoryProvider = (Provider<PopulateCategoryTableWorker_AssistedFactory>) local;
    }
    return (Provider<PopulateCategoryTableWorker_AssistedFactory>) local;
  }

  private PopulateWorkoutTableWorker_AssistedFactory getPopulateWorkoutTableWorker_AssistedFactory(
      ) {
    return PopulateWorkoutTableWorker_AssistedFactory_Factory.newInstance(getGymificDatabaseProvider());
  }

  private Provider<PopulateWorkoutTableWorker_AssistedFactory> getPopulateWorkoutTableWorker_AssistedFactoryProvider(
      ) {
    Object local = populateWorkoutTableWorker_AssistedFactoryProvider;
    if (local == null) {
      local = new SwitchingProvider<>(2);
      populateWorkoutTableWorker_AssistedFactoryProvider = (Provider<PopulateWorkoutTableWorker_AssistedFactory>) local;
    }
    return (Provider<PopulateWorkoutTableWorker_AssistedFactory>) local;
  }

  private Map<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>> getMapOfStringAndProviderOfWorkerAssistedFactoryOf(
      ) {
    return MapBuilder.<String, Provider<WorkerAssistedFactory<? extends ListenableWorker>>>newMapBuilder(2).put("com.ersiver.gymific.worker.PopulateCategoryTableWorker", (Provider) getPopulateCategoryTableWorker_AssistedFactoryProvider()).put("com.ersiver.gymific.worker.PopulateWorkoutTableWorker", (Provider) getPopulateWorkoutTableWorker_AssistedFactoryProvider()).build();
  }

  private HiltWorkerFactory getHiltWorkerFactory() {
    return WorkerFactoryModule_ProvideFactoryFactory.provideFactory(getMapOfStringAndProviderOfWorkerAssistedFactoryOf());
  }

  private WorkoutDao getWorkoutDao() {
    Object local = workoutDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = workoutDao;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideWorkoutDaoFactory.provideWorkoutDao(getGymificDatabase());
          workoutDao = DoubleCheck.reentrantCheck(workoutDao, local);
        }
      }
    }
    return (WorkoutDao) local;
  }

  private WorkoutCategoryDao getWorkoutCategoryDao() {
    Object local = workoutCategoryDao;
    if (local instanceof MemoizedSentinel) {
      synchronized (local) {
        local = workoutCategoryDao;
        if (local instanceof MemoizedSentinel) {
          local = DatabaseModule_ProvideWorkoutCategoryDaoFactory.provideWorkoutCategoryDao(getGymificDatabase());
          workoutCategoryDao = DoubleCheck.reentrantCheck(workoutCategoryDao, local);
        }
      }
    }
    return (WorkoutCategoryDao) local;
  }

  private DataStore<Preferences> getDataStoreOfPreferences() {
    return DatabaseModule_ProvideDataStoreFactory.provideDataStore(ApplicationContextModule_ProvideContextFactory.provideContext(applicationContextModule));
  }

  @Override
  public void injectGymificApp(GymificApp gymificApp) {
    injectGymificApp2(gymificApp);
  }

  @Override
  public ActivityRetainedComponentBuilder retainedComponentBuilder() {
    return new ActivityRetainedCBuilder();
  }

  @Override
  public ServiceComponentBuilder serviceComponentBuilder() {
    return new ServiceCBuilder();
  }

  private GymificApp injectGymificApp2(GymificApp instance) {
    GymificApp_MembersInjector.injectWorkerFactory(instance, getHiltWorkerFactory());
    return instance;
  }

  public static final class Builder {
    private ApplicationContextModule applicationContextModule;

    private Builder() {
    }

    public Builder applicationContextModule(ApplicationContextModule applicationContextModule) {
      this.applicationContextModule = Preconditions.checkNotNull(applicationContextModule);
      return this;
    }

    /**
     * @deprecated This module is declared, but an instance is not used in the component. This method is a no-op. For more, see https://dagger.dev/unused-modules.
     */
    @Deprecated
    public Builder databaseModule(DatabaseModule databaseModule) {
      Preconditions.checkNotNull(databaseModule);
      return this;
    }

    public GymificApp_HiltComponents.SingletonC build() {
      Preconditions.checkBuilderRequirement(applicationContextModule, ApplicationContextModule.class);
      return new DaggerGymificApp_HiltComponents_SingletonC(applicationContextModule);
    }
  }

  private final class ActivityRetainedCBuilder implements GymificApp_HiltComponents.ActivityRetainedC.Builder {
    @Override
    public GymificApp_HiltComponents.ActivityRetainedC build() {
      return new ActivityRetainedCImpl();
    }
  }

  private final class ActivityRetainedCImpl extends GymificApp_HiltComponents.ActivityRetainedC {
    private ActivityRetainedCImpl() {

    }

    @Override
    public ActivityComponentBuilder activityComponentBuilder() {
      return new ActivityCBuilder();
    }

    private final class ActivityCBuilder implements GymificApp_HiltComponents.ActivityC.Builder {
      private Activity activity;

      @Override
      public ActivityCBuilder activity(Activity arg0) {
        this.activity = Preconditions.checkNotNull(arg0);
        return this;
      }

      @Override
      public GymificApp_HiltComponents.ActivityC build() {
        Preconditions.checkBuilderRequirement(activity, Activity.class);
        return new ActivityCImpl(activity);
      }
    }

    private final class ActivityCImpl extends GymificApp_HiltComponents.ActivityC {
      private final Activity activity;

      private volatile Provider<WorkoutRepository> workoutRepositoryProvider;

      private volatile Provider<ArmsViewModel_AssistedFactory> armsViewModel_AssistedFactoryProvider;

      private volatile Provider<CardioViewModel_AssistedFactory> cardioViewModel_AssistedFactoryProvider;

      private volatile Provider<UserPreferenceRepository> userPreferenceRepositoryProvider;

      private volatile Provider<DetailViewModel_AssistedFactory> detailViewModel_AssistedFactoryProvider;

      private volatile Provider<FavouriteViewModel_AssistedFactory> favouriteViewModel_AssistedFactoryProvider;

      private volatile Provider<HomeViewModel_AssistedFactory> homeViewModel_AssistedFactoryProvider;

      private volatile Provider<LegsViewModel_AssistedFactory> legsViewModel_AssistedFactoryProvider;

      private ActivityCImpl(Activity activityParam) {
        this.activity = activityParam;
      }

      private WorkoutRepository getWorkoutRepository() {
        return new WorkoutRepository(DaggerGymificApp_HiltComponents_SingletonC.this.getWorkoutDao(), DaggerGymificApp_HiltComponents_SingletonC.this.getWorkoutCategoryDao());
      }

      private Provider<WorkoutRepository> getWorkoutRepositoryProvider() {
        Object local = workoutRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(1);
          workoutRepositoryProvider = (Provider<WorkoutRepository>) local;
        }
        return (Provider<WorkoutRepository>) local;
      }

      private ArmsViewModel_AssistedFactory getArmsViewModel_AssistedFactory() {
        return ArmsViewModel_AssistedFactory_Factory.newInstance(getWorkoutRepositoryProvider());
      }

      private Provider<ArmsViewModel_AssistedFactory> getArmsViewModel_AssistedFactoryProvider() {
        Object local = armsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(0);
          armsViewModel_AssistedFactoryProvider = (Provider<ArmsViewModel_AssistedFactory>) local;
        }
        return (Provider<ArmsViewModel_AssistedFactory>) local;
      }

      private CardioViewModel_AssistedFactory getCardioViewModel_AssistedFactory() {
        return CardioViewModel_AssistedFactory_Factory.newInstance(getWorkoutRepositoryProvider());
      }

      private Provider<CardioViewModel_AssistedFactory> getCardioViewModel_AssistedFactoryProvider(
          ) {
        Object local = cardioViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(2);
          cardioViewModel_AssistedFactoryProvider = (Provider<CardioViewModel_AssistedFactory>) local;
        }
        return (Provider<CardioViewModel_AssistedFactory>) local;
      }

      private UserPreferenceRepository getUserPreferenceRepository() {
        return new UserPreferenceRepository(DaggerGymificApp_HiltComponents_SingletonC.this.getDataStoreOfPreferences());
      }

      private Provider<UserPreferenceRepository> getUserPreferenceRepositoryProvider() {
        Object local = userPreferenceRepositoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(4);
          userPreferenceRepositoryProvider = (Provider<UserPreferenceRepository>) local;
        }
        return (Provider<UserPreferenceRepository>) local;
      }

      private DetailViewModel_AssistedFactory getDetailViewModel_AssistedFactory() {
        return DetailViewModel_AssistedFactory_Factory.newInstance(getWorkoutRepositoryProvider(), getUserPreferenceRepositoryProvider());
      }

      private Provider<DetailViewModel_AssistedFactory> getDetailViewModel_AssistedFactoryProvider(
          ) {
        Object local = detailViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(3);
          detailViewModel_AssistedFactoryProvider = (Provider<DetailViewModel_AssistedFactory>) local;
        }
        return (Provider<DetailViewModel_AssistedFactory>) local;
      }

      private FavouriteViewModel_AssistedFactory getFavouriteViewModel_AssistedFactory() {
        return FavouriteViewModel_AssistedFactory_Factory.newInstance(getWorkoutRepositoryProvider(), getUserPreferenceRepositoryProvider());
      }

      private Provider<FavouriteViewModel_AssistedFactory> getFavouriteViewModel_AssistedFactoryProvider(
          ) {
        Object local = favouriteViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(5);
          favouriteViewModel_AssistedFactoryProvider = (Provider<FavouriteViewModel_AssistedFactory>) local;
        }
        return (Provider<FavouriteViewModel_AssistedFactory>) local;
      }

      private HomeViewModel_AssistedFactory getHomeViewModel_AssistedFactory() {
        return HomeViewModel_AssistedFactory_Factory.newInstance(getWorkoutRepositoryProvider());
      }

      private Provider<HomeViewModel_AssistedFactory> getHomeViewModel_AssistedFactoryProvider() {
        Object local = homeViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(6);
          homeViewModel_AssistedFactoryProvider = (Provider<HomeViewModel_AssistedFactory>) local;
        }
        return (Provider<HomeViewModel_AssistedFactory>) local;
      }

      private LegsViewModel_AssistedFactory getLegsViewModel_AssistedFactory() {
        return LegsViewModel_AssistedFactory_Factory.newInstance(getWorkoutRepositoryProvider());
      }

      private Provider<LegsViewModel_AssistedFactory> getLegsViewModel_AssistedFactoryProvider() {
        Object local = legsViewModel_AssistedFactoryProvider;
        if (local == null) {
          local = new SwitchingProvider<>(7);
          legsViewModel_AssistedFactoryProvider = (Provider<LegsViewModel_AssistedFactory>) local;
        }
        return (Provider<LegsViewModel_AssistedFactory>) local;
      }

      private Map<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>> getMapOfStringAndProviderOfViewModelAssistedFactoryOf(
          ) {
        return MapBuilder.<String, Provider<ViewModelAssistedFactory<? extends ViewModel>>>newMapBuilder(6).put("com.ersiver.gymific.ui.arms.ArmsViewModel", (Provider) getArmsViewModel_AssistedFactoryProvider()).put("com.ersiver.gymific.ui.cardio.CardioViewModel", (Provider) getCardioViewModel_AssistedFactoryProvider()).put("com.ersiver.gymific.ui.detail.DetailViewModel", (Provider) getDetailViewModel_AssistedFactoryProvider()).put("com.ersiver.gymific.ui.favourite.FavouriteViewModel", (Provider) getFavouriteViewModel_AssistedFactoryProvider()).put("com.ersiver.gymific.ui.home.HomeViewModel", (Provider) getHomeViewModel_AssistedFactoryProvider()).put("com.ersiver.gymific.ui.legs.LegsViewModel", (Provider) getLegsViewModel_AssistedFactoryProvider()).build();
      }

      private ViewModelProvider.Factory getProvideFactory() {
        return ViewModelFactoryModules_ActivityModule_ProvideFactoryFactory.provideFactory(activity, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerGymificApp_HiltComponents_SingletonC.this.applicationContextModule), getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
      }

      @Override
      public void injectMainActivity(MainActivity mainActivity) {
      }

      @Override
      public Set<ViewModelProvider.Factory> getActivityViewModelFactory() {
        return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
      }

      @Override
      public FragmentComponentBuilder fragmentComponentBuilder() {
        return new FragmentCBuilder();
      }

      @Override
      public ViewComponentBuilder viewComponentBuilder() {
        return new ViewCBuilder();
      }

      private final class FragmentCBuilder implements GymificApp_HiltComponents.FragmentC.Builder {
        private Fragment fragment;

        @Override
        public FragmentCBuilder fragment(Fragment arg0) {
          this.fragment = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public GymificApp_HiltComponents.FragmentC build() {
          Preconditions.checkBuilderRequirement(fragment, Fragment.class);
          return new FragmentCImpl(fragment);
        }
      }

      private final class FragmentCImpl extends GymificApp_HiltComponents.FragmentC {
        private final Fragment fragment;

        private FragmentCImpl(Fragment fragmentParam) {
          this.fragment = fragmentParam;
        }

        private ViewModelProvider.Factory getProvideFactory() {
          return ViewModelFactoryModules_FragmentModule_ProvideFactoryFactory.provideFactory(fragment, ApplicationContextModule_ProvideApplicationFactory.provideApplication(DaggerGymificApp_HiltComponents_SingletonC.this.applicationContextModule), ActivityCImpl.this.getMapOfStringAndProviderOfViewModelAssistedFactoryOf());
        }

        @Override
        public void injectArmsFragment(ArmsFragment armsFragment) {
        }

        @Override
        public void injectCardioFragment(CardioFragment cardioFragment) {
        }

        @Override
        public void injectDetailFragment(DetailFragment detailFragment) {
        }

        @Override
        public void injectFavouriteFragment(FavouriteFragment favouriteFragment) {
        }

        @Override
        public void injectHomeFragment(HomeFragment homeFragment) {
        }

        @Override
        public void injectLegsFragment(LegsFragment legsFragment) {
        }

        @Override
        public void injectViewPagerFragment(ViewPagerFragment viewPagerFragment) {
        }

        @Override
        public Set<ViewModelProvider.Factory> getFragmentViewModelFactory() {
          return Collections.<ViewModelProvider.Factory>singleton(getProvideFactory());
        }

        @Override
        public ViewWithFragmentComponentBuilder viewWithFragmentComponentBuilder() {
          return new ViewWithFragmentCBuilder();
        }

        private final class ViewWithFragmentCBuilder implements GymificApp_HiltComponents.ViewWithFragmentC.Builder {
          private View view;

          @Override
          public ViewWithFragmentCBuilder view(View arg0) {
            this.view = Preconditions.checkNotNull(arg0);
            return this;
          }

          @Override
          public GymificApp_HiltComponents.ViewWithFragmentC build() {
            Preconditions.checkBuilderRequirement(view, View.class);
            return new ViewWithFragmentCImpl(view);
          }
        }

        private final class ViewWithFragmentCImpl extends GymificApp_HiltComponents.ViewWithFragmentC {
          private ViewWithFragmentCImpl(View view) {

          }
        }
      }

      private final class ViewCBuilder implements GymificApp_HiltComponents.ViewC.Builder {
        private View view;

        @Override
        public ViewCBuilder view(View arg0) {
          this.view = Preconditions.checkNotNull(arg0);
          return this;
        }

        @Override
        public GymificApp_HiltComponents.ViewC build() {
          Preconditions.checkBuilderRequirement(view, View.class);
          return new ViewCImpl(view);
        }
      }

      private final class ViewCImpl extends GymificApp_HiltComponents.ViewC {
        private ViewCImpl(View view) {

        }
      }

      private final class SwitchingProvider<T> implements Provider<T> {
        private final int id;

        SwitchingProvider(int id) {
          this.id = id;
        }

        @SuppressWarnings("unchecked")
        @Override
        public T get() {
          switch (id) {
            case 0: // com.ersiver.gymific.ui.arms.ArmsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getArmsViewModel_AssistedFactory();

            case 1: // com.ersiver.gymific.repository.WorkoutRepository 
            return (T) ActivityCImpl.this.getWorkoutRepository();

            case 2: // com.ersiver.gymific.ui.cardio.CardioViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getCardioViewModel_AssistedFactory();

            case 3: // com.ersiver.gymific.ui.detail.DetailViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getDetailViewModel_AssistedFactory();

            case 4: // com.ersiver.gymific.repository.UserPreferenceRepository 
            return (T) ActivityCImpl.this.getUserPreferenceRepository();

            case 5: // com.ersiver.gymific.ui.favourite.FavouriteViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getFavouriteViewModel_AssistedFactory();

            case 6: // com.ersiver.gymific.ui.home.HomeViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getHomeViewModel_AssistedFactory();

            case 7: // com.ersiver.gymific.ui.legs.LegsViewModel_AssistedFactory 
            return (T) ActivityCImpl.this.getLegsViewModel_AssistedFactory();

            default: throw new AssertionError(id);
          }
        }
      }
    }
  }

  private final class ServiceCBuilder implements GymificApp_HiltComponents.ServiceC.Builder {
    private Service service;

    @Override
    public ServiceCBuilder service(Service arg0) {
      this.service = Preconditions.checkNotNull(arg0);
      return this;
    }

    @Override
    public GymificApp_HiltComponents.ServiceC build() {
      Preconditions.checkBuilderRequirement(service, Service.class);
      return new ServiceCImpl(service);
    }
  }

  private final class ServiceCImpl extends GymificApp_HiltComponents.ServiceC {
    private ServiceCImpl(Service service) {

    }
  }

  private final class SwitchingProvider<T> implements Provider<T> {
    private final int id;

    SwitchingProvider(int id) {
      this.id = id;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T get() {
      switch (id) {
        case 0: // com.ersiver.gymific.worker.PopulateCategoryTableWorker_AssistedFactory 
        return (T) DaggerGymificApp_HiltComponents_SingletonC.this.getPopulateCategoryTableWorker_AssistedFactory();

        case 1: // com.ersiver.gymific.db.GymificDatabase 
        return (T) DaggerGymificApp_HiltComponents_SingletonC.this.getGymificDatabase();

        case 2: // com.ersiver.gymific.worker.PopulateWorkoutTableWorker_AssistedFactory 
        return (T) DaggerGymificApp_HiltComponents_SingletonC.this.getPopulateWorkoutTableWorker_AssistedFactory();

        default: throw new AssertionError(id);
      }
    }
  }
}
