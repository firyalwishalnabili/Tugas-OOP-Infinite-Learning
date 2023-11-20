package id.infinitelearning.KotlinSubmission.exercise1

/**
Latihan 1
Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
- Variable bertipe data string yang menyimpan nilai nama depan Anda.
- Variable bertipe data string yang menyimpan nilai nama belakang Anda.
- Variable bertipe data number yang menyimpan nilai umur Anda.
- Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
 */
fun myProfile() {
    val namaDepan: String = "Firyal Wishal"
    val namaBelakang: String = "Nabili"
    val umur: Int = 20
    val statusSingle: Boolean = true

    println("Nama Depan: $namaDepan")
    println("Nama Belakang: $namaBelakang")
    println("Umur: $umur tahun")
    println("Status: ${if (statusSingle) "Single" else "Tidak Single"}")
}


/**
 *  Latihan 2
 *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
 */

fun groupDetail(groupId: String, groupMember: List<Any>, session: String): Any {

    println("ID Grup: $groupId")
    println("Anggota Grup: $groupMember")
    println("Sesi: $session")
    return ""
}


/**
 * Latihan 3
 * Buat variable yang berisi daftar anggota group kamu,
 * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
 *
 */
fun myTeam(): List<Any> {
    val daftarAnggota = listOf("Diah Nur Astanti", "Firyal Wishal Nabili", "Ahmad Rofiq", "Defri Salwan", "Deni Zailani")
    val sayaDipanggil = daftarAnggota[2]

    println("\nDaftar Anggota Grup: $daftarAnggota")
    println("Ini saya : $sayaDipanggil")
    return listOf(sayaDipanggil)
}


/**
 * Latihan 4
 * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
 *
 *      total mentor + jumlah anggota group
 *
 */
fun totalMember(): Int {
    val mentor = arrayOf("Kak Kelvin", "Kak Shania")
    val countOfGroup = arrayOf("Diah Nur Astanti", "Firyal Wishal Nabili", "Ahmad Rofiq", "Defri Salwan", "Deni Zailani")

    val totalMentor = mentor.size
    val totalMember = countOfGroup.size

    val total = totalMentor + totalMember
    return total
}


fun main() {

    myProfile()

    val myTeam = myTeam()
    println("My team is: $myTeam")

    val totalMember = totalMember()
    println("Total Member group : $totalMember")

    /**
     *  Latihan 5
     *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
     *
     */
    val groupId = "Geek Genius"
    val groupMember = listOf("Diah Nur Astanti", "Firyal Wishal Nabili", "Ahmad Rofiq", "Defri Salwan", "Deni Zailani")
    val session = "Siang"

    groupDetail(groupId, groupMember, session)

}