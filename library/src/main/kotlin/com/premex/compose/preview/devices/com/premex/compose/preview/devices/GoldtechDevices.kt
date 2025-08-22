package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Goldtech device specifications for Android Compose previews.
 *
 * This extension provides Goldtech device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Goldtech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Goldtech: Any
  get() = object {
      /** DeviceSpec(manufacturer=Goldtech, code=JTTAB035, width=600, height=1024, dpi=160,
      isGoogleDevice=false).manufacturer DeviceSpec(manufacturer=Goldtech, code=JTTAB035, width=600,
      height=1024, dpi=160, isGoogleDevice=false).code */
      val JTTAB035 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
