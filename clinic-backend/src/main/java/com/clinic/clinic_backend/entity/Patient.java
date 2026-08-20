package com.clinic.clinic_backend.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "patients")
@Getter
@Setter
@NoArgsConstructor
public class Patient extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false, unique = true)
    private User user;

    // Deliberately thin for now — your contract's GET /patients/me
    // only returns name/email/phone, which live on User.
    // This table exists so patient-specific fields (medical history,
    // date of birth, etc.) have somewhere to go later without
    // touching the User/auth table.
}