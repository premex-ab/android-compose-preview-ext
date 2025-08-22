package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * VISUAL-LAND device specifications for Android Compose previews.
 *
 * This extension provides VISUAL-LAND device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.VisualLand.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.VisualLand: Any
  get() = object {
      /** VISUAL-LAND Elite10QH */
      val ELITE10QH = "spec:width=800,height=1280,unit=px,dpi=213"

      /** VISUAL-LAND Elite10QHPro */
      val ELITE10QHPRO = "spec:width=800,height=1280,unit=px,dpi=200"

  }
