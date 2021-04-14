tags:
	@echo "Updating tags file..."
	ctags --recurse=yes -h .java
	@echo "Done"

dev:
	if command -v gradle run @> /dev/null; then \
		gradle run; \
	else \
		./gradlew run; \
	fi

build:
	if command -v gradle build @> /dev/null; then \
		gradle build; \
	else \
		./gradlew build; \
	fi
	chmod +x ./app/build/libs/app.jar

run:
	java -jar ./app/build/libs/app.jar

