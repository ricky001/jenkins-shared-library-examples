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

public boolean isNullOrEmptyString(String fileName){
  if (fileName == null || fileName.toLowerCase()=="null" || fileName.size()==0){
      return true
  }
  return false
}

def detectFiles(String path,String globText){

  dir(path){

    return findFiles(glob:globText)

  }
def call(){
  def envVariables = bat "set"
  echo "${envVariables}"
}

}
