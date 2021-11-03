package com.example.feedtela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ImageSlider = findViewById<ImageSlider>(R.id.imageSlider)

        val imageList = ArrayList<SlideModel>()

        imageList.add(
            SlideModel(
                "https://2.bp.blogspot.com/-zpcsSr5WrWk/XK87X-o3-NI/AAAAAAAAGLE/96PHKRKYESgibGMP556SnNiotBrOFLYugCLcBGAs/s1600/12.jpg", "Foto 1"
            )
        )
        imageList.add(
            SlideModel(
                "https://s2.glbimg.com/q-hBcTCnARdzkDLXEHg5zYWa2Ac=/0x0:1920x1080/1008x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_59edd422c0c84a879bd37670ae4f538a/internal_photos/bs/2021/Y/E/F9xLLERdejSPh3jZpgBA/halloween-kills-foto2.jpg",
               "Foto 2"
            )
        )
        imageList.add(
            SlideModel(
                "https://static.wikia.nocookie.net/scream/images/d/d4/Scream_xlg.jpg/revision/latest?cb=20160316033407",
                "Foto 3"
            )
        )
        imageList.add(
            SlideModel(
                "https://images-na.ssl-images-amazon.com/images/S/pv-target-images/6c874643282f193218e48214338698151c814c3fb0e7cd9a10b267eba6adfe69._RI_V_TTW_.jpg",
                 "Foto 4"
            )
        )
        imageList.add(
            SlideModel(
                "https://play-lh.googleusercontent.com/K15zn147jY8MnH4zbv1KInUH_EWUXTxa0m5AG9vKB3za_sARsp73e1yk1gXQsQqovaIL",
                "Foto 5"
            )
        )

        ImageSlider.setImageList(imageList, ScaleTypes.FIT)
    }

}