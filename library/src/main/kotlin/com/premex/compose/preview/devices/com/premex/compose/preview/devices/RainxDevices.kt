package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * rainx device specifications for Android Compose previews.
 *
 * This extension provides rainx device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Rainx.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Rainx: Any
  get() = object {
      /** DeviceSpec(manufacturer=rainx, code=the101loop, width=1080, height=1920, dpi=400,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=rainx, code=the101loop, width=1080,
      height=1920, dpi=400, isGoogleDevice=false).code */
      val THE101LOOP = "spec:width=1080,height=1920,unit=px,dpi=400"

  }
