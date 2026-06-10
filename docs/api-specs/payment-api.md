Payment Module

Owner: Member 3

Create Payment
Endpoint
POST /api/payments/create
Request
{
  "appointmentId": 5001
}
Response
{
  "paymentId": 9001,
  "paymentUrl": "https://razorpay.com/payment-link"
}
Verify Payment
Endpoint
POST /api/payments/verify
Request
{
  "paymentId": 9001,
  "razorpayPaymentId": "pay_xxxxx"
}
Response
{
  "paymentId": 9001,
  "status": "SUCCESS"
}
Notification Module

Owner: Member 3

Send Notification
Endpoint
POST /api/notifications/send
Request
{
  "userId": 1,
  "message": "Appointment Confirmed"
}
Response
{
  "notificationId": 1001,
  "status": "SENT"
}
AI Assistant Module

Owner: Member 3

Chat
Endpoint
POST /api/chat
Request
{
  "message": "When is Dr Sharma available tomorrow?"
}
Response
{
  "response": "Dr Sharma is available at 11:00 AM and 4:30 PM."
}
Standard Error Response

All APIs should return errors in the following format.

{
  "timestamp": "2026-06-11T10:15:30",
  "status": 404,
  "error": "NOT_FOUND",
  "message": "Doctor not found",
  "path": "/api/doctors/1"
}



Authentication Rules

Protected APIs require:

Authorization: Bearer <JWT_TOKEN>

Public APIs:

POST /api/auth/register
POST /api/auth/login
POST /api/chat

All other APIs require authentication.

API Version

Current Version:

v1

Future format:

/api/v1/...