package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SONEVIEW device specifications for Android Compose previews.
 *
 * This extension provides SONEVIEW device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SONEVIEW.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SONEVIEW: Any
  get() = object {
      /** DeviceSpec(manufacturer=SONEVIEW, code=mountbaker, width=720, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=SONEVIEW, code=mountbaker,
      width=720, height=1280, dpi=213, isGoogleDevice=false).code */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

  }
