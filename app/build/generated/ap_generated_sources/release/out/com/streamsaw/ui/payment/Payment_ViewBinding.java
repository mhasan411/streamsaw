// Generated code from Butter Knife. Do not modify!
package com.streamsaw.ui.payment;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.streamsaw.R;
import com.stripe.android.view.CardInputWidget;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Payment_ViewBinding implements Unbinder {
  private Payment target;

  @UiThread
  public Payment_ViewBinding(Payment target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public Payment_ViewBinding(Payment target, View source) {
    this.target = target;

    target.cardInputWidget = Utils.findRequiredViewAsType(source, R.id.cardInputWidget, "field 'cardInputWidget'", CardInputWidget.class);
    target.paypalMethod = Utils.findRequiredViewAsType(source, R.id.paypal_method, "field 'paypalMethod'", TextView.class);
    target.sumbitSubscribe = Utils.findRequiredViewAsType(source, R.id.sumbit_subscribe, "field 'sumbitSubscribe'", Button.class);
    target.formContainer = Utils.findRequiredViewAsType(source, R.id.form_container, "field 'formContainer'", LinearLayout.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    Payment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.cardInputWidget = null;
    target.paypalMethod = null;
    target.sumbitSubscribe = null;
    target.formContainer = null;
    target.loader = null;
  }
}
