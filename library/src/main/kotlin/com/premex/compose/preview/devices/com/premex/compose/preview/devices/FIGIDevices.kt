package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FIGI device specifications for Android Compose previews.
 *
 * This extension provides FIGI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FIGI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FIGI: Any
  get() = object {
      /** DeviceSpec(manufacturer=FIGI, code=Mtwo, width=480, height=960, dpi=240,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Mtwo, width=480,
      height=960, dpi=240, isGoogleDevice=false).code */
      val MTWO = "spec:width=480,height=960,unit=px,dpi=240"

      /** DeviceSpec(manufacturer=FIGI, code=Note_11_Pro, width=720, height=1600, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Note_11_Pro, width=720,
      height=1600, dpi=280, isGoogleDevice=false).code */
      val NOTE_11_PRO = "spec:width=720,height=1600,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=FIGI, code=Note_1C, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Note_1C, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NOTE_1C = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FIGI, code=Note_1_Lite, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Note_1_Lite, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NOTE_1_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FIGI, code=Note_3_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Note_3_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_3_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FIGI, code=Note_5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Note_5, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val NOTE_5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=FIGI, code=Note_7_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=FIGI, code=Note_7_Pro, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val NOTE_7_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

  }
