package com.wolverinesolution.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {


    private List<Topics> topics = Arrays.asList(

            new Topics("Spring","Spring Framework","Spring Framework Descroption"),
                new Topics("Java","Java Framework","Java Framework Descroption"),
                new Topics("MySql","MySql Framework","MySql Framework Descroption")

        );

    public List<Topics> getAllTopics(){
        return topics;
    }
}
