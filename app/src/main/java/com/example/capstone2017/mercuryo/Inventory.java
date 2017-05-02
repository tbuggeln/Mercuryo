package com.example.capstone2017.mercuryo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends AppCompatActivity {
    private List<Device> deviceList = new ArrayList<>();
    private RecyclerView recyclerView;
    private DevicesAdapter mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        Toast.makeText(getApplicationContext(), "Logon Successful", Toast.LENGTH_SHORT).show();

        mAdapter = new DevicesAdapter(deviceList);

        recyclerView.setHasFixedSize(true);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);



        prepareDeviceData();
    }

    private void prepareDeviceData() {
        Device device = new Device("IT-F00X9R12","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R15","E531","CH003");
        deviceList.add(device);

        device = new Device("IT-F00X9R16","U550","185 LIB");
        deviceList.add(device);

        device = new Device("IT-F00X9R17","U550","CH003");
        deviceList.add(device);

        device = new Device("IT-F00X9R18","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R19","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R20","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R21","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R23","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R24","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R25","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R26","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R27","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R28","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R29","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R30","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R31","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R32","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R33","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R34","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R35","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R36","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R37","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R38","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R39","E540","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R26","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R27","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R28","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R29","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R30","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R31","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R15","E531","CH003");
        deviceList.add(device);

        device = new Device("IT-F00X9R16","U550","185 LIB");
        deviceList.add(device);

        device = new Device("IT-F00X9R17","U550","CH003");
        deviceList.add(device);

        device = new Device("IT-F00X9R20","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R21","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R23","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R24","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R25","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R26","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R27","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R28","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R29","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R30","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R31","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R15","E531","CH003");
        deviceList.add(device);

        device = new Device("IT-F00X9R16","U550","185 LIB");
        deviceList.add(device);

        device = new Device("IT-F00X9R17","U550","CH003");
        deviceList.add(device);

        device = new Device("IT-F00X9R20","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R21","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R23","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R24","E531","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R25","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R26","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R27","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R28","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R29","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R30","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-F00X9R31","E540","LBHUBL");
        deviceList.add(device);

        device = new Device("IT-PRINTER01","SHARP","CH102");
        deviceList.add(device);

        device = new Device("IT-PRINTER02","SHARP","CH103");
        deviceList.add(device);

        device = new Device("IT-PRINTER03","SHARP","CH104");
        deviceList.add(device);

        device = new Device("IT-PRINTER04","SHARP","CH105");
        deviceList.add(device);

        device = new Device("IT-PRINTER05","SHARP","CH106");
        deviceList.add(device);

        device = new Device("IT-PRINTER06","SHARP","CH107");
        deviceList.add(device);

        device = new Device("IT-F00X9R46","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R46","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R46","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R47","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R48","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R49","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R50","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R51","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R52","SL510","CH102");
        deviceList.add(device);

        device = new Device("IT-F00X9R62","E531","CH126");
        deviceList.add(device);

        device = new Device("IT-F00X9R63","E531","CH126");
        deviceList.add(device);

        device = new Device("IT-F00X9R64","E531","CH126");
        deviceList.add(device);

        device = new Device("IT-F00X9R65","E531","CH126");
        deviceList.add(device);

        device = new Device("IT-F00X9R66","E531","CH126");
        deviceList.add(device);

        device = new Device("IT-F00X9R67","E531","CH126");
        deviceList.add(device);

        device = new Device("IT-SERVER01","E530","SR");
        deviceList.add(device);

        device = new Device("IT-SERVER02","E530","SR");
        deviceList.add(device);

        device = new Device("IT-SERVER03","E530","SR");
        deviceList.add(device);

        device = new Device("IT-SERVER04","E530","SR");
        deviceList.add(device);

        device = new Device("IT-SERVER05","E530","SR");
        deviceList.add(device);

        device = new Device("IT-SERVER06","E530","SR");
        deviceList.add(device);

        device = new Device("IT-F00X9R111","E531","185LIB");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P10","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P11","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P12","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P13","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P14","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P15","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P16","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P17","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P18","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P19","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("EOF-SPF0N3P20","ACER","VHLAP");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE12","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE13","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE14","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE15","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE16","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE17","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE18","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE19","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("CITEL-12DFRE20","LENOVO","LRC005");
        deviceList.add(device);

        device = new Device("NURSING-5456HY12","LENOVO","CH005");
        deviceList.add(device);

        device = new Device("NURSING-5456HY13","LENOVO","CH005");
        deviceList.add(device);


        device = new Device("NURSING-5456HY14","LENOVO","CH005");
        deviceList.add(device);

        device = new Device("NURSING-5456HY15","LENOVO","CH005");
        deviceList.add(device);

        device = new Device("NURSING-5456HY16","LENOVO","CH005");
        deviceList.add(device);

        device = new Device("NURSING-5456HY17","LENOVO","CH005");
        deviceList.add(device);

        device = new Device("NURSING-5456HY18","LENOVO","CH005");
        deviceList.add(device);

        device = new Device("HELPDESK-87123232","LENOVO","185LIB");
        deviceList.add(device);

        device = new Device("HELPDESK-87123233","LENOVO","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4359","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG43560","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4361","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4362","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4363","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4364","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4365","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4366","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4367","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4368","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4369","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4370","E560","185LIB");
        deviceList.add(device);

        device = new Device("IT-MLKG4371","E560","185LIB");
        deviceList.add(device);



















        mAdapter.notifyDataSetChanged();
    }

}
