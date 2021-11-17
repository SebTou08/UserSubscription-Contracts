package commands;

import lombok.Value;
import org.axonframework.modelling.command.TargetAggregateIdentifier;

import java.time.LocalDateTime;

@Value
public class AssingSubscriptionToUser {
    @TargetAggregateIdentifier
    String userSubscriptionId;
    LocalDateTime initialDate;
    LocalDateTime finalDate;
    String userId;
    String SubscriptionId;

}
