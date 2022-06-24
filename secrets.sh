# !/usr/bin/env 
perl -pi -e 's/SONAR_HOST_URL/$ENV{SONAR_HOST_URL}/g' pom.xml
perl -pi -e 's/SONAR_PROJECT_KEY/$ENV{SONAR_PROJECT_KEY}/g' pom.xml
perl -pi -e 's/SONAR_LOGIN/$ENV{SONAR_LOGIN}/g' pom.xml
