package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PROTON device specifications for Android Compose previews.
 *
 * This extension provides PROTON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PROTON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PROTON: Any
  get() = object {
      /** PROTON bandra */
      val BANDRA = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PROTON capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** PROTON kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PROTON keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** PROTON lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

  }
