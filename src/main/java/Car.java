package org.acme.getting.started;

public class Car {
    private String thingId;
    private String policyId;
    private Attributes attributes;
    private Features features;

    public Car() {}

    public Car(String thingId, String policyId, Attributes attributes, Features features) {
        this.thingId = thingId;
        this.policyId = policyId;
        this.attributes = attributes;
        this.features = features;
    }

    public String getThingId() {
        return thingId;
    }

    public void setThingId(String thingId) {
        this.thingId = thingId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Features getFeatures() {
        return features;
    }

    public void setFeatures(Features features) {
        this.features = features;
    }

    public static class Attributes {
        private String timestamp;

        public Attributes() {}

        public Attributes(String timestamp) {
            this.timestamp = timestamp;
        }

        public String getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(String timestamp) {
            this.timestamp = timestamp;
        }
    }

    public static class Features {
        private Location location;
        private Vehicle vehicle;
        private TirePressure tirePressure;

        public Features() {}

        public Features(Location location, Vehicle vehicle, TirePressure tirePressure) {
            this.location = location;
            this.vehicle = vehicle;
            this.tirePressure = tirePressure;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public Vehicle getVehicle() {
            return vehicle;
        }

        public void setVehicle(Vehicle vehicle) {
            this.vehicle = vehicle;
        }

        public TirePressure getTirePressure() {
            return tirePressure;
        }

        public void setTirePressure(TirePressure tirePressure) {
            this.tirePressure = tirePressure;
        }

        public static class Location {
            private LocationProperties properties;

            public Location() {}

            public Location(LocationProperties properties) {
                this.properties = properties;
            }

            public LocationProperties getProperties() {
                return properties;
            }

            public void setProperties(LocationProperties properties) {
                this.properties = properties;
            }

            public static class LocationProperties {
                private double latitude;
                private double longitude;

                public LocationProperties() {}

                public LocationProperties(double latitude, double longitude) {
                    this.latitude = latitude;
                    this.longitude = longitude;
                }

                public double getLatitude() {
                    return latitude;
                }

                public void setLatitude(double latitude) {
                    this.latitude = latitude;
                }

                public double getLongitude() {
                    return longitude;
                }

                public void setLongitude(double longitude) {
                    this.longitude = longitude;
                }
            }
        }

        public static class Vehicle {
            private VehicleProperties properties;

            public Vehicle() {}

            public Vehicle(VehicleProperties properties) {
                this.properties = properties;
            }

            public VehicleProperties getProperties() {
                return properties;
            }

            public void setProperties(VehicleProperties properties) {
                this.properties = properties;
            }

            public static class VehicleProperties {
                private double speed;
                private double fuelLevel;
                private double engineTemperature;
                private int rpm;
                private double batteryVoltage;
                private double odometer;

                public VehicleProperties() {}

                public VehicleProperties(double speed, double fuelLevel, double engineTemperature, int rpm, double batteryVoltage, double odometer) {
                    this.speed = speed;
                    this.fuelLevel = fuelLevel;
                    this.engineTemperature = engineTemperature;
                    this.rpm = rpm;
                    this.batteryVoltage = batteryVoltage;
                    this.odometer = odometer;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public double getFuelLevel() {
                    return fuelLevel;
                }

                public void setFuelLevel(double fuelLevel) {
                    this.fuelLevel = fuelLevel;
                }

                public double getEngineTemperature() {
                    return engineTemperature;
                }

                public void setEngineTemperature(double engineTemperature) {
                    this.engineTemperature = engineTemperature;
                }

                public int getRpm() {
                    return rpm;
                }

                public void setRpm(int rpm) {
                    this.rpm = rpm;
                }

                public double getBatteryVoltage() {
                    return batteryVoltage;
                }

                public void setBatteryVoltage(double batteryVoltage) {
                    this.batteryVoltage = batteryVoltage;
                }

                public double getOdometer() {
                    return odometer;
                }

                public void setOdometer(double odometer) {
                    this.odometer = odometer;
                }
            }
        }

        public static class TirePressure {
            private TirePressureProperties properties;

            public TirePressure() {}

            public TirePressure(TirePressureProperties properties) {
                this.properties = properties;
            }

            public TirePressureProperties getProperties() {
                return properties;
            }

            public void setProperties(TirePressureProperties properties) {
                this.properties = properties;
            }

            public static class TirePressureProperties {
                private double frontLeft;
                private double frontRight;
                private double rearLeft;
                private double rearRight;

                public TirePressureProperties() {}

                public TirePressureProperties(double frontLeft, double frontRight, double rearLeft, double rearRight) {
                    this.frontLeft = frontLeft;
                    this.frontRight = frontRight;
                    this.rearLeft = rearLeft;
                    this.rearRight = rearRight;
                }

                public double getFrontLeft() {
                    return frontLeft;
                }

                public void setFrontLeft(double frontLeft) {
                    this.frontLeft = frontLeft;
                }

                public double getFrontRight() {
                    return frontRight;
                }

                public void setFrontRight(double frontRight) {
                    this.frontRight = frontRight;
                }

                public double getRearLeft() {
                    return rearLeft;
                }

                public void setRearLeft(double rearLeft) {
                    this.rearLeft = rearLeft;
                }

                public double getRearRight() {
                    return rearRight;
                }

                public void setRearRight(double rearRight) {
                    this.rearRight = rearRight;
                }
            }
        }
    }
}
