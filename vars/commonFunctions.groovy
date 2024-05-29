String getOS(){
String osName = "Windows"
if (isUnix()){
  osName="Linux"
}
return osName.toLowerCase()
}
