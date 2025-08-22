package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Wind device specifications for Android Compose previews.
 *
 * This extension provides Wind device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Wind.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Wind: Any
  get() = object {
      /** DeviceSpec(manufacturer=Wind, code=uzw4030wnh, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Wind, code=uzw4030wnh, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val UZW4030WNH = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
