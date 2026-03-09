package commands

import interfaces.Command
import kotlin.system.exitProcess

object Exit : Command
{
    override val command: String = "exit"
    override val description: String = "Exit KoTerm"
    override val args: MutableMap<String, String>? = null

    override fun execute(args: List<String>?)
    {
        println("Exiting...")
        exitProcess(0)
    }
}