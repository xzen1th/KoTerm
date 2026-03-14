package services

import misc.Colors

class Debug()
{
    fun logToFile(status: Int)
    {
        TODO("Log every command if debug is enabled.")
    }

    fun printLog(status: Int)
    {
        TODO("Print every log in console")
    }

    /* Just printed settings for a screenshot */
    fun printSettings(settings: Settings)
    {
        println("${Colors.GREEN}=================================${Colors.RESET}")
        println("${Colors.BRIGHT_MAGENTA}Ko${Colors.BRIGHT_BLUE}Term ${Colors.BRIGHT_GREEN}Settings:${Colors.RESET}\n")
        println("$settings")
        println("${Colors.GREEN}=================================${Colors.RESET}")
    }
}
