class gflyway2GrailsPlugin {

    def version = "0.2"
    def grailsVersion = "2.2 > *"
    def pluginExcludes = [
    ]

    def title = "Grails Flyway 2 Plugin"
    def author = "Denis Kuzmin"
    def authorEmail = "vavilon.rus@gmail.com"
    def description = '''\
    Plugin flyway 2 for use in Grails
'''

    def documentation = "http://grails.org/plugin/gflyway2-plugin"
    def license = "APACHE"

    def organization = [name: "Vav1lon", url: "http://www.vav1lon.com/"]
    def developers = [[name: "Kuzmin Denis", email: "vavilon.rus@gmail.com"], [name: "Bulat Nigmatullin", email: ""]]
    def scm = [url: "https://github.com/Vav1lon/GFlyway2"]

    def doWithWebDescriptor = { xml ->
    }

    def doWithSpring = {
    }

    def doWithDynamicMethods = { ctx ->
    }

    def doWithApplicationContext = { applicationContext ->
    }

    def onChange = { event ->
    }

    def onConfigChange = { event ->
    }

    def onShutdown = { event ->
    }
}
