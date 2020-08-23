#!/bin/bash
mvn clean package
docker build -t vinothg2309/employee-service .
docker push vinothg2309/employee-service
kubectl delete -f employee-k8s.yml
kubectl apply -f employee-k8s.yml