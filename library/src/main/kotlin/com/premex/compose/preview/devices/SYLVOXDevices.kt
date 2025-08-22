package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SYLVOX device specifications for Android Compose previews.
 *
 * This extension provides SYLVOX device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SYLVOX.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SYLVOX: Any
  get() = object {
      /** SYLVOX bandra */
      val BANDRA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SYLVOX capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SYLVOX kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SYLVOX keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SYLVOX lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
