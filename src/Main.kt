import misc.Colors

import services.Settings
import commands.Commands

fun main()
{
    println("${Colors.BRIGHT_MAGENTA}Ko${Colors.BRIGHT_BLUE}Term${Colors.RESET}")

    val settings = Settings()
    settings.initSettings()

    if(settings.settings["debug"] == "true")
    {
        println("${Colors.GREEN}=================================${Colors.RESET}")
        println("Settings:\n")
        println("${settings}")
        println("${Colors.GREEN}=================================${Colors.RESET}")
    }


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