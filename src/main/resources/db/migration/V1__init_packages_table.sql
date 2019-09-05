CREATE TABLE  packages(
  waybillNum VARCHAR(64)  PRIMARY KEY NOT NULL,
  recipients VARCHAR(64) NOT NULL,
  phoneNum  VARCHAR(64) NOT NULL,
  weight VARCHAR(64) NOT NULL
);
