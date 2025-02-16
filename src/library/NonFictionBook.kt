package library

class NonFictionBook(title:String , author:String, ISBN :Int ,var subject:String):Book(title , author , ISBN ){


   override fun displayInfo():String
    {
        return "${super.displayInfo()} , subject: $subject"
    }

    fun NonFBook():String
    {
        return "$title very popular "
    }
}