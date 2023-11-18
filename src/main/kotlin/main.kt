fun main() {
    val textEins = "Hallo Welt"
    val textZwei = "Guten Morgen"
    println(textEins + "\n" + textZwei)

    val textDrei = "Guten Abend"

    var textVier = textZwei
    val textFuenf = ", wie"
    textVier += textFuenf
    textVier += " geht es?"
    println("$textDrei\n$textVier")
}
