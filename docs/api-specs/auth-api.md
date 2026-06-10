Authentication Module

Owner: Member 1

Register Patient
Endpoint
POST /api/auth/register
Request
{
  "name": "Parth Khandelwal",
  "email": "parth@gmail.com",
  "password": "password123",
  "phone": "9876543210"
}
Response
{
  "userId": 1,
  "patientId": 1,
  "message": "Registration Successful"
}
Login
Endpoint
POST /api/auth/login
Request
{
  "email": "parth@gmail.com",
  "password": "password123"
}
Response
{
  "token": "jwt-token",
  "userId": 1,
  "role": "PATIENT"
}
Doctor Management Module

Owner: Member 1

Create Doctor
Endpoint
POST /api/admin/doctors
Request
{
  "name": "Dr Sharma",
  "email": "drsharma@gmail.com",
  "password": "doctor123",
  "specialization": "Dentist",
  "consultationFee": 500,
  "experienceYears": 8
}
Response
{
  "doctorId": 1,
  "message": "Doctor Created Successfully"
}
Get Doctor Profile
Endpoint
GET /api/doctors/{doctorId}
Response
{
  "doctorId": 1,
  "name": "Dr Sharma",
  "specialization": "Dentist",
  "consultationFee": 500,
  "experienceYears": 8
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