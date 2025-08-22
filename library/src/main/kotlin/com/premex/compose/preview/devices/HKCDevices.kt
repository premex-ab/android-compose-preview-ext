package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HKC device specifications for Android Compose previews.
 *
 * This extension provides HKC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HKC.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HKC: Any
  get() = object {
      /** HKC burbank */
      val BURBANK = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HKC gangbyeon */
      val GANGBYEON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HKC kannai */
      val KANNAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** HKC lakeside */
      val LAKESIDE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** HKC mateo */
      val MATEO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** HKC nagai */
      val NAGAI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** HKC panormou */
      val PANORMOU = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** HKC pioneer */
      val PIONEER = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
