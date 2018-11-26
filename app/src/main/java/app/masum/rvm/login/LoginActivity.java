package app.masum.rvm.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import app.masum.rvm.R;
import app.masum.rvm.google_map.MapsActivity;

public class LoginActivity extends AppCompatActivity {
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btn_login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //login condition here
                //if login success..
                //going to map activity
                startActivity(new Intent(LoginActivity.this, MapsActivity.class));


                //else
                //error message..
            }
        });
    }
}
