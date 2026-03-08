package org.example.service;

public class EvenFindService implements FindService{
    @Override
    public boolean find(int x) {
        return x%2==0;
    }
}
