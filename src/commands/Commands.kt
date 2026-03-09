package commands

import interfaces.Command

object Commands
{
    val commands: MutableMap<String, Command> = mutableMapOf(
        "exit" to Exit,
        "echo" to Echo,
        "pwd" to Pwd
    )

    fun executeCommand(command: List<String>)
    {
        val commandName = command[0]
        val commandArgs = command.subList(1, command.size)

        commands[commandName]?.execute(commandArgs)
    }
}