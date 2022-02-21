// Generated by Dagger (https://dagger.dev).
package com.jetpack.callapimvvm.network;

import com.jetpack.callapimvvm.repository.UserRespository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApiService_ProvideUserRepositoryFactory implements Factory<UserRespository> {
  private final ApiService module;

  private final Provider<ApiInterface> apiProvider;

  public ApiService_ProvideUserRepositoryFactory(ApiService module,
      Provider<ApiInterface> apiProvider) {
    this.module = module;
    this.apiProvider = apiProvider;
  }

  @Override
  public UserRespository get() {
    return provideUserRepository(module, apiProvider.get());
  }

  public static ApiService_ProvideUserRepositoryFactory create(ApiService module,
      Provider<ApiInterface> apiProvider) {
    return new ApiService_ProvideUserRepositoryFactory(module, apiProvider);
  }

  public static UserRespository provideUserRepository(ApiService instance, ApiInterface api) {
    return Preconditions.checkNotNullFromProvides(instance.provideUserRepository(api));
  }
}