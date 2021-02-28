package kz.course.droidcafe;

import androidx.annotation.NonNull;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView AndroidPhone;
    RadioButton btn_ex, btn_go, btn_ok, btn_po;
    CheckBox btn_one, btn_two, btn_three, btn_four;
    Button submit_btn;

    String RateTuri, SugTuri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AndroidPhone = findViewById(R.id.AndroidPhone);

        btn_ex = findViewById(R.id.btn_ex);
        btn_go = findViewById(R.id.btn_go);
        btn_ok = findViewById(R.id.btn_ok);
        btn_po = findViewById(R.id.btn_po);

        btn_one = findViewById(R.id.btn_one);
        btn_two = findViewById(R.id.btn_two);
        btn_three = findViewById(R.id.btn_three);
        btn_four = findViewById(R.id.btn_four);

        submit_btn = findViewById(R.id.submit_btn);
        registerForContextMenu(AndroidPhone);

        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_ex.isChecked()){
                    RateTuri = "excellent knopkasi arkyly";
                }else if (btn_go.isChecked()){
                    RateTuri = "good knopkasi arkyly";
                }else if (btn_ok.isChecked()){
                    RateTuri = "okay knopkasi arkyly";
                }else if (btn_po.isChecked()){
                    RateTuri = "poor knopkasi arkyly";
                }
                if (btn_one.isChecked()){
                    SugTuri = "birinwi sug knopkasi arkyly";
            }
                if (btn_two.isChecked()){
                    SugTuri = "ekinwi sug knopkasi arkyly";
                }
                if (btn_three.isChecked()){
                    SugTuri = "ushinwi sug knopkasi arkyly";
                }
                if (btn_four.isChecked()){
                    SugTuri = "tortinwi sug knopkasi arkyly";
                }

                String result = "Rate turi:"+RateTuri+"\n"+
                                "Sug turi:"+SugTuri;

                Toast.makeText(this, result, Toast.LENGTH_LONG).show();
        });
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.droidmenu, menu);

        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.aruzhan:
                AndroidPhone.setText("Aruzhan");
                break;

            case R.id.aru:
                AndroidPhone.setText("Aru");
                break;

            case R.id.nurakhmet:
                AndroidPhone.setText("Nurakhmet");
                break;

            case R.id.aruka:
                AndroidPhone.setText("Aruka");
                break;

        }
        return super.onContextItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.btn_local:
                Toast.makeText(this, "Local menu basildi", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_att:
                Toast.makeText(this, "Attach menu basildi", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_fav:
                Toast.makeText(this, "Favorite menu basildi", Toast.LENGTH_LONG).show();
                break;

            case R.id.btn_cont:
                Toast.makeText(this, "Contact menu basildi", Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}