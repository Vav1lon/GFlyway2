includeTargets << new File("$gflyway2PluginDir/scripts/_FlywayInit.groovy")

target(main: "Combo, step by step") {
    depends flywayInit

    flyway.clean()
    flyway.init()
    flyway.migrate()
}

setDefaultTarget(main)

