package com.movieflix.response;

import java.time.LocalDate;
import java.util.List;

public record MovieResponse(Long id,
                           String title,
                           String description,
                           LocalDate releaseDate,
                           double rating,
                           List<CategoryResponse> categories,
                           List<StreamingResponse> streamings) {
}
