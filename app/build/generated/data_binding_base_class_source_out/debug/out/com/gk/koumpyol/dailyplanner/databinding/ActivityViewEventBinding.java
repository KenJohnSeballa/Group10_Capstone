// Generated by view binder compiler. Do not edit!
package com.gk.koumpyol.dailyplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
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

public final class ActivityViewEventBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnSaveList;

  @NonNull
  public final TextView dateTimeView;

  @NonNull
  public final TextView listView;

  @NonNull
  public final TextView locationView;

  @NonNull
  public final TextView titleView;

  private ActivityViewEventBinding(@NonNull LinearLayout rootView, @NonNull Button btnSaveList,
      @NonNull TextView dateTimeView, @NonNull TextView listView, @NonNull TextView locationView,
      @NonNull TextView titleView) {
    this.rootView = rootView;
    this.btnSaveList = btnSaveList;
    this.dateTimeView = dateTimeView;
    this.listView = listView;
    this.locationView = locationView;
    this.titleView = titleView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_event, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewEventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_saveList;
      Button btnSaveList = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveList == null) {
        break missingId;
      }

      id = R.id.dateTimeView;
      TextView dateTimeView = ViewBindings.findChildViewById(rootView, id);
      if (dateTimeView == null) {
        break missingId;
      }

      id = R.id.listView;
      TextView listView = ViewBindings.findChildViewById(rootView, id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.locationView;
      TextView locationView = ViewBindings.findChildViewById(rootView, id);
      if (locationView == null) {
        break missingId;
      }

      id = R.id.titleView;
      TextView titleView = ViewBindings.findChildViewById(rootView, id);
      if (titleView == null) {
        break missingId;
      }

      return new ActivityViewEventBinding((LinearLayout) rootView, btnSaveList, dateTimeView,
          listView, locationView, titleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
