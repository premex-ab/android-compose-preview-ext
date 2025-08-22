package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * IVA device specifications for Android Compose previews.
 *
 * This extension provides IVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Iva.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Iva: Any
  get() = object {
      /** IVA LAMCY_L400 */
      val LAMCY_L400 = "spec:width=480,height=960,unit=px,dpi=240"

  }
