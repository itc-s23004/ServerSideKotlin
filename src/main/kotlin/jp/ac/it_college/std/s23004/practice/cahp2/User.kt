package jp.ac.it_college.std.s23004.jp.ac.it_college.std.s23004.practice.cahp2

class Userdata class User(val name: String)

fun createUser(name: String?): User? {
    return name?.let { n -> User(n) }
}