package com.jeromeloisel.db.conversion.jackson;

import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jeromeloisel.db.conversion.api.JsonDeserializer;
import com.jeromeloisel.db.entity.Entity;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
final class JacksonJsonDeserializer<T extends Entity> implements JsonDeserializer<T> {

    @NonNull
    ObjectMapper mapper;

    @NonNull
    Class<T> clazz;

    @Override
    public T apply(final String json) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
