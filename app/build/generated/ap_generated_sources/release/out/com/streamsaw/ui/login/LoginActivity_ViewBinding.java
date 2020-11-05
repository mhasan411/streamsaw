// Generated code from Butter Knife. Do not modify!
package com.streamsaw.ui.login;

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

public class LoginActivity_ViewBinding implements Unbinder {
  private LoginActivity target;

  private View view7f0a00ae;

  private View view7f0a00aa;

  private View view7f0a01a5;

  @UiThread
  public LoginActivity_ViewBinding(LoginActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginActivity_ViewBinding(final LoginActivity target, View source) {
    this.target = target;

    View view;
    target.tilEmail = Utils.findRequiredViewAsType(source, R.id.til_email, "field 'tilEmail'", TextInputLayout.class);
    target.tilPassword = Utils.findRequiredViewAsType(source, R.id.til_password, "field 'tilPassword'", TextInputLayout.class);
    target.logoimagetop = Utils.findRequiredViewAsType(source, R.id.logo_image_top, "field 'logoimagetop'", ImageView.class);
    target.formContainer = Utils.findRequiredViewAsType(source, R.id.form_container, "field 'formContainer'", LinearLayout.class);
    target.loader = Utils.findRequiredViewAsType(source, R.id.loader, "field 'loader'", ProgressBar.class);
    view = Utils.findRequiredView(source, R.id.btn_skip, "method 'skip'");
    view7f0a00ae = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.skip();
      }
    });
    view = Utils.findRequiredView(source, R.id.btn_login, "method 'login'");
    view7f0a00aa = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.login();
      }
    });
    view = Utils.findRequiredView(source, R.id.go_to_register, "method 'goToRegister'");
    view7f0a01a5 = view;
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
    LoginActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.tilEmail = null;
    target.tilPassword = null;
    target.logoimagetop = null;
    target.formContainer = null;
    target.loader = null;

    view7f0a00ae.setOnClickListener(null);
    view7f0a00ae = null;
    view7f0a00aa.setOnClickListener(null);
    view7f0a00aa = null;
    view7f0a01a5.setOnClickListener(null);
    view7f0a01a5 = null;
  }
}
