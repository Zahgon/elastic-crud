package com.jeromeloisel.db.conversion.jackson;

import static lombok.AccessLevel.PRIVATE;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jeromeloisel.db.conversion.api.JsonDeserializer;
import com.jeromeloisel.db.conversion.api.JsonSerializationFactory;
import com.jeromeloisel.db.conversion.api.JsonSerializer;
import com.jeromeloisel.db.entity.Entity;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = PRIVATE, makeFinal = true)
@AllArgsConstructor
public final class JacksonSerializationFactory implements JsonSerializationFactory {

    @NonNull
    ObjectMapper mapper;

    @Override
    public <T extends Entity> JsonSerializer<T> serializer(final Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public <T extends Entity> JsonDeserializer<T> deserializer(final Class<T> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
