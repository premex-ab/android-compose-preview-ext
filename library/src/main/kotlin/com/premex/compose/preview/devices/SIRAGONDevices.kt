package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SIRAGON device specifications for Android Compose previews.
 *
 * This extension provides SIRAGON device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SIRAGON.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SIRAGON: Any
  get() = object {
      /** SIRAGON elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** SIRAGON hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SIRAGON lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SIRAGON mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SIRAGON R3_GTV */
      val R3_GTV = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SIRAGON R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SIRAGON SP-5400 */
      val SP_5400 = "spec:width=720,height=1280,unit=px,dpi=300"

      /** SIRAGON SP-6100 */
      val SP_6100 = "spec:width=720,height=1520,unit=px,dpi=280"

      /** SIRAGON stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** SIRAGON zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
