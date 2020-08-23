#!/bin/bash
ng build --prod
docker build -t vinothg2309/employee-frontend .
docker push vinothg2309/employee-frontend
kubectl delete -f angular-app-k8s.yml
kubectl apply -f angular-app-k8s.yml