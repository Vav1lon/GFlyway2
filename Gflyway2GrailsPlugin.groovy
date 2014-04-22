import gflyway2.FlywayMigrate;

class Gflyway2GrailsPlugin {

    def version = "0.4.1"
    def grailsVersion = "2.0 > *"
    def title = "Grails Flyway 2 Plugin"
    def description = 'Adds support for Flyway 2'
    def documentation = "http://grails.org/plugin/gflyway2"
    def license = "APACHE"
    def organization = [name: "Vav1lon", url: "http://www.vav1lon.com/"]
    def developers = [
        [name: "Denis Kuzmin", email: "vavilon.rus@gmail.com"],
        [name: "Bulat Nigmatullin", email: ""]
    ]
    def scm = [url: "https://github.com/Vav1lon/GFlyway2"]
    def issueManagement = [system: "GITHUB", url: "https://github.com/Vav1lon/GFlyway2/issues"]

    def loadAfter = [ "dataSource" ]
    def loadBefore = [ "hibernate" ]

    def doWithSpring = {
        def config = application.config;
        def confFlyway = config.grails.plugins.gflyway;

        if (confFlyway.autoMigrate) {
            new FlywayMigrate(config).execute();
        }
    }
}
