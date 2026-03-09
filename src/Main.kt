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
        println("${Colors.BRIGHT_MAGENTA}Ko${Colors.BRIGHT_BLUE}Term ${Colors.BRIGHT_GREEN}Settings:${Colors.RESET}\n")
        println("$settings")
        println("${Colors.GREEN}=================================${Colors.RESET}")
    }

    val pwd = settings.settings["start_dir"]

    while (true)
    {
        println()

        when
        {
            settings.settings["prompt"] == $$"$HOME" ->
            {
                TODO("PRINT PWD")
            }
            else -> print(settings.settings["prompt"])
        }

        val command: String? = readlnOrNull()

        if (command.isNullOrEmpty()) continue

        Commands.executeCommand(command.trim().split(" "))
    }
}