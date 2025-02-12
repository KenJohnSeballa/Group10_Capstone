// Generated by view binder compiler. Do not edit!
package com.gk.koumpyol.dailyplanner.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.gk.koumpyol.dailyplanner.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentListsBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button btnAddList;

  @NonNull
  public final ListView listsListView;

  private FragmentListsBinding(@NonNull LinearLayout rootView, @NonNull Button btnAddList,
      @NonNull ListView listsListView) {
    this.rootView = rootView;
    this.btnAddList = btnAddList;
    this.listsListView = listsListView;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentListsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentListsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_lists, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentListsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_addList;
      Button btnAddList = ViewBindings.findChildViewById(rootView, id);
      if (btnAddList == null) {
        break missingId;
      }

      id = R.id.listsListView;
      ListView listsListView = ViewBindings.findChildViewById(rootView, id);
      if (listsListView == null) {
        break missingId;
      }

      return new FragmentListsBinding((LinearLayout) rootView, btnAddList, listsListView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
