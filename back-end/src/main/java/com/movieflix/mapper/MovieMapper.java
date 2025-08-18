package com.movieflix.mapper;

import com.movieflix.entity.Category;
import com.movieflix.entity.Movie;
import com.movieflix.entity.Streaming;
import com.movieflix.controller.request.MovieRequest;
import com.movieflix.controller.response.CategoryResponse;
import com.movieflix.controller.response.MovieResponse;
import com.movieflix.controller.response.StreamingResponse;

import java.util.List;
import java.util.stream.Collectors;

public class MovieMapper {
    public static Movie toMovie(MovieRequest movieRequest) {
        List<Category> categories = movieRequest.categories().stream()
                .map(categoryId -> new Category(categoryId, ""))
                .collect(Collectors.toList());

        List<Streaming> streamings = movieRequest.streamings().stream()
                .map(streamingId -> new Streaming(streamingId, ""))
                .collect(Collectors.toList());

        return new Movie(
                movieRequest.title(),
                movieRequest.description(),
                movieRequest.releaseDate(),
                movieRequest.rating(),
                categories,
                streamings
        );
    }

    public static MovieResponse toMovieResponse(Movie movie) {
        List<CategoryResponse> categories = movie.getCategories().stream()
                .map(category -> CategoryMapper.toCategoryResponse(category))
                .toList();

        List<StreamingResponse> streamings = movie.getStreamings().stream()
                .map(streaming -> StreamingMapper.toStreamingResponse(streaming))
                .toList();

        return new MovieResponse(
                movie.getId(),
                movie.getTitle(),
                movie.getDescription(),
                movie.getReleaseDate(),
                movie.getRating(),
                categories,
                streamings
        );
    }
}
