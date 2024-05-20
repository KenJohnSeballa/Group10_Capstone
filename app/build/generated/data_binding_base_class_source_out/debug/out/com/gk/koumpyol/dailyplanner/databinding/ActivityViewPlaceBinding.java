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
import org.osmdroid.views.MapView;

public final class ActivityViewPlaceBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView addressView;

  @NonNull
  public final MapView mapDirectionsView;

  @NonNull
  public final Button startNavButton;

  @NonNull
  public final TextView titleView;

  private ActivityViewPlaceBinding(@NonNull LinearLayout rootView, @NonNull TextView addressView,
      @NonNull MapView mapDirectionsView, @NonNull Button startNavButton,
      @NonNull TextView titleView) {
    this.rootView = rootView;
    this.addressView = addressView;
    this.mapDirectionsView = mapDirectionsView;
    this.startNavButton = startNavButton;
    this.titleView = titleView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityViewPlaceBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityViewPlaceBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_view_place, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityViewPlaceBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressView;
      TextView addressView = ViewBindings.findChildViewById(rootView, id);
      if (addressView == null) {
        break missingId;
      }

      id = R.id.mapDirectionsView;
      MapView mapDirectionsView = ViewBindings.findChildViewById(rootView, id);
      if (mapDirectionsView == null) {
        break missingId;
      }

      id = R.id.startNavButton;
      Button startNavButton = ViewBindings.findChildViewById(rootView, id);
      if (startNavButton == null) {
        break missingId;
      }

      id = R.id.titleView;
      TextView titleView = ViewBindings.findChildViewById(rootView, id);
      if (titleView == null) {
        break missingId;
      }

      return new ActivityViewPlaceBinding((LinearLayout) rootView, addressView, mapDirectionsView,
          startNavButton, titleView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
