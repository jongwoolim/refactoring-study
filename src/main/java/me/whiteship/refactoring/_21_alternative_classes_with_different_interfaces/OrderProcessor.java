package me.whiteship.refactoring._21_alternative_classes_with_different_interfaces;

public class OrderProcessor {
    protected NotificationService notificationService;

    public OrderProcessor(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void notifyShipping(Shipping shipping) {
        Notification notification = Notification.newNotification(shipping.getOrder() + " us shipped")
                .receiver(shipping.getEmail())
                .sender("no-reply@whiteship.co");
        notificationService.sendNotification(notification);
    }

}
