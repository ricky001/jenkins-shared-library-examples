String getOS(){
String osName = "Windows"
if (isUnix()){
  osName="Linux"
}
return osName.toLowerCase()
}

//Create a file with some text
def createFile(String fileName, String text){
    echo "${text}" >> fileName.txt
}
