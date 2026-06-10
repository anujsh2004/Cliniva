# Cliniva Database Schema

1.Table: users

user_id (PK)
name
email
password
role
created_at
updated_at

2.Table: doctors

doctor_id (PK)
user_id (FK -> users.user_id)
specialization
consultation_fee
experience_years

3.Table: patients

patient_id (PK)
user_id (FK -> users.user_id)
phone
date_of_birth
gender


4.Table: slots

slot_id (PK)
doctor_id (FK)
start_time
end_time
status


5.Table: appointments

appointment_id (PK)
patient_id (FK)
slot_id (FK)
status
created_at



6.Table: payments

payment_id (PK)
appointment_id (FK)
amount
status
transaction_id
created_at



7.Table: notifications

notification_id (PK)
user_id (FK)
message
status
created_at