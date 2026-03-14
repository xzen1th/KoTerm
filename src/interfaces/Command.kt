package interfaces

interface Command
{
    /*
    * I need to think about a better way to represent Commands
    * for each command I'm creating variable for arguments and some of them dont have args
    *  */
    val command: String
    val description: String
    val args: MutableMap<String, String>?

    fun execute(args: List<String>?)
}