package gntng.wafi.com.kelas8d;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    int ID_SISWA;
    TextView tvNamaSiswa, tvDetailSiswa;
    ImageView ivSiswa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        tvNamaSiswa = findViewById(R.id.tvNamaSiswa);
        tvDetailSiswa = findViewById(R.id.tvDeskripsi);
        ivSiswa = findViewById(R.id.ivFoto);

        ID_SISWA = getIntent().getIntExtra("KEY_ID", 0);
        if (ID_SISWA == 0){
            tvNamaSiswa.setText(getString(R.string.aWafi));
            tvDetailSiswa.setText(getString(R.string.aWafiDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.wafiganteng));
        } else if (ID_SISWA == 1){
            tvNamaSiswa.setText(getString(R.string.aMiqdad));
            tvDetailSiswa.setText(getString(R.string.aMiqdadDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.miqdadganteng));
        } else if (ID_SISWA == 2){
            tvNamaSiswa.setText(getString(R.string.aGharyn));
            tvDetailSiswa.setText(getString(R.string.aGharynDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.gharynganteng));
        } else if (ID_SISWA == 3){
            tvNamaSiswa.setText(getString(R.string.aHarits));
            tvDetailSiswa.setText(getString(R.string.aHaritsDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.haritsganteng));
        } else if (ID_SISWA == 4){
            tvNamaSiswa.setText(getString(R.string.aHilmi));
            tvDetailSiswa.setText(getString(R.string.aHilmides));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.hilmiganteng));
        } else if (ID_SISWA == 5){
            tvNamaSiswa.setText(getString(R.string.aByan));
            tvDetailSiswa.setText(getString(R.string.aByanDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.byanganteng));
        } else if (ID_SISWA == 6){
            tvNamaSiswa.setText(getString(R.string.aAdil));
            tvDetailSiswa.setText(getString(R.string.aAdilDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.adilganteng));
        } else if (ID_SISWA == 7){
            tvNamaSiswa.setText(getString(R.string.aAkmal));
            tvDetailSiswa.setText(getString(R.string.aAkmalDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.akmalganteng));
        } else if (ID_SISWA == 8){
            tvNamaSiswa.setText(getString(R.string.aAqsha));
            tvDetailSiswa.setText(getString(R.string.aAqshaDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.aqshaganteng));
        } else if (ID_SISWA == 9){
            tvNamaSiswa.setText(getString(R.string.aFadhlan));
            tvDetailSiswa.setText(getString(R.string.aFadhlanDes));
            ivSiswa.setImageDrawable(ContextCompat.getDrawable(getApplicationContext(), R.drawable.fadhlanganteng));
        }

    }
}
