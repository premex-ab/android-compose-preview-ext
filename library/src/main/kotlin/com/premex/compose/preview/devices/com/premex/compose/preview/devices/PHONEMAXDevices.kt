package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PHONEMAX device specifications for Android Compose previews.
 *
 * This extension provides PHONEMAX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PHONEMAX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PHONEMAX: Any
  get() = object {
      /** DeviceSpec(manufacturer=PHONEMAX, code=M10, width=1080, height=2280, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=M10, width=1080,
      height=2280, dpi=480, isGoogleDevice=false).code */
      val M10 = "spec:width=1080,height=2280,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=PHONEMAX, code=M3PRO, width=720, height=1560, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=M3PRO, width=720,
      height=1560, dpi=320, isGoogleDevice=false).code */
      val M3PRO = "spec:width=720,height=1560,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHONEMAX, code=P1000, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=P1000, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P1000 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=PHONEMAX, code=P20_Pro, width=1080, height=2400, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=P20_Pro, width=1080,
      height=2400, dpi=480, isGoogleDevice=false).code */
      val P20_PRO = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=PHONEMAX, code=R4_GT, width=540, height=1200, dpi=280,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=R4_GT, width=540,
      height=1200, dpi=280, isGoogleDevice=false).code */
      val R4_GT = "spec:width=540,height=1200,unit=px,dpi=280"

      /** DeviceSpec(manufacturer=PHONEMAX, code=X1, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=X1, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X1 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** DeviceSpec(manufacturer=PHONEMAX, code=X1_Pro, width=720, height=1440, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=PHONEMAX, code=X1_Pro, width=720,
      height=1440, dpi=320, isGoogleDevice=false).code */
      val X1_PRO = "spec:width=720,height=1440,unit=px,dpi=320"

  }
