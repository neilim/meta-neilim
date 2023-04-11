APP = c-make

APP_OBJS = main.o

all:build

build: $(APP)

$(APP): $(APP_OBJS)
	$(CC) $(LDFLAGS) -o $@ $(APP_OBJS) $(LDLIBS)

clean:
	$(RM) $(APP) $(OBJS)
