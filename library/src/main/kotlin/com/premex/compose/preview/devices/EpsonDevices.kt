package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * EPSON device specifications for Android Compose previews.
 *
 * This extension provides EPSON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Epson.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Epson: Any
  get() = object {
      /** EPSON himalaya */
      val HIMALAYA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** EPSON sti6290d101 */
      val STI6290D101 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
