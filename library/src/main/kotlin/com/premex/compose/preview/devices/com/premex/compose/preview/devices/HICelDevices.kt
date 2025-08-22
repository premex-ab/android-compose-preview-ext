package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HICel device specifications for Android Compose previews.
 *
 * This extension provides HICel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HICel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HICel: Any
  get() = object {
      /** DeviceSpec(manufacturer=HICel, code=SUN1, width=720, height=1600, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=HICel, code=SUN1, width=720,
      height=1600, dpi=320, isGoogleDevice=false).code */
      val SUN1 = "spec:width=720,height=1600,unit=px,dpi=320"

  }
