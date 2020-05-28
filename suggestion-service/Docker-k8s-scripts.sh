docker build -t vinothg2309/suggestion-service .
docker push vinothg2309/suggestion-service
kubectl delete -f suggestion-service-k8s.yaml
kubectl create -f suggestion-service-k8s.yaml
