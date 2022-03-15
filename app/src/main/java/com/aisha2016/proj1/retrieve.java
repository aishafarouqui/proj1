package com.aisha2016.proj1;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class retrieve extends AppCompatActivity {

    private RecyclerView comprecyclerView;
    private FirebaseDatabase db = FirebaseDatabase.getInstance();
    private DatabaseReference root = db.getReference().child("Companies");
    private CompAdapter adapter;
    private ArrayList<Companies> list;
    // List<Companies> compList;
    // DatabaseReference compDB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrieve);

        comprecyclerView = findViewById(R.id.recyclerview);
        comprecyclerView.setHasFixedSize(true);
        comprecyclerView.setLayoutManager(new LinearLayoutManager(this));
        list = new ArrayList<>();
        //adapter = new CompAdapter(this, list);
        comprecyclerView.setAdapter(adapter);

        root.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot : snapshot.getChildren()){
                    Companies companies = dataSnapshot.getValue(Companies.class);
                    list.add(companies);
                }
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




        //Noor _______________________________________________________________________
     /*   compList = new ArrayList<>();
        compDB = FirebaseDatabase.getInstance().getReference("Companies");
        compDB.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                compList.clear();

                for (DataSnapshot compDataSnap : snapshot.getChildren()){
                    Companies companies = compDataSnap.getValue(Companies.class);
                    compList.add(companies);
                }
                CompAdapter adapter = new CompAdapter(company.this,compList);
                comprecyclerView.setAdapter(adapter);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
*/











        ////////////////////////////////////////////////////////////////
        /*rvComp = (RecyclerView) findViewById(R.id.lv_company);
        dbComp = FirebaseDatabase.getInstance().getReference("Companies");
        rvComp.setHasFixedSize(true);
        rvComp.setLayoutManager(new LinearLayoutManager(this));
        arrCompCards = new ArrayList<>();
        compAdapter = new CompAdapter(this, arrCompCards);
        rvComp.setAdapter(compAdapter);
        dbComp.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for (DataSnapshot dataSnapshot  : snapshot.getChildren()){
                    Companies comp = dataSnapshot.getValue(Companies.class);
                    arrCompCards.add(comp);
                }
                compAdapter.notifyDataSetChanged();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });*/

        ////لهنا اول كود


         /*ListView lvCompCards;
           ArrayList<String> arrCompCards = new ArrayList<>();
           DatabaseReference dbComp;*/
        //rvComp.setLayoutManager(new LinearLayoutManager(this));
        // FirebaseRecyclerOptions<Companies> options =
        //    new FirebaseRecyclerOptions.Builder<Companies>()
        //     .setQuery(FirebaseDatabase.getInstance().getReference().child("Companies"), Companies.class).build();
      /*  ListView PassengersList = (ListView) findViewById(R.id.lv_company);
        ArrayList<Companies> listPass = new ArrayList();
        //نجيب البيانات من الداتابيس ك اوبجكت وناخد البيانات من الاوبجكتس
        /*listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");
        listPass.add("ابو صالح");

        // ArrayAdapter arrayPass = new ArrayAdapter(this,android.R.layout.simple_list_item_1,listPass);
        ArrayAdapter arrayPass = new ArrayAdapter(this,R.layout.lv_company,R.id.comp_name,listPass);
        PassengersList.setAdapter(arrayPass); */

        /****final ArrayAdapter<String> arrAdCompCards = new ArrayAdapter<String>(company.this,R.layout.lv_company,R.id.comp_name ,arrCompCards);
         lvCompCards= (ListView) findViewById(R.id.lv_company);
         lvCompCards.setAdapter(arrAdCompCards);
         dbComp = FirebaseDatabase.getInstance().getReference();
         dbComp.addChildEventListener(new ChildEventListener() {
        @Override
        public void onChildAdded(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        String value = snapshot.getValue(String.class);
        arrAdCompCards.add(value);
        arrAdCompCards.notifyDataSetChanged();
        }

        @Override
        public void onChildChanged(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {
        arrAdCompCards.notifyDataSetChanged();
        }

        @Override
        public void onChildRemoved(@NonNull DataSnapshot snapshot) {

        }

        @Override
        public void onChildMoved(@NonNull DataSnapshot snapshot, @Nullable String previousChildName) {

        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
        });****/

    }

 /*   public void getView (int position, View selectedComp, ViewGroup parent){
        LayoutInflater inflater = getLayoutInflater();
        View row = inflater.inflate(R.layout.lv_company, parent, false);
        TextView compName = (TextView) row.findViewById(R.id.comp_name);
        TextView subscPrice = (TextView) row.findViewById(R.id.subscPrice);
        ImageView logo = (ImageView) row.findViewById(R.id.logo);
        Button displayCompInfo = (Button) row.findViewById(R.id.displayCompInfo);
        //Companies comp = listPass.get(position);



    } */

}