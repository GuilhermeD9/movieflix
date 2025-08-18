package com.movieflix.controller.request;

import jakarta.validation.constraints.NotEmpty;

public record CategoryRequest(@NotEmpty(message = "Nome da cateogoria é obrigatório.") String name) {
}
