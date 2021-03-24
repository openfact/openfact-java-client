#!/usr/bin/env bash

echo "===================================="
read -p "Enter Release: " releaseVersion
read -p "Enter Next Release (SNAPSHOT): " nextVersion
read -s -p "Enter Github Token: " token

# Update to release
mvn versions:set -DnewVersion="$releaseVersion"

git add .
git commit -m "Prepare release $releaseVersion"
git push "https://$token@github.com/openfact/openfact-java-client.git"

# Create tag and push
git tag "$releaseVersion"
git push "https://$token@github.com/openfact/openfact-java-client.git" --tags

# Create next snapshot
mvn versions:set -DnewVersion="$nextVersion-SNAPSHOT"

git add .
git commit -m "Prepare next release $nextVersion-SNAPSHOT"
git push "https://$token@github.com/openfact/openfact-java-client.git"

pause