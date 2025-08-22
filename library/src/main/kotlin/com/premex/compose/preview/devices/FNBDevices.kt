package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * FNB device specifications for Android Compose previews.
 *
 * This extension provides FNB device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.FNB.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.FNB: Any
  get() = object {
      /** FNB P809F52 */
      val P809F52 = "spec:width=720,height=1280,unit=px,dpi=320"

  }
