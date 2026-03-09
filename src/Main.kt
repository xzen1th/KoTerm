import misc.Colors

import services.Settings
import commands.Commands

fun main()
{
    println("${Colors.BRIGHT_MAGENTA}Ko${Colors.BRIGHT_BLUE}Term${Colors.RESET}")

    val settings = Settings()
    settings.initSettings()

    if(settings.settings["debug"] == "true") println("\n${settings}")

    val pwd = settings.settings["start_dir"]

    while (true)
    {
        println()
        print(settings.settings["prompt"])
        val command: String? = readlnOrNull()

        if (command.isNullOrEmpty()) continue

        Commands.executeCommand(command.trim().split(" "))
    }
}