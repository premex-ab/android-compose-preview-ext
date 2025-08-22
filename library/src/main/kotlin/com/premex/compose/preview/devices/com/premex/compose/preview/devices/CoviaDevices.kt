package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * covia device specifications for Android Compose previews.
 *
 * This extension provides covia device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Covia.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Covia: Any
  get() = object {
      /** DeviceSpec(manufacturer=covia, code=CP-W5s, width=720, height=1280, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=covia, code=CP-W5s, width=720,
      height=1280, dpi=320, isGoogleDevice=false).code */
      val CP_W5S = "spec:width=720,height=1280,unit=px,dpi=320"

  }
