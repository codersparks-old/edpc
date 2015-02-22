EDPC - Elite Dangerous Pilot Companion
======================================

A web app that will act as a companion for pilots flying in elite dangerous

Build Instructions
------------------

To build a war for the project run the following command from the root directory (of the git repository)

```maven
mvn -Popenshift clean package
```

This will build the `war` package and copy it to the `webapps` folder in the root directory (of the git repository) - If you do not use the openshift profile (i.e. do not include the `-Popenshift` parameter) the war will be built in the `target` folder of the `edpc-web` project