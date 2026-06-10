Slot Management Module

Owner: Member 2

Create Slot
Endpoint
POST /api/slots
Request
{
  "doctorId": 1,
  "startTime": "2026-07-20T10:00:00",
  "endTime": "2026-07-20T10:30:00"
}
Response
{
  "slotId": 1001,
  "status": "AVAILABLE"
}
Get Available Slots
Endpoint
GET /api/slots/{doctorId}
Response
[
  {
    "slotId": 1001,
    "startTime": "2026-07-20T10:00:00",
    "endTime": "2026-07-20T10:30:00",
    "status": "AVAILABLE"
  }
]
Appointment Module

Owner: Member 2

Book Appointment
Endpoint
POST /api/appointments
Request
{
  "patientId": 1,
  "slotId": 1001
}
Response
{
  "appointmentId": 5001,
  "status": "PENDING_PAYMENT"
}
Cancel Appointment
Endpoint
PUT /api/appointments/{appointmentId}/cancel
Response
{
  "appointmentId": 5001,
  "status": "CANCELLED"
}
Reschedule Appointment
Endpoint
PUT /api/appointments/{appointmentId}/reschedule
Request
{
  "newSlotId": 1002
}
Response
{
  "appointmentId": 5001,
  "slotId": 1002,
  "status": "PENDING_PAYMENT"
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