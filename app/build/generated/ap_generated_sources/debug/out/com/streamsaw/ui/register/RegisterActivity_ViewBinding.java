// Generated code from Butter Knife. Do not modify!
package com.streamsaw.ui.register;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.google.android.material.textfield.TextInputLayout;
import com.streamsaw.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RegisterActivity_ViewBinding implements Unbinder {
  private RegisterActivity target;

  private View view7f0a00ac;

  private View view7f0a01a4;

  @UiThread
  public RegisterActivity_ViewBinding(RegisterActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public RegisterActivity_ViewBinding(final RegisterActivity target, View source) {
    this.target = target;

    View view;
    target.tilName = Utils.findRequiredViewAsType(source, R.id.til_name, "field 'tilName'", TextInputLayout.class);
    target.tilEmail = Utils.findRequiredViewAsType(source, R.id.til_email, "field 'tilEmail'", TextInputLayout.class);
    target.tilPassword = Utils.findRequiredViewAsType(source, R.id.til_password, "field 'tilPassword'", TextInputLayout.class);
    target.formContainer = Utils.findRequiredViewAsType(source, R.id.form_container, "field 'formContainer'", LinearLayout.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
    target.logoimagetop = Utils.findRequiredViewAsType(source, R.id.logo_image_top, "field 'logoimagetop'", ImageView.class);
    view = Utils.findRequiredView(source, R.id.btn_register, "method 'register'");
    view7f0a00ac = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.register();
      }
    });
    view = Utils.findRequiredView(source, R.id.go_to_login, "method 'goToRegister'");
    view7f0a01a4 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.goToRegister();
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    RegisterActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tilName = null;
    target.tilEmail = null;
    target.tilPassword = null;
    target.formContainer = null;
    target.loader = null;
    target.logoimagetop = null;

    view7f0a00ac.setOnClickListener(null);
    view7f0a00ac = null;
    view7f0a01a4.setOnClickListener(null);
    view7f0a01a4 = null;
  }
}
