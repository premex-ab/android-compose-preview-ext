package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ALTUS device specifications for Android Compose previews.
 *
 * This extension provides ALTUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ALTUS.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ALTUS: Any
  get() = object {
      /** DeviceSpec(manufacturer=ALTUS, code=sinchon, width=1080, height=1920, dpi=320,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ALTUS, code=sinchon, width=1080,
      height=1920, dpi=320, isGoogleDevice=false).code */
      val SINCHON = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
