package com.example.belajarandroid;

import java.util.ArrayList;

public class NovelsData {
    private static String[] heroNames = {
            "Bumi",
            "Bulan",
            "Matahari",
            "Bintang",
            "Ceroz & Batozar",
            "Komet",
            "Komet Minor",
            "Hujan",
            "About Life",
            "About You"
    };

    private static String[] heroDetail = {
            "       Namaku Raib, usiaku 15 tahun, kelas sepuluh. Aku anak perempuan seperti kalian, adik-adik kalian, tetangga kalian. Aku punya dua kucing, namanya si Putih dan si Hitam. Mama dan papaku menyenangkan. Guru-guru di sekolahku seru. Teman-temanku baik dan kompak. Aku sama seperti remaja kebanyakan, kecuali satu hal. Sesuatu yang kusimpan sendiri sejak kecil. Sesuatu yang menakjubkan. Namaku, Raib. Dan aku bisa menghilang.",
            "       Namanya Seli, usianya 15 tahun, kelas sepuluh. Dia sama seperti remaja yang lain. Menyukai hal yang sama, mendengarkan lagu-lagu yang sama, pergi ke gerai fast food, menonton serial drama, film, dan hal-hal yang disukai remaja. Tetapi ada sebuah rahasia kecil Seli yang tidak pernah diketahui siapapun. Sesuatu yang dia simpan sendiri sejak kecil. Sesuatu yang menakjubkan dengan tangannya. Namanya Seli. Dan tangannya bisa mengeluarkan petir",
            "       Namanya Ali, 15 tahun, kelas X. Jika saja orangtuanya mengizinkan, seharusnya dia sudah duduk ditingkat akhir ilmu fisika program doktor di universitas ternama. Ali tidak menyukai sekolahnya, guru-gurunya, teman-teman sekelasnya. Semua membosankan baginya. Tapi sejak dia mengetahui ada yang aneh pada diriku dan Seli, teman sekelasnya, hidupnya yang membosankan berubah seru.\n" +
                    "  Aku bisa menghilang, dan Seli bisa mengeluarkan petir. Ali sendiri punya rahasia kecil. Dia bisa berubah menjadi beruang raksasa. Kami bertiga kemudian bertualang ke tempat-tempat menakjubkan. Namanya Ali, Dia tahu sejak dulu dunia ini tidak sesederhana yang dilihat orang. Dan di atas segalanya, dia akhirnya tahu persahabatan adalah hal yang paling utama",
            "       Kami bertiga teman baik. Remaja, murid kelas sebelas. Penampilan kami sama seperti murid SMA lainnya. Tapi kami menyimpan rahasia besar. Namaku Raib, aku bisa menghilang. Seli, temen semejaku, bisa mengeluarkan petir dari telapak tangannya. Dan Ali, si biang kerok sekali si genius, bisa berubah menjadi beruang raksasa.Kami bertiga kemudian bertualang ke dunia paralel yang tidak diketahui banyak orang, yang disebut Klan Bumi, Klan Bulan, Klan Matahari, dan Klan Bintang. Kami bertemu tokoh-tokoh hebat. Penduduk klan lain. ",
            "       Awalnya kami hanya mengikuti karyawisata biasa seperti murid-murid sekolah lain. Hingga Ali dengan kegeniusannya, memutuskan menyelidiki sebuah ruangan kuno. Kami tiba dibagian dunia paralel lainnya, menemui petarung kuat, mendapat kekuatan baru serta teknik-teknik menakjubkan. Dunia paralel ternyata sangat luas, dengan begitu banyak orang hebat didalamnya",
            "       Setelah 'musuh besar' kami lolos, dunia paralel dalam situasi genting. Hanya soal waktu, kapan pun pertempuran besar akan terjadi. Bagaimana jika ribuan petarung yang bisa menghilang, mengeluarkan petir, termasuk teknologi maju lainnya muncul di permukaan Bumi? Tidak ada yang bisa membayangkan kekacauan yang akan terjadi. Situasi menjadi lebih rumit lagi saat Ali, pada detik terakhir, melompat ke portal menuju Klan Komet. Kami bertiga tersesat di klan asing untuk mencari pusaka paling hebat di dunia paralel",
            "       Pertarungan melawan si Tanpa Mahkota akan berakhir di sini. Siapapun yang menang, semua berakhir di sini, di Klan Komet Minor, tempat aliansi Para Pemburu pernah dibentuk, dan pusaka hebat pernah diciptakan. Dalam saga terakhir melawan si Tanpa Mahkota, aku, Seli, dan Ali menemukan teman seperjalanan yang hebat. Bersama-sama kami melewati berbagai rintangan, memahami banyak hal, berlatih teknik baru, dan bertarung bersama-sama. Inilah kisah kami. Tentang persahabatan sejati. Tentang pengorbanan. Tentang ambisi. Tentang memaafkan. Namaku Raib, dan aku bisa menghilang",
            "       Bukan melupakan yang jadi masalahnya. Tapi menerima. Barangsiapa yang bisa menerma, dia akan bisa melupakan, hidup bahagia. Tapi jika dia tidak bisa menerima, dia tidak akan pernah bisa melupakan",
            "       Ada masanya kita butuh diam. Tidak bisa bicara apa pun, tidak bicara pada siapa pun. Cukup direnungkan dalam-dalam, kemudian kita akhirnya paham banyak hal. Pun ada masanya, saat membaca buku, melihat kembali kutipan-kutipan lama, direnungkan, kita bisa menemukan banyak hal yang mengembalikan pemahaman terbaiknya",
            "       Buku “Tentang Kamu” ini menceritakan tentang seorang pengacara Thompson & Co. bernama Zaman Zulkarnaen yang sedang menyelesaikan sebuah kasus hukum yang berhubungan dengan pembagian warisan seseorang yang bernama Sri Ningsih. Jumlah warisannya tergolong jumlah warisan yang banyak. Dengan hanya berbekal sebuah buku diary milik Sri Ningsih, Zaman mencoba untuk mencari pewaris sah dari warisan yang ditinggalkan oleh Sri Ningsih."
    };

    private static int[] heroesImages = {
            R.drawable.bumi,
            R.drawable.bulan,
            R.drawable.matahari,
            R.drawable.bintang,
            R.drawable.cerosbatozar,
            R.drawable.komet,
            R.drawable.kometminor,
            R.drawable.hujan,
            R.drawable.aboutlife,
            R.drawable.aboutyou
    };

    static ArrayList<Novel> getListData(){
        ArrayList<Novel> list = new ArrayList<>();
        for (int position = 0; position < heroNames.length; position++){
            Novel novel = new Novel();
            novel.setName(heroNames[position]);
            novel.setSinopsis(heroDetail[position]);
            novel.setPhoto(heroesImages[position]);
            list.add(novel);
        }
        return list;
    }
}

