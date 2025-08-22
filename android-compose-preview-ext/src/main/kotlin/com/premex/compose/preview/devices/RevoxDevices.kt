package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * REVOX device specifications for Android Compose previews.
 *
 * This extension provides REVOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Revox.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Revox: Any
  get() = object {
      /** REVOX REVOX-RM-RX1-EU */
      val REVOX_RM_RX1_EU = "spec:width=480,height=1170,unit=px,dpi=240"

  }
