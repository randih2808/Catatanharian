package catatan_harian.UAS_AKB_IF1_10120038.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import catatan_harian.UAS_AKB_IF1_10120038.R;
import catatan_harian.UAS_AKB_IF1_10120038.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {
    //TUGAS PENGGANTI UAS AKB
    //Nim   : 10120038
    //Nama  : Randi Hardiansyah
    //Kelas : IF-1

private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);
    }

@Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}