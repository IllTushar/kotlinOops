package annonymusClass

class Download {
    var download: Downloader? = null
    fun downloadingStart() {
        println("Do you want to start downloading...")
        download?.downloadingStart()
        download?.downloadingCompleted()
    }
}