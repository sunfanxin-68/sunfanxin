import java.util.Arrays;

public class Newsfeed {
  
  String[] topics = {"Opinion", "Tech", "Science", "Health"};
  int[] views = {0, 0, 0, 0};
 
  public Newsfeed(){

  }
    
  public String[] getTopics(){
    return topics;
  }
  
  /*Newsfeed class. Now, each instance starts with an array of zeros called views as an instance field.

Every time someone views a topic, we want to increment the value of the appropriate field in views.

For example, if someone views an "Opinion" piece, we want to increase the value of the 0th index of views from 0 to 1. If they view it again, we want to increase the value to 2.

We have written a method signature for viewTopic(), which takes in an int called topicIndex.

Inside the method, set the value of the views array at the index topicIndex to the current value plus 1.
但是等等——我们在Newsfeed课堂上增加了更多内容。views现在，每个实例都以一个称为实例字段的零数组开始。

每次有人查看一个主题时，我们都希望增加views.

例如，如果有人查看一个"Opinion"片段，我们想增加viewsfrom0到的第 0 个索引的值1。如果他们再次查看，我们希望将值增加到2。

我们为 编写了一个方法签名viewTopic()，它接受一个int被调用的topicIndex。

在方法内部，views将索引处的数组值设置topicIndex为当前值 plus 1。*/
  public String getTopTopic(){
    return topics[0];
  }
  
  public void viewTopic(int topicIndex){
    views[topicIndex] = views[topicIndex] + 1;
  }

  public static void main(String[] args){
    Newsfeed sampleFeed = new Newsfeed();
    
    System.out.println("The top topic is "+ sampleFeed.getTopTopic());
    
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(1);
    sampleFeed.viewTopic(3);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(2);
    sampleFeed.viewTopic(1);
    
    System.out.println("The " + sampleFeed.topics[1] + " topic has been viewed " + sampleFeed.views[1] + " times!"); 
    
  }
}