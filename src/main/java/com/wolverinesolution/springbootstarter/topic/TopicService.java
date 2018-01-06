package com.wolverinesolution.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topic> topics = new ArrayList<Topic>(
            Arrays.asList(

            new Topic("Spring","Spring Framework","Spring Framework Descroption"),
            new Topic("Java","Java Framework","Java Framework Descroption"),
            new Topic("MySql","MySql Framework","MySql Framework Descroption")

        ));

    public List<Topic> getAllTopics(){
        return topics;
    }

    public Topic getTopic(String id){
        return topics.stream().filter(t -> t.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    public void addTopic(Topic topic) {
        topics.add(topic);

    }

    public void updateTopic(Topic topic, String id) {

        for (int i = 0; i<topics.size(); i++){

            Topic t = topics.get(i);
            if(t.getId().equalsIgnoreCase(id)){
                topics.set(i,topic);
                return;
            }

        }
    }

    public void deleteTopic(String id) {

        topics.removeIf(t -> t.getId().equalsIgnoreCase(id));

    }
}
