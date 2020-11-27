package com.github.fein0801.mcuchecklist.helpers;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.fein0801.mcuchecklist.model.FullMovieList;
import com.github.fein0801.mcuchecklist.model.Movie;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class JSONHelper {

//    public ArrayList<Movie> readFullMovieList() {
//        try {
//            ArrayList<Movie> movieList = new ArrayList<>();
//            ClassLoader classLoader = McuChecklistApplication.class.getClassLoader();
//            URL myUrl = classLoader.getResource("movies.json");
//            String path = myUrl.getPath();
//            path = path.replaceAll("%20", " ");
//            Path filepath = Path.of(path);
//            FullMovieList fullMovieListObj = mapper.readValue(filepath.toFile(), FullMovieList.class);
//            movieList.addAll(fullMovieListObj.getPhaseOne());
//            movieList.addAll(fullMovieListObj.getPhaseTwo());
//            movieList.addAll(fullMovieListObj.getPhaseThree());
//            return movieList;
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//    }

    private static ObjectMapper mapper = new ObjectMapper();

    public ArrayList<Movie> readFullMovieList() {
        try {
            ArrayList<Movie> movieList = new ArrayList<>();
            File resourceFile = new FileSystemResource("movies.json").getFile();
            FullMovieList fullMovieListObj = mapper.readValue(resourceFile, FullMovieList.class);
            movieList.addAll(fullMovieListObj.getPhaseOne());
            movieList.addAll(fullMovieListObj.getPhaseTwo());
            movieList.addAll(fullMovieListObj.getPhaseThree());
            return movieList;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
