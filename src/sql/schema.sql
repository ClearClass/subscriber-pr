CREATE TABLE purchase (
   id        bigint,
   msisdn    integer,
   timestamp bigint NOT NULL,
   CONSTRAINT purchase_pkey PRIMARY KEY(id, msisdn)
);

CREATE TABLE subscription (
   id        bigint,
   msisdn    integer,
   timestamp bigint NOT NULL,
   CONSTRAINT subscription_pkey PRIMARY KEY(id, msisdn)
);