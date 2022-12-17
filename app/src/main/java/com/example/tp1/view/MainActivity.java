package com.example.tp1.view;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.tp1.R;
import com.example.tp1.controler.Controler;

public class MainActivity extends AppCompatActivity {

    private TextView txtResultat;
    private TextView txtTurnorigine, txtTurndistination;

    private Button btnRetour;
    private Button btnRejouer;
    private Controler controler;
    private String nameorigine;
    private String namedistination;
    private int valeurAchercher;
    private int playerTurn = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getPlayersNames();
        init();
        txtResultat.setText(this.controler.getResponse());
        ecouteRetour();
        this.controler = Controler.getInstance();
    }
    private void getPlayersNames() {
        Intent intent = getIntent();
        nameorigine = intent.getStringExtra("origine");
        namedistination = intent.getStringExtra("distination");
    }
    private void init()
    {

        txtResultat=(TextView)findViewById(R.id.txtResultat);

        btnRetour=(Button)findViewById(R.id.btnRetour);

        txtTurnorigine.setText(nameorigine);
        btnRejouer=(Button)findViewById(R.id.btnRejouer);
        txtTurnorigine.setBackgroundResource(R.drawable.player_turn_border_form);
        txtTurndistination.setText(namedistination);

        txtResultat.setText("");
        valeurAchercher=(int)(Math.random() * 100) +1;
    }



    //** * Retour * */
    private void ecouteRetour()
    {
        btnRetour.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
        btnRejouer.setOnClickListener(new Button.OnClickListener()
        {
            public void onClick(View v)
            {
                Intent intent = new Intent(MainActivity.this, review.class);
                startActivity(intent);
            }
        });
    }
}