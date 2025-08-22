package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BYJUS device specifications for Android Compose previews.
 *
 * This extension provides BYJUS device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Byjus.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Byjus: Any
  get() = object {
      /** BYJUS LRN10 */
      val LRN10 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** BYJUS LRNS10GIL0 */
      val LRNS10GIL0 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
