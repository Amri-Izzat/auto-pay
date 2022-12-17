package com.example.tp1.view;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.tp1.R;
import com.example.tp1.controler.HomeControler;
public class HomeActivity extends AppCompatActivity {
    private EditText txtorigine;
    private EditText txtdistination;
    private Button btnJouer;
    private HomeControler homeControler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        init();
        ecouteJouer();
    }
    private void init()
    {
        txtorigine=(EditText)findViewById(R.id.txtNomorigine);
        txtdistination=(EditText)findViewById(R.id.txtNomdistination);
        btnJouer=(Button)findViewById(R.id.btnJouer);
        this.homeControler = HomeControler.getInstance(this);
//récupération des noms de joueurs
        recupPlayers();
    }
    private void ecouteJouer(){
        btnJouer.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v) {
                savePlayers(txtorigine.getText().toString(),txtdistination.getText().toString());
                activiteSuivante(txtorigine.getText().toString(),txtdistination.getText().toString());
            }
        });
    }
    private void savePlayers(String name1, String name2) {
        this.homeControler.createPlayers(name1,name2,this);
    }
    private void activiteSuivante(String nameorigine, String namedistination)
    {
        Intent intent = new Intent(HomeActivity.this, com.example.tp1.view.MainActivity.class);
        intent.putExtra("origine",nameorigine);
        intent.putExtra("distination",namedistination);
        startActivity(intent);
    }
    /**
     * récupération des noms de joueurs s'ils étaient sérialisés
     */
    private void recupPlayers(){
        if(homeControler.getPlayerName1()!= null){
            txtorigine.setText(homeControler.getPlayerName1());
            txtdistination.setText(homeControler.getPlayerName2());
        }
    }
}