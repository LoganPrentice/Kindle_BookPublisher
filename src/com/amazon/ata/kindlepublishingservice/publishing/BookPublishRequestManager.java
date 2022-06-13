package com.amazon.ata.kindlepublishingservice.publishing;

import dagger.Provides;

import javax.inject.Inject;
import java.util.LinkedList;
import java.util.Queue;

public class BookPublishRequestManager {

    public Queue<BookPublishRequest> bookPublishRequestQueue;

    @Inject
    public BookPublishRequestManager() {
        bookPublishRequestQueue = new LinkedList<>();
    }

    public void addBookPublishRequest(BookPublishRequest publishRequest) {
        bookPublishRequestQueue.add(publishRequest);
    }

    public BookPublishRequest getBookPublishRequest() {
        return bookPublishRequestQueue.peek();
    }
}
