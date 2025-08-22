package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STREAM device specifications for Android Compose previews.
 *
 * This extension provides STREAM device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STREAM.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STREAM: Any
  get() = object {
      /** STREAM B1s */
      val B1S = "spec:width=480,height=800,unit=px,dpi=240"

      /** STREAM B2Plus */
      val B2PLUS = "spec:width=480,height=854,unit=px,dpi=240"

      /** STREAM B3Pro */
      val B3PRO = "spec:width=720,height=1280,unit=px,dpi=320"

      /** STREAM capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** STREAM Everest */
      val EVEREST = "spec:width=720,height=1440,unit=px,dpi=320"

      /** STREAM HT16 */
      val HT16 = "spec:width=720,height=1280,unit=px,dpi=320"

      /** STREAM keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** STREAM MIRROR */
      val MIRROR = "spec:width=640,height=1280,unit=px,dpi=320"

      /** STREAM R10G */
      val R10G = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** STREAM SHARK */
      val SHARK = "spec:width=1080,height=1920,unit=px,dpi=480"

  }
