includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(main: "Flyway init") {
    depends flywayInit

    flyway.init()
}

setDefaultTarget(main)
