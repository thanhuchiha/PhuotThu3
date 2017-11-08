package layout.baitap.com.phuotthu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import layout.baitap.com.phuotthu.Object.Place;
import layout.baitap.com.phuotthu.Adapter.ListViewProfileAdapter;
import layout.baitap.com.phuotthu.R;

/**
 * Created by DELL on 9/13/2017.
 */

public class FragmentDatGanDay extends Fragment {
    ListView lv_datganday;
    ArrayList<Place> arrayList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        arrayList = new ArrayList<>();

        View view = inflater.inflate(R.layout.activity_datganday,container,false);
        lv_datganday = (ListView) view.findViewById(R.id.lv_datganday);
        arrayList.add(new Place(R.drawable.dailanh,"Hải Đăng Đại Lãnh","Khánh Hòa"));
        ListViewProfileAdapter listViewProfileAdapter = new ListViewProfileAdapter(getContext(),R.layout.diadiem_layout,arrayList);

        lv_datganday.setAdapter(listViewProfileAdapter);

        lv_datganday.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            }
        });
        return view;
    }
}
