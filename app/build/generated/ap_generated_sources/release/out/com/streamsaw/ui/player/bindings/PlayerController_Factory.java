// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.player.bindings;

import com.streamsaw.data.repository.MediaRepository;
import dagger.internal.Factory;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayerController_Factory implements Factory<PlayerController> {
  private final Provider<MediaRepository> repositoryProvider;

  public PlayerController_Factory(Provider<MediaRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public PlayerController get() {
    PlayerController instance = newInstance();
    PlayerController_MembersInjector.injectRepository(instance, repositoryProvider.get());
    return instance;
  }

  public static PlayerController_Factory create(Provider<MediaRepository> repositoryProvider) {
    return new PlayerController_Factory(repositoryProvider);
  }

  public static PlayerController newInstance() {
    return new PlayerController();
  }
}