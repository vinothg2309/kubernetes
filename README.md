# kubernetes

Prerequesties:

  1. Docker
  2. Kubernetes
  3. Minikube
    
Steps:

Follow the below steps to deploy the micro services in Kubernetes.

  1. Build maven project using "mvn clean compile install" command.
  2. Build the docker image using "docker build -t [DOCKER_HUB_USERNAME]/PROJECT_NAME ."(dot at last) command.
  3. Push docker image to docker hub using "docker push [DOCKER_HUB_USERNAME]/PROJECT_NAME" command.
  4. Create kubernetes component - first create MongoDB pod by running "kubectl apply -f mongo-db.yaml" command inside loan-service.
  5. Create loan-service pod & service by running "kubectl apply -f loan-service.yaml" command in loan-service.
  6. Create customer-service pod & service by running "kubectl apply -f customer-service.yaml" command in customer-service project folder.
  7. Check the available pods and service by running "kubectl get pods" and "kubectl get pods" respectively.
  
Testing:

  Check the minikube IP address by executing "minikube IP" command. Make a call the below rest service to test the micro service deployed in Kubernetes. Test data for both customer and loan are pre-loaded while deploying the application.

  GET: http://[MINIKUBE IP]:[SERVICE NODE PORT]/customer/fetch - Fetch all customers.
  
  GET: http://[MINIKUBE IP]:[SERVICE NODE PORT]/loan/fetch - Fetch all loan details.
  
  GET: http://[MINIKUBE IP]:[SERVICE NODE PORT]//customer/getAllCustomersLoan - Fetch all customers and their loan details.      
