includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(flywayInfo: "Flyway info") {
    depends flywayInit

    flyway.info()
}

setDefaultTarget(flywayInfo)
