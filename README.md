bitcoinmonitor
==============

Monitors the bids in USD for bitcoin.

# Phase 1
* Go to the bitcoinmonitor directory
* Set JAVA_HOME environment variable to your java instance
* ./gradlew run -or- gradlew.bat run
* You should see Hello World

# Phase 2
* Let’s activate spring boot
* In your favorite editor open src/main/java/org/bitcoinmonitor/Main.java
* Remove the comment markers (//) from the lines of code beneath the “Phase 2” comment
* Save your changes
* ./gradlew run -or- gradlew.bat run

# Phase 3
1. Let’s activate Transformer
2. In your favorite editor open 
3.  src/main/java/org/bitcoinmonitor/Main.java 
4.  src/main/java/org/bitcoinmonitor/Transform.java
5.  Remove the comment markers (//) from the lines of code beneath the “Phase 3” comment
6.  Save your changes
7. In your favorite editor open 
8. src/main/resources/integration.xml
9. Remove the comment markers (<!-- -->) from the lines of code beneath the “Phase 3” comment
10. Now Let’s update the gateways so they will send their data to the transformer instead of the file outbound gateway.
11. For both the coinbasegateway and the bitstampgateway 
12. Set the reply-channel to the transformChannel
13. Save your changes
14. ./gradlew run -or- gradlew.bat run


# Phase 4
