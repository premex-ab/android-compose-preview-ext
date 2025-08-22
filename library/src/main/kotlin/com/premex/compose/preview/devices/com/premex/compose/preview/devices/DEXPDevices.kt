package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DEXP device specifications for Android Compose previews.
 *
 * This extension provides DEXP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.DEXP.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.DEXP: Any
  get() = object {
      /** DeviceSpec(manufacturer=DEXP, code=A160, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A160, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val A160 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=A250, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A250, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A250 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=A350, width=480, height=854, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A350, width=480,
      height=854, dpi=213, isGoogleDevice=false).code */
      val A350 = "spec:width=480,height=854,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=A355, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A355, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val A355 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=A360, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A360, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val A360 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=A440, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A440, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val A440 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=A455, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A455, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val A455 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=A555, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=A555, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val A555 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=AL250, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=AL250, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val AL250 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=AL350, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=AL350, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val AL350 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=AS155, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=AS155, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val AS155 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=AS260, width=720, height=1512, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=AS260, width=720,
      height=1512, dpi=320, isGoogleDevice=false).code */
      val AS260 = "spec:width=720,height=1512,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=AS360, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=AS360, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val AS360 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=B11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=B17, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B17, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val B17 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=B18, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B18, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val B18 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=B21, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B21, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val B21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=B27, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B27, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val B27 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=B28, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B28, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val B28 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=B31, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B31, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=B340, width=480, height=800, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B340, width=480,
      height=800, dpi=240, isGoogleDevice=false).code */
      val B340 = "spec:width=480,height=800,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=B355, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B355, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val B355 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=B38, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B38, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val B38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=B450, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=B450, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val B450 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=BL150, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=BL150, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BL150 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=BL155, width=480, height=960, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=BL155, width=480,
      height=960, dpi=213, isGoogleDevice=false).code */
      val BL155 = "spec:width=480,height=960,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=BL160, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=BL160, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val BL160 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=BL250, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=BL250, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val BL250 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=BL350, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=BL350, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val BL350 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=BS155, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=BS155, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val BS155 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=C18, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=C18, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C18 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=C37, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=C37, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C37 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=C38, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=C38, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val C38 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=D11, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=D11, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val D11 = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=DEXP, code=D21, width=1200, height=2000, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=D21, width=1200,
      height=2000, dpi=320, isGoogleDevice=false).code */
      val D21 = "spec:width=1200,height=2000,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=E110, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=E110, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=E170, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=E170, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val E170 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=E180, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=E180, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E180 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=E210, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=E210, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val E210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=EX111, width=1080, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=EX111, width=1080,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val EX111 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=G255, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=G255, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G255 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=G450, width=480, height=854, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=G450, width=480,
      height=854, dpi=240, isGoogleDevice=false).code */
      val G450 = "spec:width=480,height=854,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=G450_2021, width=480, height=854, dpi=220,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=G450_2021, width=480,
      height=854, dpi=220, isGoogleDevice=false).code */
      val G450_2021 = "spec:width=480,height=854,unit=px,dpi=220"

      /** DeviceSpec(manufacturer=DEXP, code=G550, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=G550, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val G550 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=GL355, width=640, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=GL355, width=640,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val GL355 = "spec:width=640,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=GS155, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=GS155, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val GS155 = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=H110, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H110, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=H210, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H210, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val H210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=H270, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H270, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val H270 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=H28, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H28, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val H28 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=H310, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H310, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val H310 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=H370, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H370, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val H370 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=H410, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=H410, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val H410 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=K11, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K11, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K11 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=K17, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K17, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val K17 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=K18, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K18, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K18 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=K21, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K21, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val K21 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=K28_, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K28_, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val K28 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=K28, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K28, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val K28 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=K31_, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K31_, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=K31, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K31, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K31 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=K38, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K38, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val K38 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=K41, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K41, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K41 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=K41_, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K41_, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K41 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=K48, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K48, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K48 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=K51, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K51, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val K51 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=K61, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=K61, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val K61 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=L110, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L110, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val L110 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=L180, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L180, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L180 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=L210, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L210, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val L210 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=L270, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L270, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val L270 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=L310i, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L310i, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val L310I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=L370i, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L370i, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val L370I = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=L470, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=L470, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val L470 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=M110, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=M110, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val M110 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=M170, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=M170, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val M170 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=M210, width=1200, height=1920, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=M210, width=1200,
      height=1920, dpi=240, isGoogleDevice=false).code */
      val M210 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=N180i, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N180i, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N180I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N210, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N210, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N210 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N280, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N280, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N280 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N280i, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N280i, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N280I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N310, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N310, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N310 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N370, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N370, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val N370 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N380i, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N380i, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N380I = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N410, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N410, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val N410 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=N570, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=N570, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val N570 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=P11, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P11, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P11 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=P210, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P210, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P210 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=P280, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P280, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P280 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=P350, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P350, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val P350 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=P380, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P380, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P380 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=P380i, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P380i, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val P380I = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=P410, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P410, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P410 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=P510, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=P510, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val P510 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=Q110, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Q110, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q110 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=Q180, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Q180, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q180 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=Q210, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Q210, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q210 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=Q280, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Q280, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q280 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=Q310, width=1200, height=1920, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Q310, width=1200,
      height=1920, dpi=280, isGoogleDevice=false).code */
      val Q310 = "spec:width=1200,height=1920,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=DEXP, code=R110, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=R110, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val R110 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=R180, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=R180, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val R180 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=S110, width=1200, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S110, width=1200,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val S110 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=S169, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S169, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S169 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S190, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S190, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S190 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S270i, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S270i, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S270I = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S280, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S280, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val S280 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=S290, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S290, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val S290 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S370, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S370, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S370 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S470, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S470, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val S470 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=S570, width=600, height=1024, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S570, width=600,
      height=1024, dpi=213, isGoogleDevice=false).code */
      val S570 = "spec:width=600,height=1024,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=S670, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S670, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S670 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S770, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S770, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S770 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=S770i, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=S770i, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val S770I = "spec:width=600,height=1024,unit=px,dpi=160"

      /** DeviceSpec(manufacturer=DEXP, code=SENIOR, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=SENIOR, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val SENIOR = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=T155, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=T155, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val T155 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=T21, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=T21, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val T21 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=VA110, width=800, height=1280, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=VA110, width=800,
      height=1280, dpi=240, isGoogleDevice=false).code */
      val VA110 = "spec:width=800,height=1280,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=DEXP, code=VA210, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=VA210, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val VA210 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** DeviceSpec(manufacturer=DEXP, code=XL150, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=XL150, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val XL150 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=Z250, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Z250, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val Z250 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=DEXP, code=Z455, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=DEXP, code=Z455, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val Z455 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
