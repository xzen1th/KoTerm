package commands

import interfaces.Command
import kotlin.system.exitProcess

object Echo : Command
{
    override val command: String = "echo"
    override val description: String = "Echo to terminal"
    override val args: MutableMap<String, String>? = null

    override fun execute(args: List<String>?)
    {
        if(args.isNullOrEmpty()) return
        println(args.joinToString(" "))
    }
}