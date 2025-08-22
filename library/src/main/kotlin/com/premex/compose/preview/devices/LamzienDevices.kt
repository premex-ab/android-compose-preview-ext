package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LAMZIEN device specifications for Android Compose previews.
 *
 * This extension provides LAMZIEN device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Lamzien.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Lamzien: Any
  get() = object {
      /** LAMZIEN LAMZIEN_P2 */
      val LAMZIEN_P2 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
