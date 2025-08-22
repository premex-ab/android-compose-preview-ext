package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * 10or device specifications for Android Compose previews.
 *
 * This extension provides 10or device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices._10or.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices._10or: Any
  get() = object {
      /** DeviceSpec(manufacturer=10or, code=E, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=10or, code=E, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val E = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=10or, code=G, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=10or, code=G, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val G = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=10or, code=G2, width=1080, height=2246, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=10or, code=G2, width=1080,
      height=2246, dpi=480, isGoogleDevice=false).code */
      val G2 = "spec:width=1080,height=2246,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=10or, code=10or_D, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=10or, code=10or_D, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val _10OR_D = "spec:width=720,height=1280,unit=px,dpi=320"

  }
