package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Yes device specifications for Android Compose previews.
 *
 * This extension provides Yes device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Yes.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Yes: Any
  get() = object {
      /** Yes dwi765yes */
      val DWI765YES = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Yes M631Y */
      val M631Y = "spec:width=720,height=1280,unit=px,dpi=320"

      /** Yes M685Y4 */
      val M685Y4 = "spec:width=480,height=854,unit=px,dpi=200"

      /** Yes SEI500Y */
      val SEI500Y = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** Yes SEI800Y */
      val SEI800Y = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
