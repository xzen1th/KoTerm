import misc.Colors

import services.Settings
import commands.Commands
import services.Debug

fun main()
{
    println("${Colors.BRIGHT_MAGENTA}Ko${Colors.BRIGHT_BLUE}Term${Colors.RESET}")

    val settings = Settings()
    settings.initSettings()

    if(settings.get("debug") == "true") Debug().printSettings(settings)

    val pwd = settings.get("start_dir")

    while (true)
    {
        println()

        when
        {
            settings.get("prompt") == $$"$HOME" ->
            {
                TODO("PRINT PWD")
            }
            else -> print(settings.get("prompt"))
        }

        try
        {
            val command: String? = readlnOrNull()

            if (command.isNullOrEmpty()) continue

            Commands.executeCommand(command.trim().split(" "))
        }
        catch (e: Exception)
        {
            println("${Colors.RED}Error: ${e.message}${Colors.RESET}")
            e.printStackTrace();
        }
        finally { continue }


    }
}