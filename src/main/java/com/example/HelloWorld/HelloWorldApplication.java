package com.example.HelloWorld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}

}
/*
Docker -> container
software -> librairies, tools etc
DOcker -> dev env -> deploy
Mac -----> dev
Windows -> deploy
dependency conflicts

docker container -> packing ur app -> dependecies req to run

1 docker image -> blueprint of the app, contains everything
inorder to deploy our app
2 conntainr-> running instance of the app
3 docker engine -> managing images
4 docker hub -> docker images
5 docker registery


How it works ?

DockerFIle -> having sets of cmds
s2 build image s3 run the container

Steps ->
we have to a jar file
Run this in terminal
 mvn clean package
 docker build -t springboot-app -> to make the image
  docker build -t springboot-app -> to run the app


kn8
app -> fe be db 3 docker containers
seperately run ->
heavy traffic -> managing scale

kn8 -> automates the deploymentnt scalling & nmanagement of containers
Nodes ->machine in which container runs
pods -> smallest deployable unit in kn8
pos can have one or more conatiners
deployments ->
servcices ->
 docker tag springboot-app shresth0400700/springboot-app:latest

 docker push shresth0400700/springboot-app:latest

 kubectl apply -f knative-service.yaml

kubectl apply -f knative-service.yaml

 kubectl get ksvc

 kubectl get ksvc springboot-app jsonpath="{}"

// jenkins -> automation server that enables ci cd

code integration -> monitor -> source code git -> trigger
building -> maven  -docker image
testing

ci cd ->

 */
