package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZEKI device specifications for Android Compose previews.
 *
 * This extension provides ZEKI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ZEKI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ZEKI: Any
  get() = object {
      /** DeviceSpec(manufacturer=ZEKI, code=TBQG1031, width=800, height=1280, dpi=213,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=ZEKI, code=TBQG1031, width=800,
      height=1280, dpi=213, isGoogleDevice=false).code */
      val TBQG1031 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
