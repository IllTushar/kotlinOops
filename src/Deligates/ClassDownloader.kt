package Deligates

class ClassDownloader(val file :String):Downloader {
    override fun downloadVideo() {
        println("$file.mkv")
    }
}