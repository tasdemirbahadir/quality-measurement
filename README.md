#### Sample Project for Spring Boot Sonarqube Quality Measurement

## Perquisites

 - Maven 3.x or higher version
 - Java 11

## Bootstrap Servers
`docker-compose -f .build/docker-compose.yml up -d`

## Close Down Servers
`docker-compose -f .build/docker-compose.yml down`

docker-compose.yml file is references from this source: https://gist.github.com/Warchant/0d0f0104fe7adf3b310937d2db67b512

## Run tests with sonar report
`mvn clean install sonar:sonar`

## Setup Scan Workflow

#### For the workflow to be successfull you'll need these variables below to  Github Action Secrets:

[Tutorial](https://github.com/Azure/actions-workflow-samples/blob/master/assets/create-secrets-for-GitHub-workflows.md)

`SONAR_HOST_URL: ${{ secrets.SONAR_HOST_URL }}`

`SONAR_PROJECT_KEY: ${{ secrets.SONAR_PROJECT_KEY }}`    

`SONAR_LOGIN: ${{ secrets.SONAR_LOGIN }}`         
          

## Optional: Setup slack notifications:
#### You'll need to create a Slack App/Bot, add it to a prefered slack channel, and get the Incoming Webhook URL:
[Tutorial](https://slack.com/help/articles/115005265063-Incoming-webhooks-for-Slack)

#### After you complete the tutorial, you can go ahead and uncomment the tasks in the workflow file and replace `{incoming webhook link}` with the Incoming Webhook URL;