package com.ersiver.gymific;

import androidx.hilt.work.HiltWorkerFactory;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
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
public final class GymificApp_MembersInjector implements MembersInjector<GymificApp> {
  private final Provider<HiltWorkerFactory> workerFactoryProvider;

  public GymificApp_MembersInjector(Provider<HiltWorkerFactory> workerFactoryProvider) {
    this.workerFactoryProvider = workerFactoryProvider;
  }

  public static MembersInjector<GymificApp> create(
      Provider<HiltWorkerFactory> workerFactoryProvider) {
    return new GymificApp_MembersInjector(workerFactoryProvider);
  }

  @Override
  public void injectMembers(GymificApp instance) {
    injectWorkerFactory(instance, workerFactoryProvider.get());
  }

  @InjectedFieldSignature("com.ersiver.gymific.GymificApp.workerFactory")
  public static void injectWorkerFactory(GymificApp instance, HiltWorkerFactory workerFactory) {
    instance.workerFactory = workerFactory;
  }
}
