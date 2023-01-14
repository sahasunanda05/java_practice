package com.jap;

import java.util.*;
import java.util.Map.Entry;

public class MovieService {

    public Map<Movie,Integer> getMovieWithRating(){

        //create five movie object by calling Movie class parameterized constructor
        Movie movie1;
        Movie movie2;
        Movie movie3;
        Movie movie4;
        Movie movie5;
        Map<Movie,Integer> movieIntegerMap;
        MovieService movieService;
        //create HashMap object and add all the Movie object inside it
        Map map = new HashMap();
        //Key will be movie object and value will be rating ranging from 1 to 5
        movieService = new MovieService();
        movie1 = new Movie(101,"A Beautiful Mind","economic","11/1/2001");
        movie2 = new Movie(102,"Boiler Room","Crime","1/1/2000");
        movie3 = new Movie(103,"Buy and Cell","comedy","13/4/1988");
        movie4 = new Movie(104,"Corsair","Crime","11/11/1997");
        movie5 = new Movie(105,"Diamond Necklace","comedy","10/11/2021");
        movieIntegerMap = new HashMap<>();
        movieIntegerMap.put(movie1,2);
        movieIntegerMap.put(movie2,5);
        movieIntegerMap.put(movie3,4);
        movieIntegerMap.put(movie4,4);
        movieIntegerMap.put(movie5,3);
        //return the HashMap object


        return movieIntegerMap;
    }

    public Set<String> getMovieNameWithRating4(Map<Movie,Integer> map,int rating){
        //Create a TreeSet object
        TreeSet<String> treeSet = new TreeSet<String>();
        //Use entrySet() method to iterate through the map object

        //retrieve all the movies name having rating as 4

        //Store the movie name in TreeSet object

        //return the TreeSet object
        for(Entry<Movie, Integer> entry: map.entrySet()) {
            if (entry.getValue() == rating){
                treeSet.add(entry.getKey().getMovieName());
            }
        }

        return treeSet;
    }

    public List<String> getMovieWithHighestRating(Map<Movie,Integer> map){
        //Create a ArrayList object of type String
        //get the first value from the map and store it in the variable max
        // Use entrySet().iterator().next() method to retrieve the first value of Map object
        Entry<Movie,Integer> max =   map.entrySet().iterator().next();
        for(Entry <Movie,Integer> entry: map.entrySet()) {
            if (entry.getValue() > max.getValue()){
                max = entry;
            }
        }
        //get the name of the movie with the highest rating and add it in the List created
        //return the List object

        List l = new ArrayList();
        l.add(max.getKey().getMovieName());
        return l;
    }
    public Map<String,String> getAllMoviesWithComedy(Map<Movie,Integer> map){
        //Create a Map object
        Map<String,String> map1 = new HashMap();
        //use entrySet to iterate through the Map object
        for(Entry<Movie,Integer> entry: map.entrySet()) {
            if (entry.getKey().getGenre().equalsIgnoreCase("comedy")){
                map1.put(entry.getKey().getMovieName(),entry.getKey().getReleaseDate());
            }
        }
        //get all the movies name and their released date for the movie of genre "comedy"
        //store movie name with release date in the above created Map object and return the Map object

        return map1;

    }

    public static void main(String[] args) {
        MovieService movieService = new MovieService();
        Map <Movie,Integer> map = movieService.getMovieWithRating();
        Set set = movieService.getMovieNameWithRating4(map,4);
        System.out.println("Rating 4" + set);
        Map map1 = movieService.getAllMoviesWithComedy(map);
        System.out.println("Comedy Movie " + map1);
        List list = movieService.getMovieWithHighestRating((Map<Movie, Integer>) map);
        System.out.println("--------------");
        System.out.println("Highest Rating " +list);
    }
}
