#!/bin/sh

sed "s/tagVersion/$1/g" angular-app-k8s.yml > angular-app-k8s-tagged.yml
