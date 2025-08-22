package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ARATEK device specifications for Android Compose previews.
 *
 * This extension provides ARATEK device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ARATEK.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ARATEK: Any
  get() = object {
      /** DeviceSpec(manufacturer=ARATEK, code=Marshall-8, width=800, height=1280, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ARATEK, code=Marshall-8, width=800,
      height=1280, dpi=160, isGoogleDevice=false).code */
      val MARSHALL_8 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
