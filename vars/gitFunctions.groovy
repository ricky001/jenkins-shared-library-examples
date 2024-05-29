def gitClone(String url,boolean changelog,boolean poll){
    if (isUnix()){
      echo "Inside Unix"
      sh "git changelog: ${changelog}, poll: ${poll}, url: '${url}'"
    }
  else{
    echo "Inside Windows"
    bat "git changelog: ${changelog}, poll: ${poll}, url: '${url}'"
    
  }
}
