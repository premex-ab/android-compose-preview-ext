package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * INNOVA device specifications for Android Compose previews.
 *
 * This extension provides INNOVA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Innova.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Innova: Any
  get() = object {
      /** INNOVA capitolhill */
      val CAPITOLHILL = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INNOVA elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** INNOVA hanyang */
      val HANYANG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INNOVA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INNOVA kenton */
      val KENTON = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INNOVA keoneae */
      val KEONEAE = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INNOVA lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INNOVA lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** INNOVA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INNOVA nippori */
      val NIPPORI = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INNOVA stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** INNOVA zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
