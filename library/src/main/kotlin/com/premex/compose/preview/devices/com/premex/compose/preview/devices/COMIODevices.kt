package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * COMIO device specifications for Android Compose previews.
 *
 * This extension provides COMIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.COMIO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.COMIO: Any
  get() = object {
      /** DeviceSpec(manufacturer=COMIO, code=ComioC1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioC1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOC1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioC1Pro, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioC1Pro, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOC1PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioC2, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioC2, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOC2 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioC2Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioC2Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOC2LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioP1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioP1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOP1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioS1, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioS1, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOS1 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioS1Lite, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioS1Lite, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val COMIOS1LITE = "spec:width=720,height=1280,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=COMIO, code=ComioX1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=COMIO, code=ComioX1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val COMIOX1 = "spec:width=720,height=1440,unit=px,dpi=320"

  }
