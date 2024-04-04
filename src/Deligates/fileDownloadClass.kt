package Deligates

class fileDownloadClass(val downloader: Downloader,val player: Player):Downloader by downloader,Player by player {
}