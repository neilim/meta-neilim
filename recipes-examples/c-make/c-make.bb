SUMMARY = "C Makfile recipe"
DESCRIPTION = "This is a simple recipe with a very simple C program and Makefile"
LICENSE = "CLOSED"

SRC_URI = "file://main.c \
			file://Makefile"
S = "${WORKDIR}"



do_compile(){
	oe_runmake
}

do_install(){
	install -d ${D}${bindir}
	install -m 0755 c-make ${D}${bindir}
}

FILES+${PN} += "${bindir}/c-make"

