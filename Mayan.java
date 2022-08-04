class Mayan extends Language {
 
  Mayan(String languageName, int speakers) {
    super(languageName, speakers, "Central America", "verb-object-subject");
  }

    @Override
  public void getInfo() {
 
    System.out.println(name + " is spoken by " + numSpeakers + " people mainly in " + regionsSpoken + ".　The language follows the word order: " + wordOrder);
    System.out.println("Fun fact:  is an ergative language.");
 
  }
}