package lesson_17

class Folder(name: String, numberOfFiles: Int, private val isSecret: Boolean) {
    val folderName = name
        get() = if (isSecret == true) "скрытая папка" else field

    val folderFileCount = numberOfFiles
        get() = if (isSecret == true) 0 else field
}

fun main() {

    val secretFolder = Folder("Секретные материалы", 5, true)


    println("Имя папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.folderFileCount}")
}





