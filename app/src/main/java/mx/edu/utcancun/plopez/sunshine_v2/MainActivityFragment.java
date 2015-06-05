package mx.edu.utcancun.plopez.sunshine_v2;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivityFragment extends Fragment implements View.OnClickListener {

    public MainActivityFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);

        Weather w1;
        Weather w2;
        Weather w3;
        Weather w4;

        Weather[] firecastArray = {
                w1 = new Weather("Hoy", "Nublado", "38/29"),
                w2 = new Weather("Mañana", "Soleado", "38/29"),
                w3 = new Weather("Pasado Mañana", "Lluvioso", "38/29"),
                w4 = new Weather("Prox. Semana", "Graniso", "38/29")
        };

        List<Weather> foreCastList = new ArrayList<Weather>(Arrays.asList(firecastArray));

        ArrayAdapter<Weather> adapter = new ArrayAdapter<Weather> (
                getActivity(),
                R.layout.list_item_forecast,
                R.id.list_item_forecast_textview,
                foreCastList
        );

        ListView list = (ListView) rootView.findViewById(R.id.listview_forecast);
        list.setAdapter(adapter);

        Button btn = (Button) rootView.findViewById(R.id.btn);
        btn.setText("Click");
        btn.setOnClickListener(this);

        return  rootView;
    }

    @Override
    public void onClick(View v) {
        Button btn = (Button) v.findViewById(R.id.btn);
        btn.setText("Palmira Lopez ! :)");
    }
}
