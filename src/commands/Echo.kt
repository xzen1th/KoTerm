package commands

import interfaces.Command
import kotlin.system.exitProcess

object Echo : Command
{
    /*
    * echo command -> repeat any text
    * echo "Hello World" results in "Hello World"
    *
    * need to add echo into the file.
    *  */
    override val command: String = "echo"
    override val description: String = "Echo to terminal"
    override val args: MutableMap<String, String>? = null

    override fun execute(args: List<String>?) {
        if(args.isNullOrEmpty()) return
        else println(args.joinToString(" "))
    }

}