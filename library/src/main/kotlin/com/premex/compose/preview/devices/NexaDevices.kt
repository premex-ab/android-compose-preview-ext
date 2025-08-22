package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NEXA device specifications for Android Compose previews.
 *
 * This extension provides NEXA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Nexa.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Nexa: Any
  get() = object {
      /** NEXA NexaN5a */
      val NEXAN5A = "spec:width=480,height=854,unit=px,dpi=240"

  }
