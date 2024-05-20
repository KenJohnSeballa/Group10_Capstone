// Generated by view binder compiler. Do not edit!
package com.gk.koumpyol.dailyplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gk.koumpyol.dailyplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ListCellBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageButton btnQuickDeleteList;

  @NonNull
  public final TextView cellListDesc;

  @NonNull
  public final TextView cellListTitle;

  private ListCellBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnQuickDeleteList,
      @NonNull TextView cellListDesc, @NonNull TextView cellListTitle) {
    this.rootView = rootView;
    this.btnQuickDeleteList = btnQuickDeleteList;
    this.cellListDesc = cellListDesc;
    this.cellListTitle = cellListTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ListCellBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ListCellBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.list_cell, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ListCellBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_quickDeleteList;
      ImageButton btnQuickDeleteList = ViewBindings.findChildViewById(rootView, id);
      if (btnQuickDeleteList == null) {
        break missingId;
      }

      id = R.id.cellListDesc;
      TextView cellListDesc = ViewBindings.findChildViewById(rootView, id);
      if (cellListDesc == null) {
        break missingId;
      }

      id = R.id.cellListTitle;
      TextView cellListTitle = ViewBindings.findChildViewById(rootView, id);
      if (cellListTitle == null) {
        break missingId;
      }

      return new ListCellBinding((LinearLayout) rootView, btnQuickDeleteList, cellListDesc,
          cellListTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}