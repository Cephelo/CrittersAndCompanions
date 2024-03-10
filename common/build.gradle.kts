architectury {
    val enabledPlatforms: String by rootProject
    common(enabledPlatforms.split(","))
    loom {
        accessWidenerPath.set(file("src/main/resources/crittersandcompanions.accesswidener"))
    }
}

dependencies {
    modCompileOnly(group = "tech.thatgravyboat", name = "commonats", version = "2.0")
}
