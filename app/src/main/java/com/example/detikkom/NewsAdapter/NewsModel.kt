package com.example.myapplication.NewsAdapter

import com.example.detikkom.R

data class news(var tittle:String, var desc:String, var image:Int  )

object NewsModel{
    val newslist = listOf<news>(
        news("Pasar ramai pengunjung walaipun firus corona sedang merebak", "pada zaman ini, firus corona memang sedang merebak dan sayang sekali, warga warga masuih tak acuh akan masalah ini. Warga warga masih banyak yang mendatangi pasar dan tanpa mengenakan alat pelindung", R.drawable.img_news1),
        news(  "Pasar Apung Kembali Beroprasi", "dengan menyebarkannya firus corona, banyak sekali pasar pasar yang dipaksa untuk tutup guna menghindari gejla firus tersebut. Namun, setela beberapa bulan menjelang, Firus ini sudah mulai mereda dan salah satu pasar Apung sudah mulai kembali beroprasi.", R.drawable.img_news2),
        news(  "Era Baru, Era New Normal", "sekarang dunia sudah mulai memasuki era baru yaitu era New Normal. Era di mana orang orang beraktivitas seperti biasa namun dengan di lengkapi perlengkapan keselamatan guna menghindari penyebaran firus COVID 19. banyak sekali kantor kantor yang sudah membukakan pintun untuk para pegawai dengan syarat perlengkapn keselamatan lengkapr.", R.drawable.img_news3),
        news(  "kembali padatnya lalulintas jakarta",   "di Era new normal, warga sudah mulai merambati jalan jalan di kota. dengan ini, sudah mulai banyak kendaraan yang memenuhi jalan jalan di kota besar seperti jakarta. di haoar agar warga tidak menganggap remeh peraturan new normal di karenakan bisa berdampak fatal.", R.drawable.img_news4),
        news(  "sumbangan dari salah seorang donatur",   "di karenakan para warga di sulitkan dengan keadaan ekonomi indonesia yang sangat berantakan, banyak donatur bermunculan dan itu sangat berdampak baik untuk warga warga.",  R.drawable.img_news5),
        news(  "Persetujuan penduduk kantor",  "telah keluar banyak sekali peraturan peraturan yang mendasari kegiatan new normal. dan di sini sudah di sepakati banyak sekali pihak dan akan di selenggarakan di bulan bulan mendatang", R.drawable.img_news6),
        news(  "trump, sang tampan",   "banyak dari kita sudah mengetahui bahwa president United state of america telah menyatakan perang terhadap rusia. ini dapt memicu peprangan besar yang akan berlangsung sangat parah.", R.drawable.img_news7),
        news(  "kekacauan di negara paman sam",   "telah terjadinya kekacauan yang terjadi di amerika serikat di karenakan oleh banyaknya ketidak adilan atas ras ulit hitam. banyak warga warga yang tidak terima akhirnya mendobrak batas dan menyebabkan kekcauan.", R.drawable.img_news8),
        news("kabah, rumah umat muslim sementara di tutup untuk umum", "di karenakan merebaknya COVID 19, kabah, rumah parah muslimin di dunia terpaksa di tutup guna menghindari penyebaran dari kontak fisik yang terjadi di sana,", R.drawable.img_news9)
    )

}