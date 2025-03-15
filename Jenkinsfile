pipeline{
environment{
DOCKER_IMAGE="  "
REGISTRY_CREDENTIALS=" "
}
stages{
stage('Checkout'){
steps{
checkout scm
}
}
stage('Build with Maven'){
steps{
sh 'mv clean package'}
}
stage('Build Docker Image'){
sh 'docker build -t ${DOCKER_IMAGE}'
}

}
stage('Push Docker Image'){
steps{
withCredentials([])
sh "echo $DOCKER_PASS | docker login -u "
sh "docker push ${DOCKER_IMAGE}"

}
}
}
stage('Deploy to Knative')
steps{
sh ""
cat <<EOF | kubectl apply -f -
apiVersion: serving.knative.dev/v1
kind:Service
metadata:
name: springboot-app
spec:
template:
containers:
-image:${DOCKER_IMAGE}
ports:
-containers:8080
EOF"""
}
}
post{
always{
cleanWs()}