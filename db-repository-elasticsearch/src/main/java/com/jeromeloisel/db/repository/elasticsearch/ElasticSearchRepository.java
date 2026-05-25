package com.jeromeloisel.db.repository.elasticsearch;

import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList.Builder;
import com.google.common.collect.ImmutableSet;
import com.jeromeloisel.db.conversion.api.JsonDeserializer;
import com.jeromeloisel.db.conversion.api.JsonSerializer;
import com.jeromeloisel.db.entity.Entity;
import com.jeromeloisel.db.repository.api.DatabaseRepository;
import com.jeromeloisel.db.scroll.api.DatabaseScrollingFactory;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.elasticsearch.action.bulk.BulkItemResponse;
import org.elasticsearch.action.bulk.BulkRequestBuilder;
import org.elasticsearch.action.bulk.BulkResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.get.MultiGetItemResponse;
import org.elasticsearch.action.get.MultiGetResponse;
import org.elasticsearch.action.index.IndexRequestBuilder;
import org.elasticsearch.action.support.WriteRequest;
import org.elasticsearch.client.Client;
import org.elasticsearch.index.query.QueryBuilder;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import static com.google.common.base.Strings.emptyToNull;
import static java.util.Optional.ofNullable;
import static java.util.stream.Collectors.toList;
import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;
import static org.elasticsearch.common.xcontent.XContentType.JSON;

@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
final class ElasticSearchRepository<T extends Entity> implements DatabaseRepository<T> {

    @VisibleForTesting
    public static final int SCROLL_SIZE = 100;

    @NonNull
    String index;

    @NonNull
    String type;

    @NonNull
    Client client;

    @NonNull
    JsonSerializer<T> serializer;

    @NonNull
    JsonDeserializer<T> deserializer;

    @NonNull
    DatabaseScrollingFactory scrolling;

    @NonNull
    AtomicReference<WriteRequest.RefreshPolicy> policy;

    @Override
    public List<T> search(final QueryBuilder query) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void deleteAllByQuery(final QueryBuilder query) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void scroll(final QueryBuilder query, final Consumer<T> consumer) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public T save(final T entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<T> saveAll(final List<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean exists(final T entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean exists(final String id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    @Override
    public Optional<T> findOne(final String id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> findAll(final List<String> ids) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String delete(final T entity) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<String> deleteAll(final Collection<T> entities) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String delete(final String id) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<String> deleteAllIds(final Collection<String> ids) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void refreshPolicy(final WriteRequest.RefreshPolicy refresh) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
