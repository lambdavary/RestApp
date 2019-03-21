package com.springApp.restservice.RestApp;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    Topic response = null;

    List<Topic> topics = new ArrayList<> (Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("django", "Django Framework", "Django Framework Description"),
            new Topic("hibernate", "Hibernate Framework", "Hibernate Framework Description")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(Topic topic){
        topics.add(topic);
    }

    public void updateTopic(String id, Topic topic) {
        for (Topic t: topics) {
            if(t.getId().equals(id)){
                t.setName(topic.getName());
                t.setDescription(topic.getDescription());
                break;
            }
        }
    }

    public void deleteTopic(String id) {
        for (Topic t: topics) {
            if(t.getId().equals(id))
                topics.remove(t);
            break;
        }
    }

    //public Topic myTopicMethod(String id){
    //    for (Topic topic: topics) {
    //        if (topic.getId().equals(id)){
    //            response = topic;
    //            break;
    //        }
    //    }
    //    return response;
    //}
}
