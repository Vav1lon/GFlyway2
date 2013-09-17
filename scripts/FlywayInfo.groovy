includeTargets << new File("$gflyway2PluginDir/scripts/_FlywayInit.groovy")

target(main: "Flyway info") {
    depends flywayInit

    flyway.info()
}

setDefaultTarget(main)
