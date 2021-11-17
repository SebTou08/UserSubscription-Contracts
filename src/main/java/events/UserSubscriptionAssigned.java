package events;

import lombok.Value;

import java.time.LocalDateTime;

@Value
public class UserSubscriptionAssigned {
    String userSubscriptionId;
    LocalDateTime initialDate;
    LocalDateTime finalDate;
    String userId;
    String SubscriptionId;
}
