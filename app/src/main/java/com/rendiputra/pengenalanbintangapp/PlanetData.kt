package com.rendiputra.pengenalanbintangapp

object PlanetData {
    private val planetNames = arrayOf(
        "Matahari", // matahari
        "Merkurius",

    )

    private val planetJenis = arrayOf(
        "Bintang", // matahari
        "Planet",
    )

    private val planetDetails = arrayOf(
        "\t\t\tMatahari atau Surya adalah bintang di pusat tata surya. Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet. Diameternya sekitar 1.392.684 km, kira-kira 109 kali diameter Bumi, dan massanya (sekitar 2×1030 kilogram, 330.000 kali massa Bumi) mewakili kurang lebih 99,86 % massa total tata surya.\n\n\t\t\tSecara kimiawi, sekitar tiga perempat massa matahari terdiri dari hidrogen, sedangkan sisanya didominasi helium. Sisa massa tersebut (1,69%, setara dengan 5.629 kali massa Bumi) terdiri dari elemen-elemen berat seperti oksigen, karbon, neon, dan besi.", // matahari
        "\t\t\tMerkurius adalah planet terkecil di Tata Surya sekaligus yang terdekat dari Matahari. Periode revolusi planet ini merupakan yang terpendek dari semua planet di Tata Surya, yakni 87,79 hari. Planet ini dinamai menurut nama dewa Merkurius, sang pembawa pesan para dewa dalam mitologi Romawi. \n\n\t\t\tSeperti halnya Venus, Merkurius merupakan planet inferior yang letak orbitnya berada di sebelah dalam orbit Bumi, dan ketika diamati dari Bumi, jarak sudutnya dari Matahari tidak pernah melebihi 28°. Karena jarak yang dekat dengan Matahari, planet ini hanya dapat dilihat di dekat ufuk barat setelah matahari terbenam atau ufuk timur sebelum matahari terbit, atau biasanya ketika aram. Merkurius akan tampak seperti bintang yang terang jika diamati pada waktu tersebut, tetapi sering kali jauh lebih sulit untuk diamati daripada Venus. Jika diamati dari teleskop, Merkurius akan menampilkan serangkaian fase yang mirip dengan fase Venus dan Bulan, ketika bergerak di orbit bagian dalamnya yang relatif terhadap Bumi dan terjadi berulang dalam satu siklus sinodiknya, yakni sekitar 116 hari."
    )

    private val planetImages = arrayOf(
        "https://images.bisnis-cdn.com/posts/2021/07/23/1421103/matahari.jpg", // matahari
        "https://asset-a.grid.id/crop/109x0:1279x741/700x465/photo/2018/12/11/2445410172.jpg" // merkurius
    )

    private val planetJariJari = arrayOf(
        ": 695.700 KM", // matahari
        ": 2.439,7 ± 1,0 km", // merkurius
    )

    private val planetLuasPermukaan = arrayOf(
        ": 4,379×10^6 km^2", // matahari
        ": 7,48×10^7 km^2", // merkurius
    )

    private val planetVolume = arrayOf(
        ": 1.300.000 × Bumi", // matahari
        ": 6,083×1010 km^3", // merkurius
    )

    private val planetMassa = arrayOf(
        ": 333.000 × Bumi", // matahari
        ": 3,3022×10^23 kg", // merkurius
    )

    private val planetAtmosfer = arrayOf(
        ":\tHidrogen (73,46%) \n\tHelium (24,85) \n\tOksigen (0,77%) \n\tKarbon (0,29%) \n\tBesi (0,16%) \n\tNeon (0,12%) \n\tNitrogen (0,09%) \n\tSilikon (0,07%) \n\tMagnesium (0,05%) \n\tBelerang (0,04%)", // matahari
        ":\tOksigen (42,0%) \n" +
        "\tNatrium (29,0%) \n" +
        "\tHidrogen (22,0%) \n" +
        "\tHellium (6,0%) \n" +
        "\tKalium (0,5%) ", // merkurius
    )



    val listData: ArrayList<Planet>
        get() {
            val list = arrayListOf<Planet>()
            for (position in planetNames.indices) {
                val planet = Planet()
                planet.name = planetNames[position]
                planet.detail = planetDetails[position]
                planet.jenis = planetJenis[position]
                planet.photo = planetImages[position]
                planet.jariJari = planetJariJari[position]
                planet.luasPermukaan = planetLuasPermukaan[position]
                planet.volume = planetVolume[position]
                planet.massa = planetMassa[position]
                planet.atmosfer = planetAtmosfer[position]
                list.add(planet)
            }
            return list
        }
}