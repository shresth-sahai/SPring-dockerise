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


How it works ?

DockerFIle -> having sets of cmds
s2 build image s3 run the container

Steps ->
we have to a jar file
Run this in terminal
 mvn clean package
 docker build -t springboot-app -> to make the image
  docker build -t springboot-app -> to run the app


 */
