package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAMTECH device specifications for Android Compose previews.
 *
 * This extension provides SAMTECH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAMTECH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAMTECH: Any
  get() = object {
      /** SAMTECH TWIFI-06 */
      val TWIFI_06 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
