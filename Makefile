BASE_DIR := $(patsubst %/,%,$(dir $(abspath $(lastword $(MAKEFILE_LIST)))))

ifdef ($(shell sudo type -p sudo 2> /dev/null))
	SUDO_EXEC = sudo
else
	SUDO_EXEC = 
endif

install:

	$(SUDO_EXEC) apt-get -y update
	$(SUDO_EXEC) apt-get install -y vim tmux git
	$(SUDO_EXEC) apt-get install -y software-properties-common
	$(SUDO_EXEC) add-apt-repository -y ppa:webupd8team/java
	$(SUDO_EXEC) echo "oracle-java8-installer shared/accepted-oracle-license-v1-1 select true" | $(SUDO_EXEC) debconf-set-selections
	$(SUDO_EXEC) yes | apt-get install -y oracle-java8-installer
	$(SUDO_EXEC) apt-get install -y oracle-java8-set-default
	$(SUDO_EXEC) apt-get install -y curl
	mkdir -p $(BASE_DIR)/android-studio-ide-182.5314842-linux && cd $(BASE_DIR)/android-studio-ide-182.5314842-linux; curl https://dl.google.com/dl/android/studio/ide-zips/3.3.2.0/android-studio-ide-182.5314842-linux.zip | jar -x
