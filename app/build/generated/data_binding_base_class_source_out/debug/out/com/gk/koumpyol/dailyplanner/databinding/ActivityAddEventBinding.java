// Generated by view binder compiler. Do not edit!
package com.gk.koumpyol.dailyplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gk.koumpyol.dailyplanner.R;
import com.google.android.material.chip.Chip;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityAddEventBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnDeleteList;

  @NonNull
  public final Button btnSaveEvent;

  @NonNull
  public final Button datePicker;

  @NonNull
  public final Chip listChip;

  @NonNull
  public final Spinner listSpinner;

  @NonNull
  public final Spinner notificationSpinner;

  @NonNull
  public final Chip placeChip;

  @NonNull
  public final Spinner placeSpinner;

  @NonNull
  public final Chip reminderChip;

  @NonNull
  public final Spinner reminderSpinner;

  @NonNull
  public final Chip repeatEventChip;

  @NonNull
  public final Button repeatEventDatePicker;

  @NonNull
  public final Button timePicker;

  @NonNull
  public final EditText titleInput;

  private ActivityAddEventBinding(@NonNull LinearLayout rootView, @NonNull Button btnDeleteList,
      @NonNull Button btnSaveEvent, @NonNull Button datePicker, @NonNull Chip listChip,
      @NonNull Spinner listSpinner, @NonNull Spinner notificationSpinner, @NonNull Chip placeChip,
      @NonNull Spinner placeSpinner, @NonNull Chip reminderChip, @NonNull Spinner reminderSpinner,
      @NonNull Chip repeatEventChip, @NonNull Button repeatEventDatePicker,
      @NonNull Button timePicker, @NonNull EditText titleInput) {
    this.rootView = rootView;
    this.btnDeleteList = btnDeleteList;
    this.btnSaveEvent = btnSaveEvent;
    this.datePicker = datePicker;
    this.listChip = listChip;
    this.listSpinner = listSpinner;
    this.notificationSpinner = notificationSpinner;
    this.placeChip = placeChip;
    this.placeSpinner = placeSpinner;
    this.reminderChip = reminderChip;
    this.reminderSpinner = reminderSpinner;
    this.repeatEventChip = repeatEventChip;
    this.repeatEventDatePicker = repeatEventDatePicker;
    this.timePicker = timePicker;
    this.titleInput = titleInput;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityAddEventBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityAddEventBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_add_event, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityAddEventBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_deleteList;
      Button btnDeleteList = ViewBindings.findChildViewById(rootView, id);
      if (btnDeleteList == null) {
        break missingId;
      }

      id = R.id.btn_saveEvent;
      Button btnSaveEvent = ViewBindings.findChildViewById(rootView, id);
      if (btnSaveEvent == null) {
        break missingId;
      }

      id = R.id.datePicker;
      Button datePicker = ViewBindings.findChildViewById(rootView, id);
      if (datePicker == null) {
        break missingId;
      }

      id = R.id.listChip;
      Chip listChip = ViewBindings.findChildViewById(rootView, id);
      if (listChip == null) {
        break missingId;
      }

      id = R.id.listSpinner;
      Spinner listSpinner = ViewBindings.findChildViewById(rootView, id);
      if (listSpinner == null) {
        break missingId;
      }

      id = R.id.notificationSpinner;
      Spinner notificationSpinner = ViewBindings.findChildViewById(rootView, id);
      if (notificationSpinner == null) {
        break missingId;
      }

      id = R.id.placeChip;
      Chip placeChip = ViewBindings.findChildViewById(rootView, id);
      if (placeChip == null) {
        break missingId;
      }

      id = R.id.placeSpinner;
      Spinner placeSpinner = ViewBindings.findChildViewById(rootView, id);
      if (placeSpinner == null) {
        break missingId;
      }

      id = R.id.reminderChip;
      Chip reminderChip = ViewBindings.findChildViewById(rootView, id);
      if (reminderChip == null) {
        break missingId;
      }

      id = R.id.reminderSpinner;
      Spinner reminderSpinner = ViewBindings.findChildViewById(rootView, id);
      if (reminderSpinner == null) {
        break missingId;
      }

      id = R.id.repeatEventChip;
      Chip repeatEventChip = ViewBindings.findChildViewById(rootView, id);
      if (repeatEventChip == null) {
        break missingId;
      }

      id = R.id.repeatEventDatePicker;
      Button repeatEventDatePicker = ViewBindings.findChildViewById(rootView, id);
      if (repeatEventDatePicker == null) {
        break missingId;
      }

      id = R.id.timePicker;
      Button timePicker = ViewBindings.findChildViewById(rootView, id);
      if (timePicker == null) {
        break missingId;
      }

      id = R.id.titleInput;
      EditText titleInput = ViewBindings.findChildViewById(rootView, id);
      if (titleInput == null) {
        break missingId;
      }

      return new ActivityAddEventBinding((LinearLayout) rootView, btnDeleteList, btnSaveEvent,
          datePicker, listChip, listSpinner, notificationSpinner, placeChip, placeSpinner,
          reminderChip, reminderSpinner, repeatEventChip, repeatEventDatePicker, timePicker,
          titleInput);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
