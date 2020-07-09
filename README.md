# Starter template using JavaFX, Maven, Hibernate, and Apache derby for my personal use .
### Might be helpful for others.

Uses JDK 14+, JAVAFX 11 (OpenJFX). Other dependencies in pom.xml

jlink won't work as some dependencies which hibernate relies on like net.bytebuddy, com.fasterxml.classmate 
are not modular.


To package as a msi, dmg, pkg installer create a fat jar. Maven shade plugin added in pom.xml

###### Command to create a msi installer using jpackage (Available with JDK14) (Need to have wixtoolset installed on windows)
Run maven package (this creates the fat jar)

jpackage --input target\ --name "Membership Manager Pro" --main-jar membership-manager-pro-1.0-SNAPSHOT.jar --main-class com.amalajith.MainApp --type msi --win-menu --win-menu-group "Membership Manager Pro" --vendor "Amal Ajith" --verbose --resource-dir resource-dir --win-shortcut --license-file resource-dir/license.txt --win-dir-chooser

### Embedded derby database using JPA and hibernate as a provider.
For additional configuration see `src/main/resource/META-INF/persistence.xml`