package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * NORTH_TECH device specifications for Android Compose previews.
 *
 * This extension provides NORTH_TECH device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.NorthTech.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.NorthTech: Any
  get() = object {
      /** NORTH_TECH NT-S10 */
      val NT_S10 = "spec:width=600,height=1024,unit=px,dpi=160"

  }
