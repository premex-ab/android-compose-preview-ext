package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MarkaTab device specifications for Android Compose previews.
 *
 * This extension provides MarkaTab device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Markatab.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Markatab: Any
  get() = object {
      /** MarkaTab Markatab-1 */
      val MARKATAB_1 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** MarkaTab Speadtrum */
      val SPEADTRUM = "spec:width=800,height=1280,unit=px,dpi=213"

  }
