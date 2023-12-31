// Generated by view binder compiler. Do not edit!
package com.example.filemanagement.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.filemanagement.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentContentFileBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView ivContentFile;

  @NonNull
  public final TextView tvContentFile;

  private FragmentContentFileBinding(@NonNull ScrollView rootView, @NonNull ImageView ivContentFile,
      @NonNull TextView tvContentFile) {
    this.rootView = rootView;
    this.ivContentFile = ivContentFile;
    this.tvContentFile = tvContentFile;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentContentFileBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentContentFileBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_content_file, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentContentFileBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ivContentFile;
      ImageView ivContentFile = ViewBindings.findChildViewById(rootView, id);
      if (ivContentFile == null) {
        break missingId;
      }

      id = R.id.tvContentFile;
      TextView tvContentFile = ViewBindings.findChildViewById(rootView, id);
      if (tvContentFile == null) {
        break missingId;
      }

      return new FragmentContentFileBinding((ScrollView) rootView, ivContentFile, tvContentFile);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
