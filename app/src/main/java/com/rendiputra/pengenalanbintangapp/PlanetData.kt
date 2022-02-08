package com.rendiputra.pengenalanbintangapp

object PlanetData {
    private val planetNames = arrayOf(
        "Matahari", // matahari
        "Merkurius", // merkurius
        "Venus", // venus

    )

    private val planetJenis = arrayOf(
        "Bintang", // matahari
        "Planet", // merkurius
        "Planet", // venus
    )

    private val planetDetails = arrayOf(
        "\t\t\tMatahari atau Surya adalah bintang di pusat tata surya. Bentuknya nyaris bulat dan terdiri dari plasma panas bercampur medan magnet. Diameternya sekitar 1.392.684 km, kira-kira 109 kali diameter Bumi, dan massanya (sekitar 2×1030 kilogram, 330.000 kali massa Bumi) mewakili kurang lebih 99,86 % massa total tata surya.\n\n\t\t\tSecara kimiawi, sekitar tiga perempat massa matahari terdiri dari hidrogen, sedangkan sisanya didominasi helium. Sisa massa tersebut (1,69%, setara dengan 5.629 kali massa Bumi) terdiri dari elemen-elemen berat seperti oksigen, karbon, neon, dan besi.", // matahari
        "\t\t\tMerkurius adalah planet terkecil di Tata Surya sekaligus yang terdekat dari Matahari. Periode revolusi planet ini merupakan yang terpendek dari semua planet di Tata Surya, yakni 87,79 hari. Planet ini dinamai menurut nama dewa Merkurius, sang pembawa pesan para dewa dalam mitologi Romawi. \n\n\t\t\tSeperti halnya Venus, Merkurius merupakan planet inferior yang letak orbitnya berada di sebelah dalam orbit Bumi, dan ketika diamati dari Bumi, jarak sudutnya dari Matahari tidak pernah melebihi 28°. Karena jarak yang dekat dengan Matahari, planet ini hanya dapat dilihat di dekat ufuk barat setelah matahari terbenam atau ufuk timur sebelum matahari terbit, atau biasanya ketika aram. Merkurius akan tampak seperti bintang yang terang jika diamati pada waktu tersebut, tetapi sering kali jauh lebih sulit untuk diamati daripada Venus. Jika diamati dari teleskop, Merkurius akan menampilkan serangkaian fase yang mirip dengan fase Venus dan Bulan, ketika bergerak di orbit bagian dalamnya yang relatif terhadap Bumi dan terjadi berulang dalam satu siklus sinodiknya, yakni sekitar 116 hari.", // merkurius
        "\t\t\tVenus adalah planet terdekat kedua dari Matahari setelah Merkurius. Planet ini mengorbit Matahari selama 224,7 hari Bumi. Venus tidak memiliki satelit alami dan dinamai dari dewi cinta dan kecantikan dalam mitologi Romawi. Setelah Bulan, planet ini merupakan objek alami tercerah di langit malam, dengan magnitudo tampak sebesar −4,6 yang cukup cerah untuk menghasilkan bayangan. Venus merupakan planet inferior dengan sudut elongasi yang mencapai 47,8°. Kecerahan maksimal planet ini dapat dilihat segera sebelum matahari terbit atau setelah matahari terbenam, sehingga disebut Bintang Fajar atau Bintang Senja. \n\n\t\t\tVenus adalah planet kebumian dan kadang-kadang disebut “planet saudara” Bumi karena ukuran, gravitasi, dan komposisi yang mirip (Venus merupakan planet terdekat dari Bumi dan planet yang ukurannya paling mendekati Bumi). Namun, dalam hal lain planet ini sangat berbeda dari Bumi. Planet ini memiliki atmosfer terpadat di antara empat planet kebumian yang terdiri dari 96% karbon dioksida. Tekanan atmosfer permukaan Venus 92 kali lebih besar daripada Bumi. Dengan rata-rata suhu permukaan sebesar 735 K (462 °C; 863 °F), Venus merupakan planet terpanas di Tata Surya. Planet ini tidak memiliki siklus karbon yang memerangkap karbon dalam batuan dan kenampakan permukaan, dan juga tidak memiliki kehidupan organik yang dapat menyerap karbon dalam bentuk biomassa. Venus diselimuti oleh lapisan buram yang terdiri dari awan asam sulfat yang sangat reflektif, sehingga permukaannya tidak dapat dilihat dari luar angkasa. Venus mungkin pernah memiliki samudra, namun samudra tersebut menguap karena peningkatan suhu yang disebabkan oleh efek rumah kaca berketerusan. Sebagian besar air mungkin telah terfotodisosiasi, dan angin matahari telah membuat hidrogen bebas mengalami pelepasan ke luar angkasa sebagai akibat dari ketiadaan medan magnet internal di Venus. Permukaan Venus sendiri bergurun, kering, dan diselingi oleh batuan yang diperbarui secara periodik oleh aktivitas vulkanik.", // Venus
    )

    private val planetImages = arrayOf(
        "https://images.bisnis-cdn.com/posts/2021/07/23/1421103/matahari.jpg", // matahari
        "https://asset-a.grid.id/crop/109x0:1279x741/700x465/photo/2018/12/11/2445410172.jpg", // merkurius
        "https://cdn0-production-images-kly.akamaized.net/y6PZ9wTaNWuqpT0-zuBEYX3HZzs=/0x0/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/1292240/original/074682000_1468915840-venus.jpg", // venus
    )

    private val planetJariJari = arrayOf(
        ": 695.700 KM", // matahari
        ": 2.439,7 ± 1,0 km", // merkurius
        ": 6.051,8 ± 1,0 km", // Venus
    )

    private val planetLuasPermukaan = arrayOf(
        ": 4,379×10^6 km^2", // matahari
        ": 7,48×10^7 km^2", // merkurius
        ": 4,60×10^8 km^2", // Venus
    )

    private val planetVolume = arrayOf(
        ": 1.300.000 × Bumi", // matahari
        ": 6,083×1010 km^3", // merkurius
        ": 6,083×1010 km^3", // Venus
    )

    private val planetMassa = arrayOf(
        ": 333.000 × Bumi", // matahari
        ": 3,3022×10^23 kg", // merkurius
        ": 9,28×1011 km^3", // Venus
    )

    private val planetAtmosfer = arrayOf(
        ":\tHidrogen (73,46%) \n\tHelium (24,85%) \n\tOksigen (0,77%) \n\tKarbon (0,29%) \n\tBesi (0,16%) \n\tNeon (0,12%) \n\tNitrogen (0,09%) \n\tSilikon (0,07%) \n\tMagnesium (0,05%) \n\tBelerang (0,04%)", // matahari
        ":\tOksigen (42,0%) \n" +
        "\tNatrium (29,0%) \n" +
        "\tHidrogen (22,0%) \n" +
        "\tHellium (6,0%) \n" +
        "\tKalium (0,5%) ", // merkurius
        ":\tKarbon dioksida (96,5%) \n\tNitrogen (3,5%) \n\tSulfur dioksida (0,015%) \n\tArgon (0,007%) \n\tUap air (0,002%) \n\tKarbon monoksida (0,0017%) \n\tHelium (0,0012%) \n\tNeon (0,0007%)", // venus

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