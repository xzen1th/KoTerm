import misc.Colors

import services.Settings

fun main()
{
    println("${Colors.BRIGHT_MAGENTA}Ko${Colors.BRIGHT_BLUE}Term${Colors.RESET}")

    val settings = Settings()
    settings.initSettings()

    settings.settings["pwd"] = System.getProperty("user.dir")

    if(settings.settings["debug"] == "true") println("\n${settings}")

    /*while (true)
    {
        println()
        print(settings.settings["prompt"])
    }*/
}