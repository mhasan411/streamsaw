// Generated by Dagger (https://dagger.dev).
package com.streamsaw.ui.player.bindings;

import com.streamsaw.data.repository.MediaRepository;
import dagger.MembersInjector;
import dagger.internal.InjectedFieldSignature;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PlayerController_MembersInjector implements MembersInjector<PlayerController> {
  private final Provider<MediaRepository> repositoryProvider;

  public PlayerController_MembersInjector(Provider<MediaRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  public static MembersInjector<PlayerController> create(
      Provider<MediaRepository> repositoryProvider) {
    return new PlayerController_MembersInjector(repositoryProvider);
  }

  @Override
  public void injectMembers(PlayerController instance) {
    injectRepository(instance, repositoryProvider.get());
  }

  @InjectedFieldSignature("com.streamsaw.ui.player.bindings.PlayerController.repository")
  public static void injectRepository(PlayerController instance, MediaRepository repository) {
    instance.repository = repository;
  }
}
