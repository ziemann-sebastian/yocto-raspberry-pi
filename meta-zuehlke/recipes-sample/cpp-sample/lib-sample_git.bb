SUMMARY = "cpp-sample library to use in combination with sample application to show cmake integration"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/ziemann-sebastian/cpp-sample.git;protocol=https;branch=main"

PV = "1.0+git${SRCPV}"
SRCREV = "${AUTOREV}" 

S = "${WORKDIR}/git/lib"

inherit cmake
