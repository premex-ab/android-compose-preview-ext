package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Maxis device specifications for Android Compose previews.
 *
 * This extension provides Maxis device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Maxis.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Maxis: Any
  get() = object {
      /** DeviceSpec(manufacturer=Maxis, code=VFD710, width=1080, height=1920, dpi=480,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Maxis, code=VFD710, width=1080,
      height=1920, dpi=480, isGoogleDevice=false).code */
      val VFD710 = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
