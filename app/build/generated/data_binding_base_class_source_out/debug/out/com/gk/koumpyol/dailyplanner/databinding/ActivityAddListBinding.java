// Generated by view binder compiler. Do not edit!
package com.gk.koumpyol.dailyplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gk.koumpyol.dailyplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddListBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDeleteList;

  @NonNull
  public final Button btnSaveList;

  @NonNull
  public final EditText descInput;

  @NonNull
  public final EditText titleInput;

  private ActivityAddListBinding(@NonNull LinearLayout rootView, @NonNull Button btnDeleteList,
      @NonNull Button btnSaveList, @NonNull EditText descInput, @NonNull EditText titleInput) {
    this.rootView = rootView;
    this.btnDeleteList = btnDeleteList;
    this.btnSaveList = btnSaveList;
    this.descInput = descInput;
    this.titleInput = titleInput;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddListBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddListBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_list, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddListBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_deleteList;
      Button btnDeleteList = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteList == null) {
        break missingId;
      }

      id = R.id.btn_saveList;
      Button btnSaveList = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveList == null) {
        break missingId;
      }

      id = R.id.descInput;
      EditText descInput = ViewBindings.findChildViewById(rootView, id);
      if (descInput == null) {
        break missingId;
      }

      id = R.id.titleInput;
      EditText titleInput = ViewBindings.findChildViewById(rootView, id);
      if (titleInput == null) {
        break missingId;
      }

      return new ActivityAddListBinding((LinearLayout) rootView, btnDeleteList, btnSaveList,
          descInput, titleInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
