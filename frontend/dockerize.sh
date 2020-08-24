#!/bin/bash
ng build --prod 
docker build  -f Dockerfile -t frontend .
docker tag frontend vinothg2309/frontend:1.1
docker push vinothg2309/frontend:1.1
