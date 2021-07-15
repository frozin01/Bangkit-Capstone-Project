package com.u1.capstoneproject.data

object DummyBuilder {

    fun generateSuhuData() : List<DummyData>{
        val suhu = ArrayList<DummyData>()
        suhu.add(DummyData(
            "Mei\n2021",
                28.96,
                "Celsius"
        ))

        suhu.add(DummyData(
            "Juni\n2021",
            27.3,
            "Celsius"
        ))

        suhu.add(DummyData(
            "Juli\n2021",
            26.5,
            "Celsius"
        ))

        suhu.add(DummyData(
            "Agustus\n2021",
            28.0,
            "Celsius"
        ))

        return suhu
    }

    fun generateKelembapanData() : List<DummyData>{
        val kelembapan = ArrayList<DummyData>()
        kelembapan.add(DummyData(
            "Mei\n2021",
            77.0,
            "RH"
        ))

        kelembapan.add(DummyData(
            "Juni\n2021",
            80.6,
            "RH"
        ))

        kelembapan.add(DummyData(
            "Juli\n2021",
            82.3,
            "RH"
        ))

        kelembapan.add(DummyData(
            "Agustus\n2021",
            78.12,
            "RH"
        ))

        return kelembapan
    }

    fun generateCurahHujanData() : List<DummyData>{
        val curahHujan = ArrayList<DummyData>()
        curahHujan.add(DummyData(
            "Mei\n2021",
            17.45,
            "mm"
        ))

        curahHujan.add(DummyData(
            "Juni\n2021",
            13.21,
            "mm"
        ))

        curahHujan.add(DummyData(
            "Juli\n2021",
            11.15,
            "mm"
        ))

        curahHujan.add(DummyData(
            "Agustus\n2021",
            10.23,
            "mm"
        ))

        return curahHujan
    }

    fun generateLamaPenyinaranData() : List<DummyData>{
        val lamaPenyinaran = ArrayList<DummyData>()
        lamaPenyinaran.add(DummyData(
                "Mei\n2021",
                6.45,
                "Jam"
        ))

        lamaPenyinaran.add(DummyData(
                "Juni\n2021",
                8.13,
                "Jam"
        ))

        lamaPenyinaran.add(DummyData(
                "Juli\n2021",
                9.15,
                "Jam"
        ))

        lamaPenyinaran.add(DummyData(
                "Agustus\n2021",
                10.23,
                "Jam"
        ))

        return lamaPenyinaran
    }

}