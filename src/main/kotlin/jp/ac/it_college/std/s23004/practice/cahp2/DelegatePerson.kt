package jp.ac.it_college.std.s23004.jp.ac.it_college.std.s23004.practice.cahp2

class DelegatePerson {
    val name: String by DelegateWithMessage()
    val address: String by DelegateWithMessage()
}