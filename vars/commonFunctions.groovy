String getOS(){
String osName = "Windows"
if (isUnix()){
  osName="Linux"
}
return osName.toLowerCase()
}

//Create a file with some text
def createFile(String fileName, String text){
  echo "${filename.size()}"
  assert isNullOrEmptyString(fileName) : "Error the filename doesn't exist"
    bat "echo ${text} >> ${fileName}"
}

public boolean isNullOrEmptyString(String fileName){
  if (fileName == null || fileName.toLowerCase()=="null" || fileName.size()==0){
      return true
  }
  return false
}
