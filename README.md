Install Java
-------------

sudo apt update

sudo apt install openjdk-11-jre


Verify Java is Installed
------------------------------

java -version


Now, you can proceed with installing Jenkins
--------------------------------------------

curl -fsSL https://pkg.jenkins.io/debian/jenkins.io-2023.key | sudo tee \
  /usr/share/keyrings/jenkins-keyring.asc > /dev/null
echo deb [signed-by=/usr/share/keyrings/jenkins-keyring.asc] \
  https://pkg.jenkins.io/debian binary/ | sudo tee \
  /etc/apt/sources.list.d/jenkins.list > /dev/null
sudo apt-get update
sudo apt-get install jenkins


 Run the command to copy the Jenkins Admin Password - sudo cat /var/lib/jenkins/secrets/initialAdminPassword - Enter the Administrator password



 Run the below command to Install Docker
 ----------------------------------------

sudo apt update

sudo apt install docker.io


Docker Permisssion
----------------
sudo su - 
usermod -aG docker jenkins
usermod -aG docker ubuntu
systemctl restart docker
