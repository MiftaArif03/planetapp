package com.example.miftaarif.belajar.planet;

import java.util.ArrayList;

public class data_planet {
    public static String[][] data = new String[][]{
            {"Planet Merkurius", "Nama Merkurius berasal dari nama dewa kurir dari kerajaan Romawi","https://res.cloudinary.com/dluiva9pz/image/upload/v1559516254/Merkurius_zw49v1.jpg","Planet Merkurius ialah sebuah planet yang memiliki letak paling dekat dengan Matahari, hal ini membuat suhu permukaan pada siang hari dapat mencapai 400 derajat celcius, namun disaat malam hari akan turun hingga mencapai 180 derajat celcius."},
            {"Planet Venus", "Venus berasal dari nama dewi cinta dan kecantikan dari bangsa Romawi.", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516255/venus_m6tmqg.jpg", "Planet Venus dikenal dengan bintang sore ataupun bintang kejora, hal ini karena Planet Venus dapat kita amati pada waktu petang hari dan juga saat sebelum matahari terbit. Planet Venus terlihat seperti bintang pada saat langit malam, hal ini karena Planet Venus mempunyai lapisan atmosfer yang tebal serta dapat untuk memantulkan sinar matahari dengan baik."},
            {"Planet Bumi", "Pengertian planet Bumi merupakan sebuah planet yang dapat untuk dihuni", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516254/bumi_g8gfci.jpg","Planet Bumi mempunyai suhu yang relatif tetap. Suhu di Planet Bumi dapat menjaga agar tetap air tersedia dalam bentuk cair serta dapat menjaga berbagai macam organisme penghasil oksigen tetap hidup. Tebal dari atmosfer Planet Bumi dapat mencapai 700 km yang sebagian besar atmosfer tersebut adalah nitrogen dan oksigen. Lebih dari 70% permukaan Bumi merupakan air dan sisanya berupa daratan."},
            {"Planet Mars", "Planet Mars berasal dari nama dewa perang serta legenda dari bangsa Romawi", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516251/Mars_owkv4l.jpg", "Planet Mars dijuluki dengan sebutan planet merah. Hal ini karena permukaan Planet Mars memiliki warna merah yang berasal dari besarnya berkarat yang terdapat dalam seluruh permukaan dari Planet Mars tersebut. Permukaan Mars terdiri atas gunung-gunung berapi yang berukuran besar, lapisan es, lembah, serta sungai kering. Planet Mars mempunyai 2 buah satelit yang berukuran kecil, yaitu Phobos dan Deimos."},
            {"Planet Yupiter", "Planet Yupiter atau Planet Zeus berasal dari nama raja dewa-dewa dari bangsa Yunani kuno.", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516252/planet-jupiter_e3ozhg.jpg","Pengertian planet Yupiter merupakan planet terbesar dalam tata surya kita. Planet Yupiter memiliki diameter sekitar 11 kali dari diameter Bumi dan memiliki yang berat sekitar dua kali dari jumlah berat seluruh planet yang ada dalam tata surya. Permukaan dari Planet Yupiter diselimuti awan tebal yang sebagian besarnya terbentuk dari gas hidrogen dan helium"},
            {"Planet Saturnus", "Satu-satunya planet yang dikelilingi cincin", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516252/saturnus_fjhyxs.jpg", "Planet Saturnus tidak padat, hal ini karena sebagian besar penyusunnya adalah gas helium dan hidrogen. Hanya di bagian inti Planet Saturnus yang sangat kecil terdapat batu padat. Angin di Planet Saturnus sangat kencang dibandingkan dengan badai yang terjadi di Bumi. Angin dapat berputar-putar tanpa henti dibagian ekuator dan memiliki kecepatan hingga 1.100 km/jam."},
            {"Planet Uranus", "Planet Uranus diambil dari nama dewi langit Yunani kuno, yaitu Urania", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516256/uranuss_qms6qz.png","Planet Uranus berjarak sekitar 2.872 km dari Matahari, sehingga dapat melakukan satu kali revolusi yang dibutuhkan sekitar 84 tahun. Letak uranus sangatlah jauh dari Matahari, hal ini dapat membuat permukaan Planet Uranus sangat dingin. Sinar Matahari membutuhkan waktu guna mencapai Bumi sekitar 8 menit, dibandingkan dengan Planet Uranus membutuhkan waktu sekitar 2,5 jam."},
            {"Planet Neptunus", "Planet Neptunus memiliki warna yang tampak cerah biru kehijauan.", "https://res.cloudinary.com/dluiva9pz/image/upload/v1559516252/d6409a689772b30b6dcc5fef63889dcb_600x400_vjuxf4.jpg","Pengertian planet Neptunus dapat disebut sebagai planet pembuat ulah, hal ini karena Planet Neptunus sering beredar keluar dari garis orbitnya. Planet Neptunus dikenal sebagai kembaran dari Planet Uranus. Atmosfer di Planet Neptunus terdiri atas 1,5% metana, 19% helium, dan 80% hidrogen. Permukaan dari Planet Neptunus tertutup oleh lapisan es yang sangat tebal. Suhunya mencapai sekitar -223 derajat celcius."}
    };

    public static ArrayList<Planet> getListData(){
        Planet planet = null;
        ArrayList<Planet> list = new ArrayList<>();
        for (int i = 0; i < data.length; i++) {
            planet = new Planet();
            planet.setNama(data[i][0]);
            planet.setKeterangan(data[i][1]);
            planet.setFoto(data[i][2]);
            planet.setDetail(data[i][3]);
            list.add(planet);
        }
        return list;

    }

}
