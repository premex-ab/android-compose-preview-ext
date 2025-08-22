package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * MOTOROLA device specifications for Android Compose previews.
 *
 * This extension provides MOTOROLA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Motorola.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Motorola: Any
  get() = object {
      /** MOTOROLA hayward */
      val HAYWARD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MOTOROLA hongkong */
      val HONGKONG = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MOTOROLA mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MOTOROLA R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** MOTOROLA stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** MOTOROLA zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
