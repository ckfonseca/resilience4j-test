db = db.getSiblingDB("admin");

const appUser = process.env.MONGO_APP_USER || "default_user";
const appPassword = process.env.MONGO_APP_PASSWORD || "default_password";

db.createUser({
    user: appUser,
    pwd: appPassword,
    roles: [{ role: "readWriteAnyDatabase", db: "admin" }]
});

db = db.getSiblingDB("employee-db");
db.createCollection("employees");

print("Database employee-db created with success and user '" + appUser + "' created.");
