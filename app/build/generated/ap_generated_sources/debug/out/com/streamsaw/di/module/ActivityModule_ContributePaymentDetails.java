package com.streamsaw.di.module;

import com.streamsaw.ui.payment.PaymentDetails;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityModule_ContributePaymentDetails.PaymentDetailsSubcomponent.class)
public abstract class ActivityModule_ContributePaymentDetails {
  private ActivityModule_ContributePaymentDetails() {}

  @Binds
  @IntoMap
  @ClassKey(PaymentDetails.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PaymentDetailsSubcomponent.Factory builder);

  @Subcomponent
  public interface PaymentDetailsSubcomponent extends AndroidInjector<PaymentDetails> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PaymentDetails> {}
  }
}
