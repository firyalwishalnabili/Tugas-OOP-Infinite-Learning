package id.infinitelearning.KotlinSubmission.exercise4

fun main() {


    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    fun hitungLuas(sisi: Int): Int {
        if (sisi <= 0) {
            throw IllegalArgumentException("Sisi harus lebih dari 0")
        }
        return sisi * sisi
    }

    try {
        val sisi1 = 99
        val luas1 = hitungLuas(sisi1)
        println("Luas persegi dengan sisi $sisi1 adalah $luas1")

        val sisi2 = -1
        val luas2 = hitungLuas(sisi2)
        println("Luas persegi dengan sisi $sisi2 adalah $luas2") //Ini nanti gak bisa karena gak lebih dari 0
    } catch (e: IllegalArgumentException) {
        println("Kesalahan : ${e.message}")
    } finally {
        println("Ya ini pokoknya jalan")
    }
}
