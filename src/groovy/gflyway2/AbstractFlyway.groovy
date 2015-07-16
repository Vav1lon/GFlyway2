package gflyway2

import grails.util.Environment
import org.flywaydb.core.Flyway
import org.flywaydb.core.internal.util.StringUtils
import org.flywaydb.core.internal.util.jdbc.DriverDataSource

abstract class AbstractFlyway {

    def config

    String driver
    String url
    String user
    String password
    String schemas
    String table

    String dataSourceSuffix

    String[] locations
    String basePackage
    String baseDir
    String encoding
    String sqlMigrationPrefix
    String sqlMigrationSuffix
    String validationErrorMode
    boolean initOnMigrate
    Map placehodelrs

    protected AbstractFlyway(config) {
        this.config = config
        def props = System.properties
        dataSourceSuffix = flywayConfig("dataSourceSuffix", '', props).isEmpty() ? '' : "_${flywayConfig("dataSourceSuffix", '', props)}"
        if (!config."dataSource${dataSourceSuffix}") {
            println '----------------------------------------'
            println("ERROR! dataSource${dataSourceSuffix} not found in current config!")
            println '----------------------------------------'
            throw new RuntimeException()
        }
        driver = config."dataSource${dataSourceSuffix}".driverClassName
        url = config."dataSource${dataSourceSuffix}".url
        user = config."dataSource${dataSourceSuffix}".username
        password = config."dataSource${dataSourceSuffix}".password

        def codec = config."dataSource${dataSourceSuffix}".passwordEncryptionCodec

        if (codec) {
            password = codec.decode(password)
        }

        schemas = flywayConfig("schemas", "public", props)
        table = flywayConfig("table")

        locations = StringUtils.tokenizeToStringArray(flywayConfig("locations", "db/migration", props), ",")
        basePackage = locations[0]
        baseDir = locations[0]
        encoding = flywayConfig("encoding", "UTF-8")
        sqlMigrationPrefix = flywayConfig("sqlMigrationPrefix", "V")
        sqlMigrationSuffix = flywayConfig("sqlMigrationSuffix", ".sql")
        validationErrorMode = flywayConfig("validationErrorMode", "FAIL")
        initOnMigrate = Boolean.valueOf(flywayConfig("initOnMigrate"))
        placehodelrs = config.grails.plugins.gflyway.placeholders ?: [:]

    }

    void execute() {
        Flyway flyway = new Flyway()
        flyway.setDataSource(createDataSource())
        if (schemas != null) {
            flyway.setSchemas(StringUtils.tokenizeToStringArray(schemas, ","))
        }
        if (table != null) {
            flyway.setTable(table)
        }
        if (locations != null) {
            flyway.setLocations(locations)
        }
        if (encoding != null) {
            flyway.setEncoding(encoding)
        }
        if (sqlMigrationPrefix != null) {
            flyway.setSqlMigrationPrefix(sqlMigrationPrefix)
        }
        if (sqlMigrationSuffix != null) {
            flyway.setSqlMigrationSuffix(sqlMigrationSuffix)
        }
        if (validationErrorMode != null) {
            flyway.cleanOnValidationError = false
        }
        if (initOnMigrate != null) {
            flyway.initOnMigrate = initOnMigrate
        }
        if (placehodelrs){
            flyway.setPlaceholders(placehodelrs)
        }
        logConfig()
        doExecute(flyway)
    }

    protected abstract void doExecute(Flyway flyway)

    protected String flywayConfig(String prop, Object defaultValue = null, Properties props = null) {
        if (props && props[prop]) {
            return props[prop]
        }
        config.grails.plugins.gflyway."$prop" ?: defaultValue
    }

    private createDataSource() throws Exception {
        new DriverDataSource(Thread.currentThread().getContextClassLoader(), driver, url, user, password)
    }

    private void logConfig() {
        println ''
        println '----------------------------------------'
        println("Current config:")
        println("baseDir: ${baseDir}")
        println("env: ${Environment.current}")
        println("dataSource: ${this.dataSourceSuffix.isEmpty() ? 'default' : 'dataSource' + this.dataSourceSuffix}")
        println("url: $url")
        println("username: $user")
        println("schemas: $schemas")
        println '----------------------------------------'
    }
}
