/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movierecsys.bll.util;

import java.util.ArrayList;
import java.util.List;
import movierecsys.be.Movie;
/**
 *
 * @author pgn
 */
public class MovieSearcher
{
    public List<Movie> search(List<Movie> searchBase, String query)
    {
        List<Movie> movies = new ArrayList();
        List<Movie> foundMovies = new ArrayList();
        movies = searchBase;
        
        for (Movie mov : movies) {
         
            if(mov.getTitle().replace(" ","").toLowerCase().trim().contains(query.toLowerCase())){
                System.out.println(mov.getTitle().toLowerCase());
                System.out.println(query.toLowerCase());
            foundMovies.add(mov);
           }
        }
        
        return foundMovies;
    }
    
}
