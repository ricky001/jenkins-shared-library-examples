def gitClone(String url,boolean changelog=false,boolean poll=false){
    if (isUnix()){
      echo "Inside Unix"
      git changelog: ${changelog}, poll: ${poll}, url: '${url}'
    }
  else{
    echo "Inside Windows"
      git changelog: ${changelog}, poll: ${poll}, url: '${url}'
    
  }
}
