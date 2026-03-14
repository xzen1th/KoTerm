package services

import java.io.File

/*
* Settings -> Settings for KoTerm
* initSettings -> check if there is a koterm folder with settings
* loadSettings -> load settings from a file
* createSettingsFile -> create a settings file
* */
class Settings(private val settings: MutableMap<String, String> = mutableMapOf())
{
    fun initSettings()
    {
        val homeDir = System.getProperty("user.home")

        val settingsDir = File(homeDir, ".koterm")
        val settingsFile = File(settingsDir, "settings.koterm")

        when
        {
            settingsDir.exists() && settingsFile.exists() -> loadSettings(settingsFile)
            settingsDir.exists() && !settingsFile.exists() -> createSettingsFile(settingsDir, settingsFile)
            !settingsDir.exists() -> {
                settingsDir.mkdirs()
                createSettingsFile(settingsDir, settingsFile)
            }
            else -> throw Exception("Something went wrong")
        }
    }

    fun loadSettings(settingsFile: File)
    {
        settingsFile.forEachLine { line: String -> settings[line.split("=")[0]] = line.split("=")[1]}
    }

    fun createSettingsFile(settingsDir: File, settingsFile: File)
    {
        settingsFile.createNewFile()
        settings["prompt"] = "koterm> "
        settings["start_dir"] = settingsDir.parent
        settings["history_size"] = "10"
        settings["history_file"] = "history.koterm"
        settings["debug"] = "true"

        settings.forEach { (key, value) -> settingsFile.appendText("$key=$value\n")}
    }

    override fun toString(): String
    {
        val builder: StringBuilder = StringBuilder()
        settings.forEach {(key, value) -> builder.append("${key}=${value}\n")}
        return builder.toString()
    }

    fun get(key: String) = settings[key]
    fun set(key: String, value: String) = value.also { settings[key] = it }

}