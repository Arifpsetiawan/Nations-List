package id.apuse.list.model;

import java.util.ArrayList;

import id.apuse.list.R;

public class NationData {
    private static String[] nationName = {
            "Cote d'Ivoire",
            "France",
            "Germany",
            "Indonesia",
            "Italy",
            "Nedherlands",
            "Nigeria",
            "Poland",
            "Russia",
            "Thailand"
    };

    private static String[] nationDetail = {
            "Pantai Gading adalah sebuah negara di Afrika Barat yang berbatasan dengan Liberia, Guinea, Mali, Burkina Faso, dan Ghana di sebelah barat, utara dan timur serta dengan Teluk Guinea di sebelah selatan.",
            "Republik Prancis atau Prancis adalah sebuah negara yang teritori metropolitannya terletak di Eropa Barat dan juga memiliki berbagai pulau dan teritori seberang laut yang terletak di benua lain.",
            "Republik Federal Jerman adalah negara berbentuk federasi di Eropa Barat. Negara ini memiliki posisi ekonomi dan politik yang sangat penting di Eropa maupun di dunia.",
            "Republik Indonesia atau Negara Kesatuan Republik Indonesia, atau lebih umum disebut Indonesia, adalah negara di Asia Tenggara yang dilintasi garis khatulistiwa dan berada di antara daratan benua Asia dan Australia, serta antara Samudra Pasifik dan Samudra Hindia.",
            "Italia, resminya Republik Italia bahasa Italia: Repubblica Italiana, adalah sebuah negara kesatuan republik parlementer di Eropa Terletak di jantung Laut Mediterania. Italia berbatasan dengan Prancis, Swiss, Austria, Slovenia, San Marino dan Vatikan.",
            "Belanda adalah sebuah negara peserta Kerajaan Belanda, yang terdiri dari dua belas provinsi di Eropa Barat Laut, dan tiga pulau di Karibia. Kata Belanda dalam bahasa Indonesia adalah pinjaman yang cacat dari kosakata Portugis: holanda, olanda, wolanda, bolanda, dan terakhir menjadi belanda.",
            "Republik Federal Nigeria adalah sebuah negara di Afrika Barat. Negara ini berbatasan dengan Benin di sebelah barat, Chad dan Kamerun di sebelah timur, Niger di sebelah utara dan Teluk Guinea di sebelah selatan. Kota-kota penting termasuk Abuja, bekas ibu kota Lagos, Abeokuta, Ibadan, Port Harcourt dan Jos.",
            "Polandia adalah sebuah negara republik di Eropa Tengah yang berbatasan dengan Jerman di sebelah barat Perbatasan Oder-Neisse, Ceko, dan Slowakia di sebelah selatan, Rusia (Kaliningrad), Lituania di sebelah timur laut dan Belarus serta Ukraina di sebelah barat (Garis Curzon). Polandia adalah negara anggota Uni Eropa.",
            "Federasi Rusia, umumnya disebut Rusia, adalah sebuah negara berdaulat yang membentang dengan luas di sebelah timur Eropa dan utara Asia. Dengan wilayah seluas 17.125.200 km², Rusia adalah negara terluas di dunia.",
            "Bongbkeng Kerajaan Thai, yang lebih sering disebut Thailand dalam bahasa Inggris, atau dalam bahasa aslinya Mueang Thai, adalah sebuah negara di Asia Tenggara yang berbatasan dengan Laos dan Kamboja di timur, Malaysia dan Teluk Siam di selatan, dan Myanmar dan Laut Andaman di barat."
    };

    private static int[] nationImage = {
            R.drawable.cote_divoire,
            R.drawable.france,
            R.drawable.germany,
            R.drawable.indonesia,
            R.drawable.italy,
            R.drawable.netherlands,
            R.drawable.nigeria,
            R.drawable.poland,
            R.drawable.russia,
            R.drawable.thailand
    };

    public static ArrayList<Nation> getListData() {
        ArrayList<Nation> list = new ArrayList<>();
        for (int position = 0; position < nationName.length; position++) {
            Nation nation = new Nation();
            nation.setName(nationName[position]);
            nation.setDetail(nationDetail[position]);
            nation.setPhoto(nationImage[position]);
            list.add(nation);
        }
        return list;
    }
}
