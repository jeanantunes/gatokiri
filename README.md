# Gato Ki Ri Store

**Maven Commands**
```
mvn dependency:purge-local-repository
mvn package
mvn clean install
mvn spring-boot:run
fuser -k 9090/tcp
```
**Heroku Commands**
```
heroku create gatokiri --buildpack heroku/java
heroku buildpacks:set https://git.heroku.com/gatokiri.git
git push heroku master

heroku ps
heroku ps:scale web=1

heroku addons

heroku restart
heroku open local
heroku open

heroku logs --tail
heroku --version
heroku pg:info

heroku pg:psql postgresql-convex-47590 --app gatokiri

git remote -v
git remote rm heroku
heroku git:remote -a https://git.heroku.com/gatokiri.git
```