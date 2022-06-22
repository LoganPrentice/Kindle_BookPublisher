package com.amazon.ata.kindlepublishingservice.publishing;

import dagger.Provides;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

@Singleton
public class BookPublishRequestManager {

    private Queue<BookPublishRequest> bookPublishRequestQueue;

    @Inject
    public BookPublishRequestManager() {
        bookPublishRequestQueue = new ConcurrentLinkedQueue<>();
    }

    public void addBookPublishRequest(BookPublishRequest publishRequest) {
        bookPublishRequestQueue.add(publishRequest);
    }

    public BookPublishRequest getBookPublishRequest() {
        return bookPublishRequestQueue.poll();
    }

}
