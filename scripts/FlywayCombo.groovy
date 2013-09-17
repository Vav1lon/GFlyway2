includeTargets << new File(gflyway2PluginDir, "scripts/_FlywayInit.groovy")

target(flywayCombo: "Combo, step by step") {
    depends flywayInit

    flyway.clean()
    flyway.init()
    flyway.migrate()
}

setDefaultTarget(flywayCombo)
