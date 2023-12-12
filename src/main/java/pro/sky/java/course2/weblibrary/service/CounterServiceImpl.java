package pro.sky.java.course2.weblibrary.service;

import org.springframework.stereotype.Service;

@Service
public class CounterServiceImpl implements CounterService{
    private int counter;

    @Override
    public int getRequestCount(){
        return ++counter;
    }
}
