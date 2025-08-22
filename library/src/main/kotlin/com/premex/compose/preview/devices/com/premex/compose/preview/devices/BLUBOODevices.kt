package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BLUBOO device specifications for Android Compose previews.
 *
 * This extension provides BLUBOO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BLUBOO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BLUBOO: Any
  get() = object {
      /** DeviceSpec(manufacturer=BLUBOO, code=S1a, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUBOO, code=S1a, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val S1A = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** DeviceSpec(manufacturer=BLUBOO, code=S3, width=1080, height=2160, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=BLUBOO, code=S3, width=1080,
      height=2160, dpi=480, isGoogleDevice=false).code */
      val S3 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
