package com.streamsaw.di.module;

import com.streamsaw.ui.payment.Payment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContributePayment.PaymentSubcomponent.class)
public abstract class ActivityModule_ContributePayment {
  private ActivityModule_ContributePayment() {}

  @Binds
  @IntoMap
  @ClassKey(Payment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PaymentSubcomponent.Factory builder);

  @Subcomponent
  public interface PaymentSubcomponent extends AndroidInjector<Payment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<Payment> {}
  }
}
