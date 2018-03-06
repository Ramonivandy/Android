package ramonivandy.faktaunik;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class FaktaUnikActivity extends AppCompatActivity {

    private TextView mFaktaTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final String[] kumpulanFakta = {
                "Kobaiy adalah jelmaan lele",
                "Gon dan Gin adalah kucing",
                "Bocah cina 1 + 1 = 3",
                "Dan lain lainnya"
        };

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fakta_unik);

        mFaktaTextView = findViewById(R.id.faktaText);
        Button mTampilkanFaktaButton = findViewById(R.id.nextFaktaButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fakta = "";
                Random randomGenerator = new Random();
                int randomNumber;
                randomNumber = randomGenerator.nextInt(kumpulanFakta.length);
                switch (fakta = kumpulanFakta[randomNumber]) {
                }
                mFaktaTextView.setText(fakta);
            }
        };
        mTampilkanFaktaButton.setOnClickListener(listener);


    }
}
