package com.amazon.ata.kindlepublishingservice.converters;

import com.amazon.ata.kindlepublishingservice.dynamodb.models.PublishingStatusItem;
import com.amazon.ata.kindlepublishingservice.models.PublishingStatusRecord;

import java.util.ArrayList;
import java.util.List;

public class PublishingRecordConverter {

    public PublishingRecordConverter() {}

    public static List<PublishingStatusRecord> convert(List<PublishingStatusItem> publishingStatusItemList) {
        List<PublishingStatusRecord> result = new ArrayList<>();
        for(PublishingStatusItem item : publishingStatusItemList) {
            PublishingStatusRecord record = PublishingStatusRecord.builder()
                    .withBookId(item.getBookId())
                    .withStatus(item.getStatus().toString())
                    .withStatusMessage(item.getStatusMessage())
                    .build();
            result.add(record);
        }
        return result;
    }
}
