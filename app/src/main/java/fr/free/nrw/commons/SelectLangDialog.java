package fr.free.nrw.commons;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.fragment.app.DialogFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import fr.free.nrw.commons.upload.SpinnerLanguagesAdapter;

public class SelectLangDialog extends DialogFragment {
  String[] languages = {"a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d", "a", "b", "c", "d"};
  String[] myDataset = {"br", "en", "df", "dd", "br", "en", "df", "dd", "br", "en", "df", "dd", "br", "en", "df", "dd"};
  private RecyclerView.Adapter mAdapter;
  private RecyclerView.LayoutManager layoutManager;


  @Override
  public Dialog onCreateDialog(Bundle savedInstanceState) {
    // Use the builder class for convenient dialog construction.
    AlertDialog.Builder builder = new Builder(getActivity());
    LayoutInflater inflater = requireActivity().getLayoutInflater();

    builder.setView(inflater.inflate(R.layout.language_dialog, null))
        .setTitle("Select language for description");


    return builder.create();
  }

}
