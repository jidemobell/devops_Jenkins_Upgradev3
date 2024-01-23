// Script to install 3 plugins

// Function to install a plugin
def installPlugin(pluginName) {
    println("Installing plugin: $pluginName")
    // Logic to install the plugin goes here
    // Example: installCommand.execute(pluginName)
}

// List of plugins to install
def pluginsToInstall = ["github", "mstest", "workflow-aggregator", "docker-build-publish"]

// Install each plugin
pluginsToInstall.each { plugin ->
    installPlugin(plugin)
}

println("Installation complete!")
