#!/bin/sh
echo "Wait for MongoDB to come up at mongo-db:27017..."
while ! nc -z mongo-db 27017; do
  sleep 1
done

echo "Mongo is up! Starting mongo-express..."
exec node app.js --port 8083
