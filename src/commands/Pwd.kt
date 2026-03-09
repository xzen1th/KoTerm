package commands

import interfaces.Command
import kotlin.system.exitProcess

object Pwd : Command
{
    override val command: String = "pwd"
    override val description: String = "Print working directory"
    override val args: MutableMap<String, String>? = null

    override fun execute(args: List<String>?)
    {
        TODO("Think about logic - I need to find better way to put dir path into this fun")
    }
}