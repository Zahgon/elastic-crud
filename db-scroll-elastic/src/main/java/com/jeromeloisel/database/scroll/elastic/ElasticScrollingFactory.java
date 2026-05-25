package com.jeromeloisel.database.scroll.elastic;

import com.jeromeloisel.db.scroll.api.DatabaseScroll;
import com.jeromeloisel.db.scroll.api.DatabaseScrolling;
import com.jeromeloisel.db.scroll.api.DatabaseScrollingFactory;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.experimental.FieldDefaults;
import org.elasticsearch.action.search.SearchRequestBuilder;
import org.elasticsearch.client.Client;
import org.elasticsearch.common.unit.TimeValue;
import org.springframework.stereotype.Service;
import static com.google.common.collect.ImmutableList.copyOf;
import static java.util.Objects.requireNonNull;
import static lombok.AccessLevel.PACKAGE;
import static lombok.AccessLevel.PRIVATE;
import static org.elasticsearch.common.unit.TimeValue.timeValueMinutes;

@Service
@AllArgsConstructor(access = PACKAGE)
@FieldDefaults(level = PRIVATE, makeFinal = true)
public final class ElasticScrollingFactory implements DatabaseScrollingFactory {

    private static final TimeValue DEFAULT_SCROLL_TIME = timeValueMinutes(1);

    public static final int DEFAULT_SCROLL_SIZE = 100;

    @NonNull
    Client client;

    @Override
    public DatabaseScrolling newScroll(final String index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScrolling newScroll(final SearchRequestBuilder search) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScroll bulkDelete() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScroll bulkIndex() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public DatabaseScroll combine(final DatabaseScroll... scrolls) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
