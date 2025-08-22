package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NELATECH device specifications for Android Compose previews.
 *
 * This extension provides NELATECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nelatech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nelatech: Any
  get() = object {
      /** NELATECH TAB8V1 */
      val TAB8V1 = "spec:width=800,height=1280,unit=px,dpi=240"

  }
