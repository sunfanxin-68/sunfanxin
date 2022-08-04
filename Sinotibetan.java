class SinoTibetan extends Language {

  SinoTibetan(String name, int speakers){
  super(name, speakers , "Asia", "subject-object-verb");
  if(name.contains("Chinese")){
    wordOrder = "subject-verb-object";
  }
}
}