package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AQUA device specifications for Android Compose previews.
 *
 * This extension provides AQUA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AQUA.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AQUA: Any
  get() = object {
      /** AQUA broadway */
      val BROADWAY = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AQUA daan */
      val DAAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AQUA deto */
      val DETO = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AQUA dupont */
      val DUPONT = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AQUA hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AQUA irvine */
      val IRVINE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AQUA jordan */
      val JORDAN = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** AQUA nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AQUA omonia */
      val OMONIA = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
