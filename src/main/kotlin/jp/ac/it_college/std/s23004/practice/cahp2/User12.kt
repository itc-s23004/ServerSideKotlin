package jp.ac.it_college.std.s23004.jp.ac.it_college.std.s23004.practice.cahp2

data class User12(val id: Int, var name: String, var address: String)

fun getUser(id: Int): User12 {
    return User12 (id, "Takahata", "Tokyo")
}

fun updateUser(id: Int, newName:String, newAddress: String) {
    val user = getUser(id).apply {
      this.name = newName
      this.address = newAddress
    }
println(user)
}