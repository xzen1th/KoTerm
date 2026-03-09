package interfaces

interface Command
{
    val command: String
    val description: String
    val args: MutableMap<String, String>?

    fun execute(args: List<String>?)
}