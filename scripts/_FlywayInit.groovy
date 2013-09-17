includeTargets << grailsScript("_GrailsBootstrap")

target(flywayInit: "init flyway") {
    depends(configureProxy, packageApp, classpath, loadApp, configureApp)
    config.dataSource.dbCreate=''
    flyway = classLoader.loadClass("gflyway2.GFlyway").newInstance()
    flyway.config = config
}
