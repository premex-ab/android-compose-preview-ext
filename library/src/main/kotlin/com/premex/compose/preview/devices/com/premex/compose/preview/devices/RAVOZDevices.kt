package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * RAVOZ device specifications for Android Compose previews.
 *
 * This extension provides RAVOZ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.RAVOZ.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.RAVOZ: Any
  get() = object {
      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V2, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V2, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_V2 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V3, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V3, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_V3 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V5, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V5, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_V5 = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V6, width=720, height=1612, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V6, width=720,
      height=1612, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_V6 = "spec:width=720,height=1612,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V7, width=720, height=1600, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V7, width=720,
      height=1600, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_V7 = "spec:width=720,height=1600,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V8, width=720, height=1640, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V8, width=720,
      height=1640, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_V8 = "spec:width=720,height=1640,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V9, width=720, height=1612, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_V9, width=720,
      height=1612, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_V9 = "spec:width=720,height=1612,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z3, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z3, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z3 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z3_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z3_Lite,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z3_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z3_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z3_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z3_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z4, width=720, height=1520, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z4, width=720,
      height=1520, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z4 = "spec:width=720,height=1520,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z5, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z5, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z5 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z5_Lite, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z5_Lite,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z5_LITE = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z5_Pro, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z5_Pro,
      width=720, height=1560, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z5_PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z6, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z6, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z6 = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z6_Lite, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z6_Lite,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z6_LITE = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z6_Pro, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z6_Pro,
      width=720, height=1600, dpi=320, isGoogleDevice=false).code */
      val RAVOZ_Z6_PRO = "spec:width=720,height=1600,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z7, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z7, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_Z7 = "spec:width=1080,height=2340,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z7_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z7_Pro,
      width=1080, height=2400, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_Z7_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z8, width=1080, height=2340, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=RAVOZ, code=RAVOZ_Z8, width=1080,
      height=2340, dpi=480, isGoogleDevice=false).code */
      val RAVOZ_Z8 = "spec:width=1080,height=2340,unit=px,dpi=480"

  }
