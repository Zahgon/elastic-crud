package com.jeromeloisel.database.scroll.elastic;

import com.jeromeloisel.db.scroll.api.DatabaseScroll;
import com.jeromeloisel.db.scroll.api.DatabaseScrolling;
import lombok.experimental.FieldDefaults;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.unit.TimeValue;
import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.sort.FieldSortBuilder;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import static java.util.Objects.requireNonNull;
import static lombok.AccessLevel.PRIVATE;
import static org.elasticsearch.search.sort.SortBuilders.fieldSort;

@FieldDefaults(level = PRIVATE, makeFinal = true)
final class ElasticScroll implements DatabaseScrolling {

    private static final FieldSortBuilder DEFAULT_SORT = fieldSort("_doc");

    Client client;

    SearchRequestBuilder search;

    AtomicReference<FieldSortBuilder> sort;

    AtomicReference<TimeValue> scrollTime;

    ElasticScroll(final Client client, final SearchRequestBuilder search, final TimeValue timeValue) {
        super();
        this.client = requireNonNull(client);
        this.search = requireNonNull(search);
        this.sort = new AtomicReference<>(DEFAULT_SORT);
        this.scrollTime = new AtomicReference<>(requireNonNull(timeValue));
    }

    @Override
    public DatabaseScrolling withSort(final FieldSortBuilder s) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScrolling withScrollSize(final int size) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScrolling withKeepAlive(final long time, final TimeUnit unit) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScrolling withTypes(final String... types) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScrolling withFetchSource(final boolean fetchSource) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScrolling withQuery(final QueryBuilder query) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void scroll(final DatabaseScroll scroll) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
