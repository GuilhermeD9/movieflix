package com.movieflix.mapper;

import com.movieflix.entity.Streaming;
import com.movieflix.request.StreamingRequest;
import com.movieflix.response.StreamingResponse;

public class StreamingMapper {
    public static Streaming toStreaming(StreamingRequest streamingRequest) {
        return new Streaming(null, streamingRequest.name());
    }

    public static StreamingResponse toStreamingResponse(Streaming streaming) {
        return new StreamingResponse(streaming.getId(), streaming.getName());
    }
}
