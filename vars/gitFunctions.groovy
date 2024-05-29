def gitClone(String url,boolean changelog=false,boolean poll=false){
    if (isUnix()){
      echo "Inside Unix"
      sh "git changelog: ${changelog}, poll: ${poll}, url: '${url}'"
    }
  else{
    echo "Inside Windows"
    bat "git changelog: ${changelog}, poll: ${poll}, url: '${url}'"
    
  }
}
