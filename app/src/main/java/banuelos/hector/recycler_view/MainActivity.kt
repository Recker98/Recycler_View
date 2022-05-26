package banuelos.hector.recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    val personaje=listOf(
        Personajes("Bender","Futurama","https://www.latercera.com/resizer/bmyvJHEs3R3fOU-hTWWM2cw7h5o=/900x600/filters:focal(384x213:394x203)/cloudfront-us-east-1.images.arcpublishing.com/copesa/TKAHPZ4KDBAKFFTPIROL6SPFVY.png"),
        Personajes("Homero","Los Simpsons","https://phantom-marca.unidadeditorial.es/b49257bc273e53832a8a0c23832d577c/resize/660/f/webp/assets/multimedia/imagenes/2021/05/12/16208494355539.jpg"),
        Personajes("Rick","Rick y Morty","https://www.geekmi.news/__export/1626821131805/sites/debate/img/2021/07/20/rick4_2.jpg_375108060.jpg"),
        Personajes("Spiderman","Sorprendente Hombre Araña","https://www.cinemascomics.com/wp-content/uploads/2022/03/Spider-Man-No-Way-Home-traje-final.jpg")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}