package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MoT device specifications for Android Compose previews.
 *
 * This extension provides MoT device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Mot.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Mot: Any
  get() = object {
      /** MoT S22-8A */
      val S22_8A = "spec:width=800,height=1280,unit=px,dpi=320"

  }
