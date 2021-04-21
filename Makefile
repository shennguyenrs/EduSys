ctags:
	@echo "--> Delete old tags file..."
	rm ./tags
	@echo "--> Updating tags file..."
	ctags --recurse=yes -h .java
	@echo "-> Done"

dev:
	@echo "--> Build and run developement application..."
	@if command -v gradle run @> /dev/null; then gradle run; else ./gradlew run; fi

build:
	@echo "--> Build application..."
	@if command -v gradle build @> /dev/null; then gradle build; else ./gradlew build; fi
	@echo "--> Set excuatable to JAR file..."
	@chmod +x ./app/build/libs/app.jar
	@echo "--> Done"

run:
	@echo "--> Running build file..."
	@java -jar ./app/build/libs/app.jar
