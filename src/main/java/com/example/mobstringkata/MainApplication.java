
package com.example.mobstringkata;

import org.springframework.stereotype.Service;

@Service
public class MainApplication {

    public int countNeighbours(boolean[][] field, int size, Coordinate cell){
        int count = 0;
        if(field[cell.getX()][cell.getY()-1]){
            count++;
        }
        if(field[cell.getX()-1][cell.getY()-1]){
            count++;
        }
        if(field[cell.getX()-1][cell.getY()]){
            count++;
        }
        if(field[cell.getX()+1][cell.getY()]){
            count++;
        }
        if(field[cell.getX()+1][cell.getY()+1]){
            count++;
        }
        if(field[cell.getX()][cell.getY()+1]){
            count++;
        }
        if(field[cell.getX()-1][cell.getY()+1]){
            count++;
        }
        if(field[cell.getX()+1][cell.getY()-1]){
            count++;
        }
        return count;
    }

    private int tryToCount(boolean[][] field, Coordinate coordinate, int count){
        try{
            return 1;
        }catch(IndexOutOfBoundsException e){
        }
        return 0;
    }
}
