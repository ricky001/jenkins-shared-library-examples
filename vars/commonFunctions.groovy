String getOS(){
String osName = "Windows"
if (isUnix()){
  osName="Linux"
}
return osName.toLowerCase()
}

//Create a file with some text
def createFile(String fileName, String text){
    bat "echo ${text} >> ${fileName}"
}
