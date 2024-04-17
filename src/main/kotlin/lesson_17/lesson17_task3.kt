package lesson_17

class Folder(name: String, numberOfFiles: Int, private val isSecret: Boolean) {
    val folderName = name
        get() = if (isSecret) "скрытая папка" else field

    val folderFileCount = numberOfFiles
        get() = if (isSecret) 0 else field
}

fun main() {

    val secretFolder = Folder("Секретные материалы", 5, false)


    println("Имя папки: ${secretFolder.folderName}")
    println("Количество файлов: ${secretFolder.folderFileCount}")
}





